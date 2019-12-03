package com.narek.config;

import com.narek.InjectRandomDoubleBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public InjectRandomDoubleBeanPostProcessor injectRandomDoubleBeanPostProcessor() {
        return new InjectRandomDoubleBeanPostProcessor();
    }
}
