package cn.jrexe.learn.builder.item;

import cn.jrexe.learn.builder.pack.Packing;


/***
 * 商品接口
 */
public interface Item {
    public String getName();
    public Packing packing();
    public double getPrice();

}
