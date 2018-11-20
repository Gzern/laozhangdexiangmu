package matlab.button.surface;

import matlab.button.AbstractCustomButton;
import matlab.frame.NonCooperativeGameFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class NonCooperativeGameButton extends AbstractCustomButton {
    @Autowired
    private NonCooperativeGameFrame nonCooperativeGameFrame;

    protected void addListener() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nonCooperativeGameFrame.setVisible(true);
                NonCooperativeGameButton.this.getMatFrame().setVisible(false);
            }
        });
    }
}
