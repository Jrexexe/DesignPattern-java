package cn.jrexe.learn.singleton.thread_safety_lazy;



/**
 * 线程安全的二次确认方法
 * https://blog.csdn.net/dmk877/article/details/50311791
 */
public class SingletTSLazey {
    /**
     * 1 第一步持有自己的静态实例对象 给自己的的实例分配静态空间
     */
    private static SingletTSLazey instance;

    /**
     * 2 私有化 构造函数 （只有我自己可以用，你们只能通过另外一静态方法获得）
     */
    private SingletTSLazey() {

    }

    /***
     * 3 定义一个公有的方法，将在该类中所创建的对象返回 得保证线程安全
     * @return SingletTSLazey
     */
    public static SingletTSLazey getInstance() {
        if (instance == null) {
            synchronized (SingletTSLazey.class) {
                if (instance == null) {
                    instance = new SingletTSLazey();
                }
            }
        }

        return instance;
    }


    @Override
    public String toString() {
        return "SingletTSLazey::toString HashCode:" + this.hashCode();
    }
}
