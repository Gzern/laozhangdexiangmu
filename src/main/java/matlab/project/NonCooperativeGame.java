package matlab.project;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static matlab.util.SimulationName.*;

public class NonCooperativeGame extends AbstractProject {

    //每个项目对应的参数
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

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static NonCooperativeGame nonCooperativeGame = new NonCooperativeGame();
    }
}
