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


    public void networkTopologyModel(String dirName, int num, String beta, String type) {
        executePic(String.format(HEX_NK_TP_FORMAT, dirName, num, beta, type, num, beta));
    }

    public void networkCommunicationSimulation(String dirName, int num, String beta, String type) {
        executeNS2(String.format(HEX_NK_NS_FORMAT, dirName, num, beta, type, num, beta));
    }


    public void systemCapacity(int num, int beta) {
        executePic(String.format(NS2_SYSTEM_CAPACITY_FORMAT, num, beta));
    }

    public void connectionRate(int num, int beta) {
        executePic(String.format(NS2_CONNECTION_RATE_FORMAT, num, beta));
    }

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static NS2 ns2 = new NS2();
    }
}
