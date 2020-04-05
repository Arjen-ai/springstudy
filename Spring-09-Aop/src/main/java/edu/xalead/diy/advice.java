package edu.xalead.diy;

public class advice {
    public void before(){
        System.out.println("-----在切入点前执行------");
    }

    public void after(){
        System.out.println("-----在切入点后执行------");
    }
}
