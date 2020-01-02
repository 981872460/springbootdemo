package com.zql.biz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:applicationContext-handler.xml"})
public class ApplicationConfig {
}
