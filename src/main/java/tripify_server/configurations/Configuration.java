package tripify_server.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import tripify_server.filters.Filter1;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public FilterRegistrationBean<Filter1> registrationBean(){
        FilterRegistrationBean<Filter1> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new Filter1());
        registrationBean.addUrlPatterns("/{}");
        return registrationBean;
    }

}
