public class SilverCard extends Card {
    public SilverCard(String card,String name, String phone, double money) {
        super(card,name,phone,money);
    }
    @Override
    public void withdraw(double money) {
        System.out.println("The Silver card consumption price is:" + money);
        System.out.println("The discount price:" + money * 0.9);
        if (getMoney() < money * 0.9){
            System.out.println("Your account balance is inadequate");
            return;
        }
        //update balance
        setMoney(getMoney() - money * 0.9);
    }
}
