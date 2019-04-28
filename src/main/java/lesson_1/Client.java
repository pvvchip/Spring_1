package lesson_1;

import javafx.scene.Camera;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        CameraImp cameraImp = new CameraImp();
//        ICameraRoll cameraRoll = new ColorCameraRoll();
//        cameraImp.setCameraRoll(cameraRoll);
       // cameraImp.doPhotograph();
//        Assistant assistant = new Assistant();
//        CameraImp cameraImp = assistant.getCamera();
//        cameraImp.doPhotograph();

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        ICamera camera = context.getBean("camera", ICamera.class);
//        camera.doPhotograph();


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICamera camera = context.getBean("camera", ICamera.class);
        camera.doPhotograph();


//          ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//          HelloMan hm = context.getBean("helloman", HelloMan.class);
//         // hm.setName("Vaska");
//          hm.helloSay();
    }
}
