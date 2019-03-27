package matlab.button;

import matlab.frame.NS2Frame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@DependsOn("pro3")
@Component("pro4")
public class NS2Button extends AbstractCustomButton {

    @Autowired
    private NS2Frame ns2Frame;

    protected void addListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ns2Frame.setVisible(true);
                getMatFrame().setVisible(false);
            }
        });
    }
}
