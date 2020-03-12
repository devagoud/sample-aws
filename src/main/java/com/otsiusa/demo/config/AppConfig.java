package com.otsiusa.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 */
@Configuration
@ComponentScan("com.otsiusa.demo")
@EntityScan("com.otsiusa.demo")
@EnableJpaRepositories("com.otsiusa.demo.domain.infrastructure")
public class AppConfig {

}
