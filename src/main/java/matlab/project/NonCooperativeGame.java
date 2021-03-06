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
        /*paramsList.add("afa");
        paramsList.add("prices");
        paramsList.add("wn");*/
    }

    public static NonCooperativeGame getInstance() {
        return SingleTon.nonCooperativeGame;
    }


    /**
     * 系统容载量
     *
     * @param paramsJSONObject
     */
    public void spectrumSystemCapacity(JSONObject paramsJSONObject) {
        executeMatlab(NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY_CONTRAST, paramsJSONObject);
    }

    /**
     * 系统容载量对比图 PIC
     */
    public void spectrumSystemCapacityPic() {
        executePic(NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY_CONTRAST_PIC);
    }


    /**
     * 系统容载量对比图 0 PIC
     */
    public void spectrumSystemCapacity0Pic() {
        executePic(SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0_PIC);
    }

    public void spectrumSystemCapacity0(JSONObject object) {
        executeMatlab(SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0, object);
    }


    /**
     * 系统容载量对比图 0.5 PIC
     */
    public void spectrumSystemCapacity0_5Pic() {
        executePic(SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0_5_PIC);
    }

    public void spectrumSystemCapacity0_5(JSONObject object) {
        executeMatlab(SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0_5, object);
    }

    /**
     * 系统容载量对比图 1 PIC
     */
    public void spectrumSystemCapacity1Pic() {
        executePic(SPECTRUM_SYSTEM_CAPACITY_CONTRAST_1_PIC);
    }

    public void spectrumSystemCapacity1(JSONObject object) {
        executeMatlab(SPECTRUM_SYSTEM_CAPACITY_CONTRAST_1, object);
    }

    /**
     * 系统接通率
     */
    public void spectrumConnectionRate(JSONObject paramsJSONObject) {
        executeMatlab(NON_COOPERATIVE_GAME_SPECTRUM_CONNECTION_RATE, paramsJSONObject);
    }

    /**
     * 系统接通率 PIC
     */
    public void spectrumConnectionRatePic() {
        executePic(NON_COOPERATIVE_GAME_SPECTRUM_CONNECTION_RATE_PIC);
    }

    /**
     * 仿真场景分离
     */
    public void separationPic() {
        executePic(SPECTRUM_SCENARIO_SEPARATION_PIC);
    }

    /**
     * 仿真场景渗透
     */
    public void penetrationPic() {
        executePic(SPECTRUM_SCENARIO_PENETRATION_PIC);
    }

    /**
     * 仿真场景融合
     */
    public void fusionPic() {
        executePic(SPECTRUM_SCENARIO_FUSION_PIC);
    }

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static NonCooperativeGame nonCooperativeGame = new NonCooperativeGame();
    }
}
