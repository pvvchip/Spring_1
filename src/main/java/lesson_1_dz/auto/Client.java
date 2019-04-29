package lesson_1_dz.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("Дайте терапевта ...");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("registry", Registry.class);
        registry.doCard();
    }
}
