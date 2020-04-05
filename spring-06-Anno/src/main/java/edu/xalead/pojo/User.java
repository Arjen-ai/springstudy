package edu.xalead.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//相当于<bean id="user" class="edu.xalead.pojo.User"/>
@Component
public class User {
    //相当于<propery name="name" value="李四">
    @Value("李四")
    public String name;
}
