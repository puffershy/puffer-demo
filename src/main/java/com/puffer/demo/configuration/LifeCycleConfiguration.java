package com.puffer.demo.configuration;

import com.puffer.demo.lifecycle.MyLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author buyi
 * @date 2019年09月16日 00:25:20
 * @since
 */
@Configuration
public class LifeCycleConfiguration {

    @Bean
    public MyLifeCycle myLifeCycle(){
        return new MyLifeCycle();
    }
}
