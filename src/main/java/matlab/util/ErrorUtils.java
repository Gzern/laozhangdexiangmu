package matlab.util;

import javax.swing.*;

public class ErrorUtils {

    public static void showError() {
        JOptionPane.showMessageDialog(null, "参数错误，请检查参数配置！", ""
                , JOptionPane.ERROR_MESSAGE);
    }

    public static void showSimuInfo() {
        JOptionPane.showMessageDialog(null, "仿真运行中...", ""
                , JOptionPane.PLAIN_MESSAGE);
    }

}
