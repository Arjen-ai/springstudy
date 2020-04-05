package edu.xalead.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
//后置通知
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为："+ o);
    }
}
