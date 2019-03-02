package matlab.util;

import javax.swing.*;

public class ErrorUtils {

    public static void showError() {
        JOptionPane.showMessageDialog(null
                , "Params error,Please check the parameter configuration!", ""
                , JOptionPane.ERROR_MESSAGE);
    }

}
