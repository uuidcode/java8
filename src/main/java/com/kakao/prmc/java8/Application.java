package com.kakao.prmc.java8;

import com.kakao.prmc.CoreConfiguration;
import com.kakao.prmc.core.configuration.CoreConfigProperties;
import com.kakao.prmc.core.configuration.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackageClasses = CoreConfiguration.class)
@EnableAutoConfiguration
@EnableConfigurationProperties(value = { DatabaseProperties.class, CoreConfigProperties.class })
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public static enum SupportStatus {
        SERVICE
    }

    public static enum Status {
        SERVICE, WAITING
    }

    public static enum ObjectType {
        EPISODE
    }

    public static enum CountType {
        VIEW, LIKE, KAKAO_TALK
    }

    public static enum PayStatus {
        OK
    }
}