package matlab.surface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {

    @Autowired
    private MatFrame frame;

    public void start() {
        // 设置窗体可见 运行窗体程序
        frame.setVisible(true);
    }
}
