public class Person {
    private Remontcontrol remontcontrol;
    private Device device;

    public static void main(String[] args) {


    Remontcontrol remontcontrols = new Remontcontrol();
    TV tv = new TV("Samsung","Sam4505",true);
    DVD dvd =new DVD("LG","LAG145", false);
    remontcontrols.setDevice(tv);
    remontcontrols.setDevice(dvd);
    remontcontrols.viyborUstroystva("Sam4505");
    remontcontrols.onnDevice();
    remontcontrols.offDevice();
    remontcontrols.viyborUstroystva("LAG145");
    remontcontrols.onnDevice();


}

}
