package matlab.project;

import com.alibaba.fastjson.JSONObject;
import matlab.util.ErrorUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.*;

import static matlab.util.SimulationName.*;

public abstract class AbstractProject implements IProject {

    /**
     * 根据配置的参数，执行matlab仿真文件
     *
     * @param fileName matlab文件名
     */
    @Override
    public void executeMatlab(String fileName, JSONObject paramsJSONObject) {
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

    @Override
    public void executePic(String filename) {
        execute(new StringBuilder(PIC_COMMAND).append(filename).toString());
    }

    @Override
    public void executeNS2(String filename) {
        execute(new StringBuilder(NS2_COMMAND).append(filename).toString());
    }

    protected void execute(String command) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(command);
            process.waitFor();
        } catch (Exception e1) {
            e1.printStackTrace();
            ErrorUtils.showPicError();
        } finally {
            if (null != process) {
                process.destroy();
            }
        }
    }

    /**
     * 返回matlab仿真参数
     *
     * @param paramsJSONObject
     * @return key:afa=  value:[2 1.5 1]
     */
    private Map<String, String> jSONObject2Params(JSONObject paramsJSONObject) throws Exception {
        Map<String, String> map = new HashMap<>();
        for (String param : getParamsList()) {
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
     * @return 各个项目所需参数列表
     */
    protected abstract List<String> getParamsList();
}
