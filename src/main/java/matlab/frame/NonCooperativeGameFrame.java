package matlab.frame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class NonCooperativeGameFrame extends AbstractProjectFrame {

    @Autowired
    private JScrollPane jScrollPane;

    public void initLayout() {
        this.add(new JLabel("参数个数"));
        this.add(new JTextField(32));
        this.add(new JLabel("参数（参数名：参数值）"));
        this.getContentPane().add(jScrollPane);
        JButton button = new JButton("演示程序一");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.getContentPane().add(button);
    }
}
