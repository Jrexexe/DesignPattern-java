package cn.jrexe.learn.builder.item;

import cn.jrexe.learn.builder.pack.Packing;
import cn.jrexe.learn.builder.pack.Wrapper;

public class Burger implements Item {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
