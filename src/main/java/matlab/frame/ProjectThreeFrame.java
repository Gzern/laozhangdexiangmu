package matlab.frame;

import matlab.Listener.CheckActionListener;
import matlab.project.ProjectThree;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ProjectThreeFrame extends AbstractProjectFrame {

    //添加项目下的button
    @Override
    public void initLayout() {
        this.setTitle(Constant.PROJECT_THREE_FRAME);

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();
        final ProjectThree projectThree = ProjectThree.getInstance();

        /**
         * 添加相应项目功能
         */
        JButton button1 = new JButton("接通率（完全隔离）");
        JButton button2 = new JButton("接通率（交互50%）");
        JButton button3 = new JButton("接通率（完全重叠）");
        JButton button4 = new JButton("系统容载量（完全隔离）");
        JButton button5 = new JButton("系统容载量（交互50%）");
        JButton button6 = new JButton("系统容载量（完全重叠）");

        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectThree.compareCR_0();
            }
        });

        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectThree.compareCR_0_5();
            }
        });

        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectThree.compareCR_1();
            }
        });

        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectThree.compareSC_0();
            }
        });

        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectThree.compareSC_0_5();
            }
        });

        button6.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                projectThree.compareSC_1();
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
