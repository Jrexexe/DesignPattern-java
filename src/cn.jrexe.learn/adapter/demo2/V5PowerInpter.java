package cn.jrexe.learn.adapter.demo2;


/**
 *
 */
public class V5PowerInpter implements V5Power{
    @Override
    public int provideV5Power() {
        System.out.println("我的额定输出为DC -5V");
        return 5;
    }
}
