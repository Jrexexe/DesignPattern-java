package cn.jrexe.learn.observer;

public class ObserverForUser1 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(this.getClass() + "  : receive msg:"+msg);
    }
}
