public class Device {
    private String name;
    private String model;
    private boolean zustand;
    public Device(String name,String model,boolean zustand) {
    this.name=name;
    this.model=model;
    this.zustand=zustand;
}
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public boolean getZustand(){
        return zustand;
    }
    public void  turnOn(){
        if(zustand==false){
            zustand=true;
            System.out.println("Включено устройства"+"  "+getName() );
        }else
            System.out.println("Устройства уже включено!!!"+"   "+getName());
    }
    public void turnOff(){
        if (zustand==false){
            zustand=true;
            System.out.println("Выключено устройства"+"  " + getName());
        }else
            System.out.println("Устройства уже выключено!!!"+" "+getName());

    }

    }


