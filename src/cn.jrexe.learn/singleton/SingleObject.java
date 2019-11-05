package cn.jrexe.learn.singleton;


public class SingleObject {
    private static SingleObject singleObject;

    private SingleObject() {
    }

    /***
     * 单例模式的懒汉式[线程安全，但是效率低
     * @return
     */
    public static synchronized SingleObject getInstence() {
        if (singleObject == null) {
            singleObject = new SingleObject();
        }
        return singleObject;

    }
    public void showMessage() {
        System.out.println("My HasCode is " + singleObject.hashCode());
    }
}
