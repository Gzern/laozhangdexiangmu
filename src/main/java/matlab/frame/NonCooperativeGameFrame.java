package matlab.frame;

import matlab.project.NonCooperativeGame;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class NonCooperativeGameFrame extends AbstractProjectFrame {


    /**
     * 对于每个项目 布局不同的按钮
     */
    public void initLayout() {
        this.setTitle(Constant.NON_COOPERATIVE_GAME_FRAME);

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();
        final NonCooperativeGame nonCooperativeGame = NonCooperativeGame.getInstance();

        /**
         * 添加相应项目功能
         */
        JButton button1 = new JButton("Demo 1");
        JButton button2 = new JButton("Demo 2");
        JButton button3 = new JButton("Demo 3");
        JButton button4 = new JButton("Params Export");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                nonCooperativeGame.spectrumAllocate(getParamsJSONObject());
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                nonCooperativeGame.spectrumRuProfit(getParamsJSONObject());
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                nonCooperativeGame.spectrumPuProfit(getParamsJSONObject());
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                /*String filePath = "C:\\Users\\king\\Desktop\\";
                String fileName = "params.txt";
                JSONObject paramsJSONObject = getParamsJSONObject();
                Set<String> keySet = paramsJSONObject.keySet();
                List<String> list = new ArrayList<String>();
                for (String key : keySet) {
                    list.add(new StringBuilder(key).append("=").append(paramsJSONObject.getString(key)).toString());
                }
                try {
                    FileUtils.writeLines(new File(filePath + fileName), list);
                    JOptionPane.showMessageDialog(null, "参数导出完毕!", ""
                            , JOptionPane.PLAIN_MESSAGE);
                } catch (IOException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "参数导出失败，请检查参数配置!", ""
                            , JOptionPane.ERROR_MESSAGE);
                }*/
                //运行NS2仿真
                String command = "ns myaodv.tcl";
                Process process = null;
                try {
                    process = Runtime.getRuntime().exec(command);
                    process.waitFor();
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                    if (null != process) {
                        process.destroy();
                    }
                }
            }
        });


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);


        /**
         * 添加相应项目的布局
         */
        springLayout.putConstraint(SpringLayout.NORTH, button1, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button1, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button2, 110, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button2, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button3, 150, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button3, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button4, 190, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button4, -50, SpringLayout.EAST, contentPane);

    }

}
