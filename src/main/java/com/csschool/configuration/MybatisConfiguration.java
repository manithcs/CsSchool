package com.csschool.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.csschool.repository")
public class MybatisConfiguration {
    private DataSource dataSource;
    @Autowired
    public  void setDataSource (DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(){
        return  new DataSourceTransactionManager(dataSource);
    }
    @Bean
    SqlSessionFactoryBean factoryBean(){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        System.out.println("Factory Bean");
        return bean;
    };
}
