package cn.jrexe.learn.builder.products;

import cn.jrexe.learn.builder.item.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
