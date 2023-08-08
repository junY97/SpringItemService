package hello.itemservice.web.login;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author junyeong.jo .
 * @since 2023-08-08
 */

@Data
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
