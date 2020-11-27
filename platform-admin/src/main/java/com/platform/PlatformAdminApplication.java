package com.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 *
 *
 */
@EnableTransactionManagement
@SpringBootApplication
public class PlatformAdminApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        try{
            SpringApplication.run(PlatformAdminApplication.class, args);
        }catch (Exception e ) {
            e.printStackTrace();
        }

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PlatformAdminApplication.class);
    }
}
