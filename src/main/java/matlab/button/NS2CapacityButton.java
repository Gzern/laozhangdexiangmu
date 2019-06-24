package matlab.button;

import matlab.frame.NS2CapFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component("pro7")
public class NS2CapacityButton extends AbstractCustomButton {

    @Autowired
    private NS2CapFrame ns2CapFrame;


    protected void addListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ns2CapFrame.setVisible(true);
                getMatFrame().setVisible(false);
            }
        });
    }
}
