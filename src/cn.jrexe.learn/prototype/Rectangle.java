package cn.jrexe.learn.prototype;

public class Rectangle extends AbstractShape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle:draw");
    }
}
