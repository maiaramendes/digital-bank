package digitalbank.model.account;

import digitalbank.model.BaseEntity;
import digitalbank.model.user.User;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account extends BaseEntity {

    private String ag;

    private String cc;

    private BigDecimal limit;

    private User user;

}
