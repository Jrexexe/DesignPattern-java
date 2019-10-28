package cn.jrexe.learn.observer.sys;

import java.util.Observable;

public class SubjectForNetLog extends Observable {
   private String msg;

   final String ID = "@3123123123";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers(ID);
    }

    @Override
    public String toString() {
        return "SubjectForNetLog{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
