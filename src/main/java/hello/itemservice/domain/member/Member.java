package hello.itemservice.domain.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author junyeong.jo .
 * @since 2023-08-07
 */

@Data
public class Member {

    private Long id;

    @NotEmpty
    private String loginId; //로그인 ID

    @NotEmpty
    private String name; // 사용자 이름

    @NotEmpty
    private String password;
}
