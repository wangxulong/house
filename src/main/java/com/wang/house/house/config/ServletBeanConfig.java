package com.wang.house.house.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletBeanConfig {

    @Bean
    public ServletRegistrationBean druidServletBean(){
        return new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
    }
}
