package edu.xalead.config;

import edu.xalead.dao.*;
import edu.xalead.service.UserServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.xalead")
public class Config {

    @Bean
    public UserDaoImp getUserDaoImpUserDaoImp(){
        return new UserDaoImp();
    }

    @Bean
    public UserDaoOracleImp getUserDaoImpDaoOracleImp(){
        return new UserDaoOracleImp();
    }

    @Bean
    public UserDaoSqlserverImpl getUserDaoImpUserDaoSqlserver(){
        return new UserDaoSqlserverImpl();
    }

    @Bean
    public UserDaoMySqlImp getUserDaoImpMySqlImp(){
        return new UserDaoMySqlImp();
    }

    @Bean
    public UserServiceImp getUserServiceImp(){
        return new UserServiceImp();
    }
}
