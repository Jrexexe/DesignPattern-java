package cn.jrexe.learn.observer.sys;

import java.util.Observable;
import java.util.Observer;

public class ObserverForLogRrecord implements Observer {

    final String NOTIFY_IP = "175.8.167.13";


    @Override


    public void update(Observable o, Object arg) {
        SubjectForRunTimeLog subjectForRunTimeLog = (SubjectForRunTimeLog) o;
        System.out.println(this.getClass() + "收到消息" + subjectForRunTimeLog.getMsg() + "arg:" + arg.toString());

    }
}
