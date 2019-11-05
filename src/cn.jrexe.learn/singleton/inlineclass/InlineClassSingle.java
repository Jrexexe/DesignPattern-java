package cn.jrexe.learn.singleton.inlineclass;


/***
 * 内部 class 方法
 * 因为内部类不会再初始化的时候就加载 ，而类在加载的时候JVM会保证线程安全 ，所以就可以达到懒加载和线程安全
 *
 */
public class InlineClassSingle {
    private InlineClassSingle() {

    }

    private static class SingletonHolder {
        private static InlineClassSingle instebce = new InlineClassSingle();
    }

    public static InlineClassSingle getInstance() {
        return SingletonHolder.instebce;
    }

    public void massage() {
        System.out.println("Call InlineClassSingle::massage() " + this.hashCode());
    }
}
