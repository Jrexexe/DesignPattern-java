package cn.jrexe.learn.factory.abstractfactory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method."+this.hashCode());

    }
}
