package matlab.project;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static matlab.util.SimulationName.SHOW;

public class ProjectThree extends AbstractProject {

    private static final List<String> paramsList;

    static {
        //参数列表
        paramsList = new ArrayList<>();
        /*paramsList.add("afa");
        paramsList.add("prices");
        paramsList.add("wn");*/
    }

    public static ProjectThree getInstance() {
        return SingleTon.projectThree;
    }

    /**
     * @param paramsJSONObject
     */
    public void show(JSONObject paramsJSONObject) {
        executeMatlab(SHOW, paramsJSONObject);
    }


    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static ProjectThree projectThree = new ProjectThree();
    }
}
