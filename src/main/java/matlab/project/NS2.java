package matlab.project;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static matlab.util.SimulationName.*;

public class NS2 extends AbstractProject {

    //每个项目对应的参数
    private static final List<String> paramsList;

    static {
        //参数列表
        paramsList = new ArrayList<String>();
        /*paramsList.add("afa");
        paramsList.add("prices");
        paramsList.add("wn");*/
    }

    public static NS2 getInstance() {
        return SingleTon.ns2;
    }


    public void networkTopologyModel_1() {
        executePic(NS2_NETWORK_TOPOLOGY_MODEL_1_PIC);
    }

    public void networkTopologyModel_2() {
        executePic(NS2_NETWORK_TOPOLOGY_MODEL_2_PIC);
    }

    public void networkTopologyModel_3() {
        executePic(NS2_NETWORK_TOPOLOGY_MODEL_3_PIC);
    }

    public void networkCommunicationSimulation_1() {
        executeNS2(NS2_NETWORK_COMMUNICATION_SIMULATION_1_TCL);
    }

    public void networkCommunicationSimulation_2() {
        executeNS2(NS2_NETWORK_COMMUNICATION_SIMULATION_2_TCL);
    }

    public void networkCommunicationSimulation_3() {
        executeNS2(NS2_NETWORK_COMMUNICATION_SIMULATION_3_TCL);
    }

    public void generateResultData_1() {
        String command = "gnuplot " + NS2_GENEATE_RESULT_DATA_1_POLT;
        execute(command);
    }

    public void generateResultData_2() {
        String command = "gnuplot " + NS2_GENEATE_RESULT_DATA_2_POLT;
        execute(command);
    }

    public void systemCapacity() {
        executePic(NS2_SYSTEM_CAPACITY_PIC);
    }

    public void connectionRate() {
        executePic(NS2_CONNECTION_RATE_PIC);
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
     * 系统容载量
     *
     * @param paramsJSONObject
     */
    public void spectrumSystemCapacity(JSONObject paramsJSONObject) {
        executeMatlab(NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY, paramsJSONObject);
    }

    /**
     * 系统容载量 PIC
     */
    public void spectrumSystemCapacityPic() {
        executePic(NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY_PIC);
    }

    /**
     * 仿真场景
     */
    public void spectrumScenarioPic() {
        executePic(NON_COOPERATIVE_GAME_SPECTRUM_SCENARIO_PIC);
    }

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static NS2 ns2 = new NS2();
    }
}
