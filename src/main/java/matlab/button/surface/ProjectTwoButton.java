package matlab.button.surface;

import matlab.button.AbstractCustomButton;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ProjectTwoButton extends AbstractCustomButton {


    protected void addListener() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
