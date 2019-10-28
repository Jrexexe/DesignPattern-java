package cn.jrexe.learn.factory;

/***
 * @author Jrexe
 */
public abstract class AbstractCoffee {
    protected String name;

    public void prepare() {
        System.out.println("打开机器 。。加热");
    }

    public void grind() {
        System.out.println("研磨磨咖啡豆");
    }

    public void milk() {
        System.out.println("加入牛奶  ");
    }


    public void stram() {
        System.out.println("蒸汽搅拌 ");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
