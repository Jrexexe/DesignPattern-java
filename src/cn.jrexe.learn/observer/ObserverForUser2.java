package cn.jrexe.learn.observer;

public class ObserverForUser2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(this.getClass() + "  : receive msg:" + msg);
        if (msg.equals("213")) {
            System.out.println(this.getClass() + "我中奖了");
        }
    }
}
