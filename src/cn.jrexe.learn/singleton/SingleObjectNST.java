package cn.jrexe.learn.singleton;


public class SingleObjectNST {
    private static SingleObjectNST singleObject = new SingleObjectNST();


    private SingleObjectNST(){

    }

    /***
     * 单例模式的懒汉式[线程不安全，不可用]
     * @return
     */
    public static SingleObjectNST getInstence() {

        return singleObject;

    }
    public void showMessage() {
        System.out.println("My HasCode is " + singleObject.hashCode());
    }
}
