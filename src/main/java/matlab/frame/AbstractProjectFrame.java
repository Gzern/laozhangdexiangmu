package matlab.frame;

import matlab.surface.MatFrame;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class AbstractProjectFrame extends JFrame implements IProjectFrame {

    @Autowired
    private MatFrame matFrame;

    private JFrame currentFrame;

    @PostConstruct
    protected void init() {
        setDefaultSize();
        setDefaultListeners();
        setCurrentFrame(this);
        initLayout();
    }


    /**
     * 默认Frame界面
     * 居中/大小/设置主表盘
     * 流式布局
     */
    private void setDefaultSize() {
        this.setBounds(400, 200, 800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel();
        this.setContentPane(jPanel);
        this.getContentPane().setLayout(new FlowLayout());
    }

    /**
     * 关闭默认设置为当前项目子窗口，显示主窗口
     */
    private void setDefaultListeners() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                matFrame.setVisible(true);
                currentFrame.setVisible(false);
            }
        });
    }

    public JFrame getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(JFrame currentFrame) {
        this.currentFrame = currentFrame;
    }
}
