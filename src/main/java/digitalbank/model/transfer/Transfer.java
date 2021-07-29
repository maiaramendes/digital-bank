package digitalbank.model.transfer;

import digitalbank.model.BaseEntity;
import digitalbank.model.enums.PaymentType;
import digitalbank.model.user.User;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Transfer extends BaseEntity {

    private User recipient;

    private User sender;

    private BigDecimal value;

    private LocalDateTime transferAt;

    private PaymentType paymentType;

}
