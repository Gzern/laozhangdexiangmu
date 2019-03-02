/*
package matlab.project;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWNumericArray;
import spectrum.Spectrum;
import spectrum_pu_Profit.PuProfit;
import spectrum_ru_Profit.RuProfit;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class NonCooperativeGame1 {

    private static final List<String> paramsList;

    static {
        paramsList = new ArrayList<String>();
        paramsList.add("afa");
        paramsList.add("prices");
        paramsList.add("wn");
    }

    public static NonCooperativeGame1 getInstance() {
        return SingleTon.nonCooperativeGame1;
    }

    */
/**
 * 频谱分配
 *
 * @param n                参数个数
 * @param paramsJSONObject 参数
 *//*

    public void spectrumAllocate(int n, JSONObject paramsJSONObject) {
        Object[] params = JSONObject2Object(n, paramsJSONObject);
        try {
            Spectrum spectrum = new Spectrum();
            spectrum.spectrum(params);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "参数输入配置不正确,请按正确的参数进行配置!", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            for (int i = 0; i < params.length; i++) {
                MWArray.disposeArray(params[i]);
            }
        }
    }

    public void spectrumRuProfit(int n, JSONObject paramsJSONObject) {
        Object[] params = JSONObject2Object(n, paramsJSONObject);
        try {
            RuProfit ruProfit = new RuProfit();
            ruProfit.spectrum_ru_Profit(params);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "参数输入配置不正确,请按正确的参数进行配置!", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            for (int i = 0; i < params.length; i++) {
                MWArray.disposeArray(params[i]);
            }
        }
    }

    public void spectrumPuProfit(int n, JSONObject paramsJSONObject) {
        Object[] params = JSONObject2Object(n, paramsJSONObject);
        try {
            PuProfit puProfit = new PuProfit();
            puProfit.spectrum_pu_Profit(params);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "参数输入配置不正确,请按正确的参数进行配置!", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            for (int i = 0; i < params.length; i++) {
                MWArray.disposeArray(params[i]);
            }
        }
    }

    private Object[] JSONObject2Object(int n, JSONObject paramsJSONObject) {
        Object[] params = new Object[n];
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
        return params;
    }

    private static class SingleTon {
        private static NonCooperativeGame1 nonCooperativeGame1 = new NonCooperativeGame1();
    }
}
*/
