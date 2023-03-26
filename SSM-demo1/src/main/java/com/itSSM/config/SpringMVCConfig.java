package com.itSSM.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.itSSM.Controller","com.itSSM.config"})
@EnableWebMvc
public class SpringMVCConfig {
}
