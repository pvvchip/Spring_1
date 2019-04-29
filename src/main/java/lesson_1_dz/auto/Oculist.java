package lesson_1_dz.auto;

import org.springframework.stereotype.Component;

@Component("doctor")
public class Oculist implements IDoctor {
    public void heal() {
        System.out.println("Лечит окулист.");
    }
}
