package matlab.frame;

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

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();


        JButton button1 = new JButton("演示程序一");
        JButton button2 = new JButton("演示程序二");
        JButton button3 = new JButton("演示程序三");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);


        springLayout.putConstraint(SpringLayout.NORTH, button1, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button1, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button2, 110, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button2, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button3, 150, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button3, -50, SpringLayout.EAST, contentPane);

    }

}
