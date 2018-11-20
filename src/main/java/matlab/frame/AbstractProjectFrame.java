package matlab.frame;

import matlab.surface.MatFrame;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class AbstractProjectFrame extends JFrame implements IProjectFrame {

    @Autowired
    private MatFrame matFrame;
    @Autowired
    private JScrollPane jScrollPane;

    private JFrame currentFrame;

    @PostConstruct
    protected void init() {
        setDefaultSize();
        setDefaultListeners();
        setDefaultInitLayout();
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
        this.getContentPane().setLayout(new SpringLayout());
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

    private void setDefaultInitLayout() {
        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();

        JLabel jLabel1 = new JLabel("参数个数(必选)");
        JLabel jLabel2 = new JLabel("参数输入（格式为参数名:参数值）(可选)");
        JLabel jLabel3 = new JLabel("参数导入(可选)");
        JTextField jTextField = new JTextField(20);

        JButton button4 = new JButton("导入参数配置文件");

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jFileChooser.showDialog(new JLabel(), "选择参数配置文件");
            }
        });

        contentPane.add(jLabel1);
        contentPane.add(jLabel2);
        contentPane.add(jLabel3);
        contentPane.add(jTextField);
        contentPane.add(jScrollPane);
        contentPane.add(button4);


        springLayout.putConstraint(SpringLayout.NORTH, jLabel1, 10, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jLabel1, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, jTextField, 10, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jTextField, 160, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, jLabel2, 50, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jLabel2, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, jScrollPane, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jScrollPane, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.SOUTH, jLabel3, -90, SpringLayout.SOUTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jLabel3, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.SOUTH, button4, -85, SpringLayout.SOUTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, button4, 160, SpringLayout.WEST, contentPane);
    }

    public void setCurrentFrame(JFrame currentFrame) {
        this.currentFrame = currentFrame;
    }
}
