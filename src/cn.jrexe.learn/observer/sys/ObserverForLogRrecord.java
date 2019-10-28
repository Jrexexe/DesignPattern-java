package cn.jrexe.learn.observer.sys;

import java.util.Observable;
import java.util.Observer;

/**
 * The type Observer for log rrecord.
 */
public class ObserverForLogRrecord implements Observer {

    /**
     * The Notify ip.
     */
    final String NOTIFY_IP = "175.8.167.13";


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.getClass() + "收到消息" + o.toString() + " arg: " + arg.toString());

    }
}
