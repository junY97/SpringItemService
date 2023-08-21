package hello.itemservice.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author junyeong.jo .
 * @since 2023-08-21
 */

@Slf4j
@Controller
public class ErrorPageController {

    @RequestMapping("/error-page/404")
    public String errorPage404() {
        log.info("errorPage 404");

        return "error-page/404";
    }

    @RequestMapping("/error-page/500")
    public String errorPage500() {
        log.info("errorPage 500");

        return "error-page/500";
    }
}
