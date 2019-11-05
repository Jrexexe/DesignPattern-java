package cn.jrexe.learn.prototype;

public class PrototypPatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        AbstractShape shape1 = (AbstractShape) ShapeCache.getShape("1");
        shape1.draw();
        AbstractShape shape2 = (AbstractShape) ShapeCache.getShape("2");
        shape2.draw();
        AbstractShape shape3 = (AbstractShape) ShapeCache.getShape("3");
        shape3.draw();
    }

}
