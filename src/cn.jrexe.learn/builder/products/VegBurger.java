package cn.jrexe.learn.builder.products;

import cn.jrexe.learn.builder.item.Burger;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public double getPrice() {
        return 20.2;
    }
}
