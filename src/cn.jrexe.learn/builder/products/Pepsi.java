package cn.jrexe.learn.builder.products;

import cn.jrexe.learn.builder.item.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
