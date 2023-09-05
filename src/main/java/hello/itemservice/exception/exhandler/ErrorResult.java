package hello.itemservice.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author junyeong.jo .
 * @since 2023-09-05
 */

@Data
@AllArgsConstructor
public class ErrorResult {
    private String code;
    private String message;
}
