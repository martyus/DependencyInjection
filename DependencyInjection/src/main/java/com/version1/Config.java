package com.version1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Engine engineBean(){
        Engine e = new Engine();
        e.setRevs(100);
        return e;
    }

}
