public class SmartHomeControl {

    public void control(ElectricProduct product) {
        System.out.println("Start!");
        System.out.println(product.getName() + "current status is" + (product.isStatus() ? "open" : "close"));
        product.press();
        System.out.println(product.getName() + "current status has changed to" + (product.isStatus() ? "open" : "close"));
    }
}
