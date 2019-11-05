package cn.jrexe.learn.adapter.demo2;

public class V5Adapter implements V5Power{
    V220Power v220Power;

    @Override
    public int provideV5Power() {
       int power = v220Power.provideV220Power();
        System.out.println("当前接入的是"+power+"V的电压 正在进行压降");
        // 经过一些操作

        return 5;
    }


    public  V5Adapter(V220Power v220Power) {
        this.v220Power = v220Power;

    }
}
