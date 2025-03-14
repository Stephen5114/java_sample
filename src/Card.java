import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String cardId;
    private String name;
    private String phone;
    private double money;

    //plan to deposit money
    public void deposit(double money) {
        this.money += money;
    }

    //consume money
    public void withdraw(double money) {
        this.money -= money;
    }

}
