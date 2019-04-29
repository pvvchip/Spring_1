package lesson_1_dz.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("Дайте доктора ...");
        ApplicationContext context = new ClassPathXmlApplicationContext("config_xml.xml");
        Registry registry = context.getBean("registry", Registry.class);
        registry.doCard();
    }
}
