package lesson_1_dz.javaConfig;

public class Registry {
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
