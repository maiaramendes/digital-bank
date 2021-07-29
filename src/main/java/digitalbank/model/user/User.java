package digitalbank.model.user;

import digitalbank.model.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity {

    private String name;

    private String lastName;

    private String mail;

    private String phone;

    private String address;

    private String cpf;

    private String password;

}
