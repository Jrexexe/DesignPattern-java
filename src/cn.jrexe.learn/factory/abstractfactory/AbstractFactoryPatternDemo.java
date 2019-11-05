package cn.jrexe.learn.factory.abstractfactory;

import cn.jrexe.learn.factory.abstractfactory.color.Color;
import cn.jrexe.learn.factory.abstractfactory.color.ColorFactory;
import cn.jrexe.learn.factory.abstractfactory.shape.Shape;
import cn.jrexe.learn.factory.abstractfactory.shape.ShapeFactory;

/***
 * 抽象工程方法
 * @link https://www.yiibai.com/design_pattern/abstract_factory_pattern.html
 * @author  https://www.yiibai.com/
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);
        Shape shape1 = shapFactory.getShape(ShapeFactory.CIRCLE);
        shape1.draw();
        Shape shape2 = shapFactory.getShape(ShapeFactory.RECTANGLE);
        shape2.draw();
        Shape shape3 = shapFactory.getShape(ShapeFactory.SQUARE);
        shape3.draw();



        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.COLOR);
        Color color1 = colorFactory.getColor(ColorFactory.RED);
        color1.fill();
        Color color2 = colorFactory.getColor(ColorFactory.GREEN);
        color2.fill();
        Color color3 = colorFactory.getColor(ColorFactory.BLUE);
        color3.fill();


    }
}
