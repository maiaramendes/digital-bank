package digitalbank.model.wallet;

import digitalbank.model.BaseEntity;
import digitalbank.model.user.User;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Wallet extends BaseEntity {

    private User user;

    private BigDecimal balance;
}
