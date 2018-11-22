package matlab.textArea;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

@Configuration
public class TestTextArea extends AbstractCustomTextArea {


    @Override
    public void init() {
        this.setColumns(30);
        this.setRows(20);
        this.setLineWrap(false);
        jScrollPane().setViewportView(this);
        jScrollPane().setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    @Bean
    public JScrollPane jScrollPane() {
        JScrollPane jScrollPane = new JScrollPane();
        return jScrollPane;
    }
}
