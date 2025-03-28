import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElectricProduct implements Switch {
    private String name;
    private boolean status;

    @Override
    public void press() {
        status = !status;
    }
}
