package matlab.frame;

import matlab.project.ProjectThree;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JButton button1 = new JButton("Demo 1");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!checkParams()) {
                    return;
                }
                projectThree.show(getParamsJSONObject());
            }
        });

        contentPane.add(button1);

        /**
         * 添加相应项目的布局
         */
        springLayout.putConstraint(SpringLayout.NORTH, button1, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button1, -50, SpringLayout.EAST, contentPane);

        /*springLayout.putConstraint(SpringLayout.NORTH, button2, 110, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button2, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button3, 150, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button3, -50, SpringLayout.EAST, contentPane);*/

        /*springLayout.putConstraint(SpringLayout.NORTH, button4, 190, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button4, -50, SpringLayout.EAST, contentPane);*/

    }
}
