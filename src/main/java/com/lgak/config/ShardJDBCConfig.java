package com.lgak.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class ShardJDBCConfig {
    @Autowired
    private DataSource dataSource;
}
