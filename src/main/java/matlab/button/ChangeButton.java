package matlab.button;

import matlab.frame.NonCooperativeGameFrame;
import matlab.surface.MatFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ChangeButton extends AbstractCustomButton {

    @Autowired
    private NonCooperativeGameFrame nonCooperativeGameFrame;

    @Autowired
    private MatFrame matFrame;

    protected void addListener() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nonCooperativeGameFrame.setVisible(true);
                matFrame.setVisible(false);
            }
        });
    }
}
