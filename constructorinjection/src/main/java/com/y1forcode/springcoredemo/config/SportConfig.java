package com.y1forcode.springcoredemo.config;

import com.y1forcode.springcoredemo.common.Coach;
import com.y1forcode.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("boyledekullanilabilir")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
