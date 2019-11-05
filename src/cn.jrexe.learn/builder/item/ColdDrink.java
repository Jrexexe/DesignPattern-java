package cn.jrexe.learn.builder.item;

import cn.jrexe.learn.builder.pack.Bottle;
import cn.jrexe.learn.builder.pack.Packing;

public class ColdDrink implements Item {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
