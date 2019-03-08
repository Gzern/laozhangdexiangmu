package matlab.textField;

import org.springframework.stereotype.Component;

@Component
public class TestTextField extends AbstractCustomTextField {

    public TestTextField() {
        this.setColumns(50);
    }

}
