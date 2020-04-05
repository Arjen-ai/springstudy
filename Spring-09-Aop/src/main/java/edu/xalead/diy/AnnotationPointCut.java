package edu.xalead.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解方式实现AOP
@Aspect//定义一个切面
public class AnnotationPointCut {
    @Before("execution(* edu.xalead.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("前");
    }
    @After("execution(* edu.xalead.service.UserServiceImpl.*(..))")
    public void After(){
        System.out.println("后");
    }
    //在环绕增强中可以给定一个参数，代表我们要获取处理切入点
    @Around("execution(* edu.xalead.service.UserServiceImpl.*(..))")
    public void Around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        jp.proceed();
        System.out.println("环绕后");
    }
}
