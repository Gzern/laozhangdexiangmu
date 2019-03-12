package matlab.frame;

import matlab.project.ProjectTwo;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JButton button1 = new JButton("Demo 1");
        JButton button2 = new JButton("Demo 2");
        JButton button3 = new JButton("Demo 3");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                projectTwo.channel(getParamsJSONObject());
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                projectTwo.powerAllocation(getParamsJSONObject());
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                projectTwo.resource(getParamsJSONObject());
            }
        });

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);

        /**
         * 添加相应项目的布局
         */
        springLayout.putConstraint(SpringLayout.NORTH, button1, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button1, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button2, 110, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button2, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button3, 150, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button3, -50, SpringLayout.EAST, contentPane);

        /*springLayout.putConstraint(SpringLayout.NORTH, button4, 190, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button4, -50, SpringLayout.EAST, contentPane);*/

    }
}
