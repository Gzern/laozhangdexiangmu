package matlab.frame;

import matlab.Listener.CheckActionListener;
import matlab.project.NS2;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class NS2Frame extends AbstractProjectFrame {


    /**
     * 对于每个项目 布局不同的按钮
     */
    public void initLayout() {
        this.setTitle(Constant.NS2_FRAME);

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();
        final NS2 ns2 = NS2.getInstance();

        /**
         * 添加相应项目功能
         */
        JButton button1 = new JButton("网络拓扑(六边形)");
        JButton button2 = new JButton("NS2(六边形)");
        JButton button3 = new JButton("网络拓扑(2)");
        JButton button4 = new JButton("NS2(2)");
        JButton button5 = new JButton("网络拓扑(3)");
        JButton button6 = new JButton("NS2(3)");

        JButton button7 = new JButton("接通率");
        JButton button8 = new JButton("系统容载量");
//        JButton button9 = new JButton("仿真场景说明");

        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel_1();
            }
        });
        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation_1();
            }
        });
        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel_2();
            }
        });
        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation_2();
            }
        });
        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel_3();
            }
        });
        button6.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation_3();
            }
        });
        button7.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate();
            }
        });
        button8.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity();
            }
        });


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        contentPane.add(button6);
        contentPane.add(button7);
        contentPane.add(button8);


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

        springLayout.putConstraint(SpringLayout.NORTH, button5, 230, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button5, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button6, 270, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button6, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button7, 310, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button7, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button8, 350, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button8, -50, SpringLayout.EAST, contentPane);

    }

}
