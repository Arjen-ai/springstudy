package edu.xalead.config;

import edu.xalead.pojo.Blog;
import edu.xalead.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Blob;

@Configuration
@ComponentScan("edu.xalead")
public class UserConfig {

    /**
     * 返回值相当于xml的class
     * 函数名相当于xml的id
     * @return
     */
    @Bean
    public User getUser(){
        return new User();
    }

    @Bean
    public Blog getBlog(){
        return new Blog();
    }
}
