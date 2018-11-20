package matlab.button;

import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class TestButton extends AbstractCustomButton {

    @Override
    public void addListener() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("xxx");
            }
        });
    }

}
