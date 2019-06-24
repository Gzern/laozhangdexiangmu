package matlab.button;

import matlab.frame.NS2Frame;
import matlab.util.SimulationName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component("pro6")
public class NS2SquButton extends AbstractCustomButton {

    @Autowired
    private NS2Frame ns2Frame;

    @PostConstruct
    public void before() {
        ns2Frame.setDirName(SimulationName.SQU);
        ns2Frame.setType("S");
    }

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
