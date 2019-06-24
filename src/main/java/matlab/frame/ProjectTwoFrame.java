package matlab.frame;

import matlab.Listener.CheckActionListener;
import matlab.project.ProjectTwo;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ProjectTwoFrame extends AbstractProjectFrame {

    //添加项目下的button
    @Override
    public void initLayout() {
        this.setTitle(Constant.PROJECT_TWO_FRAME);

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();
        final ProjectTwo projectTwo = ProjectTwo.getInstance();

        /**
         * 添加相应项目功能
         */
        JButton button1 = new JButton("系统容载量(0%)");
        JButton button2 = new JButton("系统容载量(50%)");
        JButton button3 = new JButton("系统容载量(100%)");
        JButton button4 = new JButton("用户接入率(0%)");
        JButton button5 = new JButton("用户接入率(50%)");
        JButton button6 = new JButton("用户接入率(100%)");

        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectTwo.capacity_0(null);
            }
        });
        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectTwo.capacity_0_5(null);
            }
        });
        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectTwo.capacity_1(null);
            }
        });
        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectTwo.connect_0(null);
            }
        });
        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectTwo.connect_0_5(null);
            }
        });
        button6.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectTwo.connect_1(null);
            }
        });

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        contentPane.add(button6);

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

    }
}
