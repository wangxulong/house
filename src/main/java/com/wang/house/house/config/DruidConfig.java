package com.wang.house.house.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Lists;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.druid")
    public DruidDataSource druidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
        return dataSource;

    }

    /**
     * 慢日志
     * @return
     */
    public Filter statFilter(){
        StatFilter statFilter = new StatFilter();
        statFilter.setLogSlowSql(true);
        statFilter.setSlowSqlMillis(5000);
        statFilter.setMergeSql(true);
        return statFilter;
    }
}
