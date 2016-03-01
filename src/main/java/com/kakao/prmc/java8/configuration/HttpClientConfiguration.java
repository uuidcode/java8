package com.kakao.prmc.java8.configuration;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfiguration {
    @Bean
    public HttpClient httpClient() {
        RequestConfig defaultRequestConfig = RequestConfig.custom()
            .setSocketTimeout(1000)
            .setConnectTimeout(1000)
            .build();

        HttpClientBuilder builder = HttpClientBuilder.create();
        builder.setDefaultRequestConfig(defaultRequestConfig);
        return builder.build();
    }
}
