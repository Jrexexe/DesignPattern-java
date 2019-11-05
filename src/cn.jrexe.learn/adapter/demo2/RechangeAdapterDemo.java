package cn.jrexe.learn.adapter.demo2;

public class RechangeAdapterDemo {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        V5Power v5Power = new V5Adapter(new V220Power()) ;
        mobile.inputPower(v5Power);

        System.out.println("又有一部手机 ");
        Mobile mobile1 = new Mobile();
        mobile1.inputPower(new V5PowerInpter());

    }
}
