package matlab.project;

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

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static NS2 ns2 = new NS2();
    }
}
