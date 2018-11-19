package matlab;

import matlab.surface.Start;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("spring.xml");
        Start start = application.getBean(Start.class);
        start.start();
    }
}
