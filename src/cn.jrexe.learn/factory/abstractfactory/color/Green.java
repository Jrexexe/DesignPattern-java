package cn.jrexe.learn.factory.abstractfactory.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method."+this.hashCode());
    }
}
