package cn.jrexe.learn.factory.abstractfactory;

import cn.jrexe.learn.factory.abstractfactory.color.ColorFactory;
import cn.jrexe.learn.factory.abstractfactory.shape.ShapeFactory;

public class FactoryProducer {

    public static String SHAPE = "SHAPE";
    public static String COLOR = "COLOR";

    public static AbstractFactory getFactory(String choice) {
        if (SHAPE.equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if (COLOR.equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
