package matlab.textArea;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.swing.*;

@Configuration
public class TextAreaConfig {

    /**
     * 项目输入参数面板
     *
     * @return
     */
    @Bean
    @Scope("prototype")
    public JScrollPane jScrollPane() {
        JTextArea textArea = new JTextArea();
        textArea.setColumns(30);
        textArea.setRows(20);
        textArea.setLineWrap(false);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(textArea);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        return jScrollPane;
    }
}
