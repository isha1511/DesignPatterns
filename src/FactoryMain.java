public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf=new OperatingSystemFactory();

        OS obj= osf.getInstance("Powerful");

        obj.specification();
    }
}
