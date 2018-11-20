package matlab.textArea;

import javax.annotation.PostConstruct;
import javax.swing.*;

public abstract class AbstractCustomTextArea extends JTextArea implements ITextArea {

    @PostConstruct
    public abstract void init();
}
