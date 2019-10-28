package cn.jrexe.learn.observer;

public class Usage {
    public static void main(String[] args) {
        SubjectFor3D subject = new SubjectFor3D();
        subject.registerObserver(new ObserverForUser1());
        subject.registerObserver(new ObserverForUser2());
        subject.registerObserver(new ObserverForUser3());
        System.out.println("注册服务完成-----\n\t");
        System.out.println("模拟开奖 本期中奖号码是231");
        subject.lottery("213");
        System.out.println("开奖通知结束");

    }
}
