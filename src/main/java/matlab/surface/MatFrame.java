package matlab.surface;

import matlab.util.Constant;
import matlab.util.SpringBeanHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MatFrame extends JFrame {

    @Autowired
    private SpringBeanHolder springBeanHolder;
    private LayoutManager gridLayout;
    private Panel panel;


    @PostConstruct
    private void init() {
        this.setTitle(Constant.FRAME_NAME);
        this.setCustomLayout();
        this.addListener();
        this.addButton();
        this.addTextArea();
        this.addTextField();
        this.initLayout();
        //执行窗体退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setCustomLayout() {
        this.setBounds(400, 200, 800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        panel = new Panel();
        this.setContentPane(panel);
        gridLayout = new GridLayout(6, 6);
        this.getContentPane().setLayout(gridLayout);
    }

    private void addListener() {
    }

    private void addButton() {
        /*List<IButtonFrame> beansByInterface = springBeanHolder.getBeansByInterface(IButtonFrame.class);
        for (IButtonFrame buttonFrame : beansByInterface) {
            panel.add((JButton) buttonFrame);
        }*/
        panel.add(springBeanHolder.getBeanByName("pro1", JButton.class));
        panel.add(springBeanHolder.getBeanByName("pro2", JButton.class));
        panel.add(springBeanHolder.getBeanByName("pro3", JButton.class));
        panel.add(springBeanHolder.getBeanByName("pro4", JButton.class));
        panel.add(springBeanHolder.getBeanByName("pro5", JButton.class));
        panel.add(springBeanHolder.getBeanByName("pro6", JButton.class));
        panel.add(springBeanHolder.getBeanByName("pro7", JButton.class));
    }

    private void addTextArea() {
    }

    private void addTextField() {
    }

    private void initLayout() {
        /**
         * TEXT
         */
        /*springLayout.putConstraint(SpringLayout.NORTH, jTextField, 10, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.WEST, jTextField, 10, SpringLayout.WEST, panel);*/

        /*springLayout.putConstraint(SpringLayout.NORTH, jScrollPane, 70, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.WEST, jScrollPane, 10, SpringLayout.WEST, panel);*/

        /**
         * BUTTON
         */
        /*springLayout.putConstraint(SpringLayout.NORTH, testButton, 10, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.EAST, testButton, -20, SpringLayout.EAST, panel);

        springLayout.putConstraint(SpringLayout.NORTH, textButton, 70, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.EAST, textButton, -20, SpringLayout.EAST, panel);

        springLayout.putConstraint(SpringLayout.NORTH, nonCooperativeGameButton, 70, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.WEST, nonCooperativeGameButton, 20, SpringLayout.WEST, panel);*/
    }

}
