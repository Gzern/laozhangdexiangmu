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

    /**
     * @param paramsJSONObject
     */
    public void channel(JSONObject paramsJSONObject) {
        executeMatlab(HU_GUANG_YAO_1, paramsJSONObject);
    }

    /**
     * @param paramsJSONObject
     */
    public void powerAllocation(JSONObject paramsJSONObject) {
        executeMatlab(HU_GUANG_YAO_2, paramsJSONObject);
    }

    /**
     * @param paramsJSONObject
     */
    public void resource(JSONObject paramsJSONObject) {
        executeMatlab(HU_GUANG_YAO_3, paramsJSONObject);
    }

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static ProjectTwo projectTwo = new ProjectTwo();
    }
}
