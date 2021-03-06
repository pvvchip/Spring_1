package lesson_1_dz.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {
    @Autowired()
    @Qualifier("doctor")
    private IDoctor doctor;

    public IDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }

    public void doCard() {
        System.out.println("Получите карту.");
        doctor.heal();
    }
}
