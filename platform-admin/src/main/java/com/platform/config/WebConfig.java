package com.platform.config;

import com.platform.interceptor.LogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.Properties;

/**
 * @Description TODO
 * @Date 2019/12/24
 * @Created by 67068
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Autowired
    private LogInterceptor logInterceptor;


/*    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }*/



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(Arrays.asList("/statics/**","/goodQrCode/**","/**/**.html","/**/**.js"));
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Bean
    public SimpleMailMessage  simpleMailMessage () {
        return new SimpleMailMessage();
    }


    @Bean
    public JavaMailSender javaMailSender () {

        return new JavaMailSenderImpl();
    }




}
