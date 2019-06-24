package matlab.project;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static matlab.util.SimulationName.*;

public class ProjectTwo extends AbstractProject {

    private static final List<String> paramsList;

    static {
        //参数列表
        paramsList = new ArrayList<>();
        /*paramsList.add("afa");
        paramsList.add("prices");
        paramsList.add("wn");*/
    }

    public static ProjectTwo getInstance() {
        return ProjectTwo.SingleTon.projectTwo;
    }


    public void capacity_0(JSONObject paramsJSONObject) {
        executeMatlab(P2_CAPACITY_0, paramsJSONObject);
    }

    public void connect_0(JSONObject paramsJSONObject) {
        executeMatlab(P2_CONNECT_0, paramsJSONObject);
    }


    public void capacity_0_5(JSONObject paramsJSONObject) {
        executeMatlab(P2_CAPACITY_0_5, paramsJSONObject);
    }

    public void connect_0_5(JSONObject paramsJSONObject) {
        executeMatlab(P2_CONNECT_0_5, paramsJSONObject);
    }

    public void capacity_1(JSONObject paramsJSONObject) {
        executeMatlab(P2_CAPACITY_1, paramsJSONObject);
    }

    public void connect_1(JSONObject paramsJSONObject) {
        executeMatlab(P2_CONNECT_1, paramsJSONObject);
    }

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static ProjectTwo projectTwo = new ProjectTwo();
    }
}
