package lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Lesson_1")
public class AppConfig {
//    @Bean(name = "cameraRoll")
//    public ICameraRoll cameraRoll() {
//        return new ColorCameraRoll();
//    }

//    @Bean(name = "camera")
//    public ICamera camera(ICameraRoll cameraRoll) {
//        CameraImp camera = new CameraImp();
//        camera.setCameraRoll(cameraRoll);
//        return camera;
//    }
}
