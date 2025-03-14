public class GoldCard extends Card {
    public GoldCard(String card,String name, String phone, double money ) {
        super(card,name,phone,money);
    }
    @Override
    public void withdraw(double money) {
        System.out.println("The Gold card consumption price is:" + money);
        System.out.println("The discount price:" + money * 0.8);
        if (getMoney() < money * 0.8){
            System.out.println("Your account balance is inadequate");
            return;
        }
        //update balance
        setMoney(getMoney() - money * 0.8);
        if (money * 0.8 >= 200 ){
            printTicket();
        }else {
            System.out.println("Your consumption is less than 200, you cannot wash cart for free");
        }

    }
    //if consumption is higher than 200, call a method, print wash car fare
    public void printTicket(){
        System.out.println("You have made a consumption, please print a ticket");
    }
}
