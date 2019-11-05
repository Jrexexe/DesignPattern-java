package cn.jrexe.learn.factory.abstractfactory.color;

import cn.jrexe.learn.factory.abstractfactory.AbstractFactory;
import cn.jrexe.learn.factory.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    public static final String RED = "RED";
    public static final String GREEN = "GREEN";
    public static final String BLUE = "BLUE";

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (RED.equalsIgnoreCase(color)) {
            return new Red();

        } else if (GREEN.equalsIgnoreCase(color)) {
            return new Green();

        } else if (BLUE.equalsIgnoreCase(color)) {
            return new Blue();
        }

        return null;


    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
