package com.wang.house.house.config;

import com.wang.house.house.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class FilterBeanConfig {
    @Bean
    public FilterRegistrationBean<LogFilter> logFilter(){
        FilterRegistrationBean<LogFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LogFilter());
        List<String> urls = Arrays.asList("*");
        filterRegistrationBean.setUrlPatterns(urls);
        return filterRegistrationBean;
    }
}
