package com.mvc.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.mvc.example","com.mvc.example.*"})
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Value("${view.prefix}")
    private String prefix;

    @Value("${view.suffix}")
    private String suffix;

    @Bean
    public ViewResolver resolver() {
        return new InternalResourceViewResolver(prefix,suffix);

    }

}
