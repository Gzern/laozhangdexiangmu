package matlab.frame;

import com.alibaba.fastjson.JSONObject;
import matlab.project.NonCooperativeGame;
import matlab.util.Constant;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class NonCooperativeGameFrame extends AbstractProjectFrame {


    /**
     * 对于每个项目 布局不同的按钮
     */
    public void initLayout() {
        this.setTitle(Constant.NON_COOPERATIVE_GAME_FRAME);

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();


        /**
         * 添加相应项目功能
         */
        JButton button1 = new JButton("演示程序一");
        JButton button2 = new JButton("演示程序二");
        JButton button3 = new JButton("演示程序三");
        JButton button4 = new JButton("参数导出");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                int n = Integer.parseInt(getJTextField().getText());
                JSONObject paramsJSONObject = getParamsJSONObject();
                NonCooperativeGame.getInstance().spectrumAllocate(n, paramsJSONObject);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                int n = Integer.parseInt(getJTextField().getText());
                JSONObject paramsJSONObject = getParamsJSONObject();
                NonCooperativeGame.getInstance().spectrumRuProfit(n, paramsJSONObject);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                int n = Integer.parseInt(getJTextField().getText());
                JSONObject paramsJSONObject = getParamsJSONObject();
                NonCooperativeGame.getInstance().spectrumPuProfit(n, paramsJSONObject);
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                String filePath = "C:\\Users\\king\\Desktop\\";
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
