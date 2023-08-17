package hello.itemservice.web.argumentresolver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author junyeong.jo .
 * @since 2023-08-17
 */

@Target(ElementType.PARAMETER) //파라미터에만 사용
@Retention(RetentionPolicy.RUNTIME) // 리플렉션 등ㅇㄹ 활용할 수 있도록 런타임까지 애노테이션 정보가 남아있음
public @interface Login {
}
