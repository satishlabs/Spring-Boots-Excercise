package com.satishlabs;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.satishlabs")
public class AppConfig {
    @Bean
    public DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mydb");
        ds.setUsername("root");
        ds.setPassword("root");

        ds.setInitialSize(5);
        ds.setMaxActive(25);

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds){
        return  new JdbcTemplate(ds);
    }
}
