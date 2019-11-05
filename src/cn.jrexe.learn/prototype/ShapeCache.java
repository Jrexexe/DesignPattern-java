package cn.jrexe.learn.prototype;


import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, AbstractShape> shapeHashtable = new Hashtable<>();
    public static AbstractShape getShape(String shapId) {
        AbstractShape cachedShape = shapeHashtable.get(shapId);
        return (AbstractShape) cachedShape.clone();

    }
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }



}
