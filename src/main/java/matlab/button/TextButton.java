package matlab.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class TextButton extends AbstractCustomButton {

    @Autowired
    private JTextArea jTextArea;
    @Autowired
    private JTextField jTextField;

    protected void addListener() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();
                jTextField.setText("");
                jTextArea.setText(text);
            }
        });
    }
}
