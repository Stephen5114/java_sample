import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("eA860MM","deli","24324234",5000);
        goldCard.deposit(100);
        pay(goldCard);
        SilverCard silverCard = new SilverCard("eA860MM","li","24324234",3000);
        pay(silverCard);


    }

    public static void pay(Card card)
    {
        System.out.println("please swipe out card, enter the amount");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.withdraw(money);

    }
}