import java.util.ArrayList;

public class Remontcontrol {
    private ArrayList<Device> devic = new ArrayList<Device>();
    private Device aktiv;



    public void setDevice(Device dev){

        devic.add(dev);

    }

    public void viyborUstroystva(String model){
        for(Device dev :devic  ){
            if (dev.getModel() == model){
            aktiv=dev;
            }}
        }
public void onnDevice(){
   aktiv.turnOn();
}
public void offDevice(){
    aktiv.turnOff();
}

    }


