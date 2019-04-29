package lesson_1_dz.javaConfig;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean(name = "doctor")
    public IDoctor doctor() {
        return new Oculist();
    }

    @Bean(name = "registry")
    public Registry registry(IDoctor doctor) {
        Registry registry = new Registry();
        registry.setDoctor(doctor);
        return registry;
    }
}
