package cn.jrexe.learn.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectFor3D implements Subject {


    /***
     * 观察者列表
     */
    List<Observer> observerList = new ArrayList<>();

    /**
     * 中级号码
     */
    String msg;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }

    }

    @Override
    public void notifyObserver(String msg) {
        for (Observer observer :
                observerList) {
            observer.update(msg);
        }
    }


    /***
     * 开奖
     * @param number
     */
    public void lottery(String number){
        msg  = number;
        notifyObserver(msg);
    }
}
