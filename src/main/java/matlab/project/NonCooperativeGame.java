package matlab.project;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWNumericArray;
import spectrum.Spectrum;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class NonCooperativeGame {

    private static final List<String> paramsList;

    static {
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
     * @param n                参数个数
     * @param paramsJSONObject 参数
     */
    public void spectrumAllocate(int n, JSONObject paramsJSONObject) {
        Object[] params = new Object[n];
        try {
            Spectrum spectrum = new Spectrum();
            for (int i = 0; i < params.length; i++) {
                Object o = paramsJSONObject.get(paramsList.get(i));
                if (null == o) throw new RuntimeException();
                if (o instanceof JSONArray) {
                    JSONArray jsonArray = paramsJSONObject.getJSONArray(paramsList.get(i));
                    params[i] = new MWNumericArray(jsonArray.toArray(), MWClassID.DOUBLE);
                } else {
                    params[i] = o;
                }
            }
            spectrum.spectrum(params);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "参数输入配置不正确,请按正确的参数进行配置!", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            for (int i = 0; i < params.length; i++) {
                MWArray.disposeArray(params[i]);
            }
        }
    }

    private static class SingleTon {
        private static NonCooperativeGame nonCooperativeGame = new NonCooperativeGame();
    }
}
