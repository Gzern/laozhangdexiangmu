package matlab.project;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static matlab.util.SimulationName.*;

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

    /**
     * 接通率 完全隔离
     */
    public void compareCR_0() {
        executePic(COMPARE_CONNECTION_RATE_0);
    }

    /**
     * 接通率 交互50%
     */
    public void compareCR_0_5() {
        executePic(COMPARE_CONNECTION_RATE_0_5);
    }

    /**
     * 接通率 完全重叠
     */
    public void compareCR_1() {
        executePic(COMPARE_CONNECTION_RATE_1);
    }


    /**
     * 系统容载量 完全隔离
     */
    public void compareSC_0() {
        executePic(COMPARE_SYSTEM_CAPACITY_0);
    }

    /**
     * 系统容载量 交互50%
     */
    public void compareSC_0_5() {
        executePic(COMPARE_SYSTEM_CAPACITY_0_5);
    }

    /**
     * 系统容载量 完全重叠
     */
    public void compareSC_1() {
        executePic(COMPARE_SYSTEM_CAPACITY_1);
    }

    @Override
    public List<String> getParamsList() {
        return paramsList;
    }

    private static class SingleTon {
        private static ProjectThree projectThree = new ProjectThree();
    }
}
