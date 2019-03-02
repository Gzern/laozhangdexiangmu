package matlab.project;

import com.alibaba.fastjson.JSONObject;
import matlab.util.ErrorUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.*;

import static matlab.util.SimulationName.*;

public class NonCooperativeGame {

    private static final List<String> paramsList;

    static {
        //参数列表
        paramsList = new ArrayList<String>();
        paramsList.add("afa");
        paramsList.add("prices");
        paramsList.add("wn");
    }

    public static NonCooperativeGame getInstance() {
        return SingleTon.nonCooperativeGame;
    }

    /**
     * 频谱分配
     *
     * @param paramsJSONObject
     */
    public void spectrumAllocate(JSONObject paramsJSONObject) {
        executeMatlab(NON_COOPERATIVE_GAME_SPECTRUM_ALLOCATE, paramsJSONObject);
    }

    /**
     * 认知用户效用收益
     *
     * @param paramsJSONObject
     */
    public void spectrumRuProfit(JSONObject paramsJSONObject) {
        executeMatlab(NON_COOPERATIVE_GAME_SPECTRUM_RU_PROFIT, paramsJSONObject);
    }

    /**
     * 授权用户效用收益
     *
     * @param paramsJSONObject
     */
    public void spectrumPuProfit(JSONObject paramsJSONObject) {
        executeMatlab(NON_COOPERATIVE_GAME_SPECTRUM_PU_PROFIT, paramsJSONObject);
    }

    /**
     * 返回matlab仿真参数
     *
     * @param paramsJSONObject
     * @return key:afa=  value:[2 1.5 1]
     */
    private Map<String, String> jSONObject2Params(JSONObject paramsJSONObject) throws Exception {
        Map<String, String> map = new HashMap<>();
        for (String param : paramsList) {
            String value = paramsJSONObject.getString(param);
            if (null == value) {
                //matlab所需参数未配置
                throw new Exception();
            }
            map.put(new StringBuilder(param).append("=").toString(), value);
        }
        return map;
    }

    /**
     * 根据配置的参数，执行matlab仿真文件
     *
     * @param fileName
     */
    private void executeMatlab(String fileName, JSONObject paramsJSONObject) {
        Process process = null;
        try {
            Map<String, String> params = jSONObject2Params(paramsJSONObject);
            File file = new File(fileName);
            List<String> result = new LinkedList<>();
            Set<String> keySet = params.keySet();
            for (String line : FileUtils.readLines(file)) {
                Iterator<String> iterator = keySet.iterator();
                while (iterator.hasNext()) {
                    String nextKey = iterator.next();
                    if (line.contains(nextKey)) {
                        //覆写当前值x=[2 1.5 1];
                        line = new StringBuilder(nextKey).append(params.get(nextKey)).append(";").toString();
                        iterator.remove();
                    }
                }
                result.add(line);
            }
            FileUtils.writeLines(file, result);
            process = Runtime.getRuntime().exec(new StringBuilder(MATLAB_COMMAND)
                    .append(fileName, 0, fileName.lastIndexOf(".")).toString());
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            ErrorUtils.showError();
        } finally {
            if (process != null) {
                process.destroy();
            }
        }
    }

    private static class SingleTon {
        private static NonCooperativeGame nonCooperativeGame = new NonCooperativeGame();
    }
}
