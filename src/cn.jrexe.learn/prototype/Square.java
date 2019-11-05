package cn.jrexe.learn.prototype;

public class Square extends AbstractShape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Rectangle:Square");
    }
}
