package com.ucem.firstapi.temp;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.url("jdbc:sqlserver://localhost;encrypt=false;databaseName=BD_PERSONA;trustServerCertificate=true");
         dsb.username("sa");
        dsb.password("Karen_1_Daniel");
        return dsb.build();
    }
}
