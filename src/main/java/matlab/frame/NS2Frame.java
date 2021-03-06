package matlab.frame;

import matlab.Listener.CheckActionListener;
import matlab.project.NS2;
import matlab.util.Constant;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
@Scope("prototype")
public class NS2Frame extends AbstractProjectFrame {

    private String dirName;
    private String type;

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public void setType(String type) {
        this.type = type;
    }

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
        JButton button1 = new JButton("双网络拓扑(0%)");
        JButton button2 = new JButton("NS2(0%)");
        JButton button3 = new JButton("双网络拓扑(50%)");
        JButton button4 = new JButton("NS2(50%)");
        JButton button5 = new JButton("双网络拓扑(100%)");
        JButton button6 = new JButton("NS2(100%)");
        JButton button7 = new JButton("三网络拓扑(0%)");
        JButton button8 = new JButton("NS2(0%)");
        JButton button9 = new JButton("三网络拓扑(50%)");
        JButton button10 = new JButton("NS2(50%)");
        JButton button11 = new JButton("三网络拓扑(100%)");
        JButton button12 = new JButton("NS2(100%)");


        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel(dirName, 2, "0", type);
            }
        });
        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation(dirName, 2, "0", type);
            }
        });
        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel(dirName, 2, "0.5", type);
            }
        });
        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation(dirName, 2, "0.5", type);
            }
        });
        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel(dirName, 2, "1", type);
            }
        });
        button6.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation(dirName, 2, "1", type);
            }
        });
        button7.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel(dirName, 3, "0", type);
            }
        });
        button8.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation(dirName, 3, "0", type);
            }
        });
        button9.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel(dirName, 3, "0.5", type);
            }
        });
        button10.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation(dirName, 3, "0.5", type);
            }
        });
        button11.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkTopologyModel(dirName, 3, "1", type);
            }
        });
        button12.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.networkCommunicationSimulation(dirName, 3, "1", type);
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
        contentPane.add(button9);
        contentPane.add(button10);
        contentPane.add(button11);
        contentPane.add(button12);


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

        springLayout.putConstraint(SpringLayout.NORTH, button9, 390, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button9, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button10, 430, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button10, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button11, 470, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button11, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button12, 510, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button12, -50, SpringLayout.EAST, contentPane);

    }

}
