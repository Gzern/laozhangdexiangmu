package matlab.button;

import matlab.surface.MatFrame;
import matlab.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.lang.reflect.Field;

public abstract class AbstractCustomButton extends JButton implements IButtonFrame {

    @Autowired
    private MatFrame matFrame;

    public MatFrame getMatFrame() {
        return matFrame;
    }

    @PostConstruct
    protected void init() {
        initButtonName();
        addListener();
    }

    protected abstract void addListener();

    /**
     * 按各个Button类名在{@link Constant}中对应Button名字
     */
    private void initButtonName() {
        Class<? extends AbstractCustomButton> clazz = this.getClass();
        String simpleName = clazz.getSimpleName();
        String buttonName = className2ButtonName(simpleName);
        Class<Constant> constantClass = Constant.class;
        try {
            Field field = constantClass.getField(buttonName);
            this.setText(field.get(null).toString());
        } catch (Exception e) {
            this.setText(buttonName);
        }
    }

    private String className2ButtonName(String className) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i = 1; i <= className.length(); i++) {
            if (i == className.length() || Character.isUpperCase(className.charAt(i))) {
                sb.append(className.substring(start, i).toUpperCase());
                if (i != className.length()) {
                    sb.append(Constant.UNDER_LINE);
                }
                start = i;
            }
        }
        return sb.toString();
    }

}
