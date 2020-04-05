package edu.xalead.dome1;

public class Proxy implements Rent {
    private Host host;//用的组合

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fee();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //签合同
    public void hetong(){
        System.out.println("签合同");
    }
    //收费
    public void fee(){
        System.out.println("收取中介费用");
    }
}
