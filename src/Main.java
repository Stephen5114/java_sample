public class Main {
    public static void main(String[] args) {
        ElectricProduct[] products = new ElectricProduct[4];
        products[0] = new TV("xiaomiTV", true);
        products[1] = new WashMachine("medi", false);
        products[2] = new Lamp("oudeng", false);
        products[3] = new Air("meidiAircondition", false);

        SmartHomeControl smartHomeControl = new SmartHomeControl();
        smartHomeControl.control(products[0]);

    }
}