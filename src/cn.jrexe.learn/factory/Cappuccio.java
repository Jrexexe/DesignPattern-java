package cn.jrexe.learn.factory;

public class Cappuccio extends AbstractCoffee {
    public Cappuccio() {
        this.name = "Cappuccio 卡布奇洛 ";
    }

    @Override
    public String toString() {
        return "Cappuccio{" +
                "name='" + name + '\'' +
                '}';
    }
}
