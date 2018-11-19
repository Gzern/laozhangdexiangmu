package matlab.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Component
public class SpringBeanHolder implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public <T> List<T> getBeansByInterface(Class<T> clazz) {
        List<T> list = new ArrayList<T>();
        Map<String, T> beans = applicationContext.getBeansOfType(clazz);
        for (String s : beans.keySet()) {
            list.add(applicationContext.getBean(s, clazz));
        }
        return list;
    }
}
