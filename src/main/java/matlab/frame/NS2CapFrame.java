package matlab.frame;

import matlab.Listener.CheckActionListener;
import matlab.project.NS2;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class NS2CapFrame extends AbstractProjectFrame {


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
        JButton button1 = new JButton("双网络系统容载量(0%)");
        JButton button2 = new JButton("双网络系统容载量(50%)");
        JButton button3 = new JButton("双网络系统容载量(100%)");
        JButton button4 = new JButton("三网络系统容载量(0%)");
        JButton button5 = new JButton("三网络系统容载量(50%)");
        JButton button6 = new JButton("三网络系统容载量(100%)");
        JButton button7 = new JButton("双网络接通率(0%)");
        JButton button8 = new JButton("双网络接通率(50%)");
        JButton button9 = new JButton("双网络接通率(100%)");
        JButton button10 = new JButton("三网络接通率(0%)");
        JButton button11 = new JButton("三网络接通率(50%)");
        JButton button12 = new JButton("三网络接通率(100%)");


        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity(2, 0);
            }
        });
        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity(2, 50);
            }
        });
        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity(2, 100);
            }
        });
        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity(3, 0);
            }
        });
        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity(3, 50);
            }
        });
        button6.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.systemCapacity(3, 100);
            }
        });
        button7.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate(2, 0);
            }
        });
        button8.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate(2, 50);
            }
        });
        button9.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate(2, 100);
            }
        });
        button10.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate(3, 0);
            }
        });
        button11.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate(3, 50);
            }
        });
        button12.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                ns2.connectionRate(3, 100);
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
