package cn.jrexe.learn.observer;

/**
 * @author jrexe
 * 主题接口 注册，退订，通知观察者
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);


    /***
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);


    /***
     * 通知观察者
     * @param msg
     */
    public void notifyObserver(String msg);
}
