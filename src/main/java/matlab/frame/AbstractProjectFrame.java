package matlab.frame;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import matlab.surface.MatFrame;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public abstract class AbstractProjectFrame extends JFrame implements IProjectFrame {

    @Autowired
    private MatFrame matFrame;
    @Autowired
    private JScrollPane jScrollPane;

    private JFrame currentFrame;
    private JTextField jTextField;
    private JSONObject paramsJSONObject;

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
     * 关闭
     * 默认设置为关闭当前项目子窗口，显示主窗口
     */
    private void setDefaultListeners() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    matFrame.setVisible(true);
                    currentFrame.setVisible(false);
                } finally {
                    clearParams();
                }
            }
        });
    }

    private void setDefaultInitLayout() {
        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();

        JLabel jLabel1 = new JLabel("Number of parameters(Required)");
        JLabel jLabel2 = new JLabel("Parameter Input:(Optional)");
        JLabel jLabel3 = new JLabel("Parameter Import(Optional)");
        jTextField = new JTextField(5);

        JButton button4 = new JButton("Import parameter configuration file");

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int res = jFileChooser.showDialog(new JLabel(), "Select parameter configuration file");
                if (res != JFileChooser.APPROVE_OPTION) {
                    return;
                }
                File selectedFile = jFileChooser.getSelectedFile();
                try {
                    String text = FileUtils.readFileToString(selectedFile);
                    getJTextArea().setText(text);
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(null
                            , "Parameter file import failed, please check file format!", ""
                            , JOptionPane.ERROR_MESSAGE);
                }
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
        springLayout.putConstraint(SpringLayout.WEST, jTextField, 240, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, jLabel2, 50, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jLabel2, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, jScrollPane, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jScrollPane, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.SOUTH, jLabel3, -90, SpringLayout.SOUTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, jLabel3, 50, SpringLayout.WEST, contentPane);

        springLayout.putConstraint(SpringLayout.SOUTH, button4, -50, SpringLayout.SOUTH, contentPane);
        springLayout.putConstraint(SpringLayout.WEST, button4, 50, SpringLayout.WEST, contentPane);
    }

    /**
     * 清空参数配置区
     */
    private void clearParams() {
        jTextField.setText("");
        JTextArea area = getJTextArea();
        if (area != null) {
            area.setText("");
        }
    }

    /**
     * 校验参数配置区
     */
    protected final boolean checkParams() {
        String numOfParams = jTextField.getText();
        if (!StringUtils.isNumeric(numOfParams) || Integer.parseInt(numOfParams) < 0) {
            JOptionPane.showMessageDialog(null
                    , "The number of parameters is invalid. Please enter the correct number!", ""
                    , JOptionPane.ERROR_MESSAGE);
            return false;
        }
        JTextArea area = getJTextArea();
        if (area != null) {
            String params = area.getText();
            try {
                paramsJSONObject = JSON.parseObject(params);
                if (paramsJSONObject == null) {
                    paramsJSONObject = new JSONObject();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null
                        , "The parameter input format is invalid. Please enter the correct parameter format!"
                        , "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (paramsJSONObject.keySet().size() != Integer.parseInt(numOfParams)) {
                JOptionPane.showMessageDialog(null
                        , "The number of parameters does not match the parameter input. " +
                                "Please enter the correct parameters and their number!", ""
                        , JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private JTextArea getJTextArea() {
        Component[] components = jScrollPane.getViewport().getComponents();
        for (Component component : components) {
            if (component instanceof JTextArea) {
                JTextArea area = ((JTextArea) component);
                return area;
            }
        }
        return null;
    }

    private void setCurrentFrame(JFrame currentFrame) {
        this.currentFrame = currentFrame;
    }

//    protected JTextField getJTextField() {
//        return jTextField;
//    }

    protected JSONObject getParamsJSONObject() {
        return paramsJSONObject;
    }
}
