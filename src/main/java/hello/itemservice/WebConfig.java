package hello.itemservice;

import hello.itemservice.exception.filter.LogFilter;
import hello.itemservice.exception.filter.LoginCheckFilter;
import hello.itemservice.exception.interceptor.LogInterceptor;
import hello.itemservice.exception.resolver.MyHandleExceptionResolver;
import hello.itemservice.exception.resolver.UserHandlerExceptionResolver;
import hello.itemservice.typeconverter.converter.IntegerToStringConverter;
import hello.itemservice.typeconverter.converter.IpPortToStringConverter;
import hello.itemservice.typeconverter.converter.StringToIntegerConverter;
import hello.itemservice.typeconverter.converter.StringToIpPortConverter;
import hello.itemservice.typeconverter.formatter.MyNumberFormatter;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author junyeong.jo .
 * @since 2023-08-16
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//        resolvers.add(new LoginMemberArgumentResolver());
//    }


    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        //추가
        registry.addFormatter(new MyNumberFormatter());
    }

    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LogFilter());
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.ERROR);

        return filterRegistrationBean;
    }

//    @Bean
    public FilterRegistrationBean loginCheckFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LoginCheckFilter());
        filterRegistrationBean.setOrder(2);
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(new MyHandleExceptionResolver());
        resolvers.add(new UserHandlerExceptionResolver());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor())
                .order(1)
                .addPathPatterns("/**")
                .excludePathPatterns("/css/**", "/*.ico", "/error");
    }
}
