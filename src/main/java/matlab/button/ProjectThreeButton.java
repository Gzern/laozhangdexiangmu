package matlab.button;

import matlab.frame.ProjectThreeFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component("pro3")
public class ProjectThreeButton extends AbstractCustomButton {

    @Autowired
    private ProjectThreeFrame projectThreeFrame;

    protected void addListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                projectThreeFrame.setVisible(true);
                getMatFrame().setVisible(false);
            }
        });
    }

}
