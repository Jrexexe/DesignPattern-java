package cn.jrexe.learn.builder.products;

import cn.jrexe.learn.builder.item.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "ChickenBurger";
    }

    @Override
    public double getPrice() {
        return 12.2;
    }
}
