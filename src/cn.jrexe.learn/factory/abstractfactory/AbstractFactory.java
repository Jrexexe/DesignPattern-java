package cn.jrexe.learn.factory.abstractfactory;

import cn.jrexe.learn.factory.abstractfactory.color.Color;
import cn.jrexe.learn.factory.abstractfactory.shape.Shape;

public abstract class AbstractFactory  {

    abstract public Color getColor(String color) ;

    abstract public Shape getShape(String shape) ;
}
