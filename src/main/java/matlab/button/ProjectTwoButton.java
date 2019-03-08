package matlab.button;

import matlab.frame.ProjectTwoFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@DependsOn("pro1")
@Component("pro2")
public class ProjectTwoButton extends AbstractCustomButton {

    @Autowired
    private ProjectTwoFrame projectTwoFrame;

    protected void addListener() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                projectTwoFrame.setVisible(true);
                getMatFrame().setVisible(false);
            }
        });
    }
}
