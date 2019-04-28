package lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("camera")
public class CameraImp implements ICamera{
    private ICameraRoll cameraRoll;

//    public CameraImp(ICameraRoll cameraRoll) {
//        this.cameraRoll = cameraRoll;
//    }

    public ICameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Autowired(required = false)
    @Qualifier("BlackAndWhiteCameraRoll")
    public void setCameraRoll(ICameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
