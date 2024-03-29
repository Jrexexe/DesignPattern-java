package cn.jrexe.learn.observer.sys;

import java.util.Observable;

public class SubjectForRunTimeLog extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();//
        notifyObservers("arg");
    }

    @Override
    public String toString() {
        return "SubjectForRunTimeLog{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
