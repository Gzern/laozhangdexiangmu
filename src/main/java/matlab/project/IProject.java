package matlab.project;

import com.alibaba.fastjson.JSONObject;

public interface IProject {

    /**
     * 执行各个项目的matlab程序
     *
     * @param fileName         matlab文件名
     * @param paramsJSONObject GUI输入参数
     */
    void executeMatlab(String fileName, JSONObject paramsJSONObject);

    /**
     * 执行各个项目的图片
     *
     * @param fileName
     */
    void executePic(String fileName);

    /**
     * 执行各个项目NS2
     *
     * @param fileName
     */
    void executeNS2(String fileName);

}
