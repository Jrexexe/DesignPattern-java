package cn.jrexe.learn.builder;

import cn.jrexe.learn.builder.item.Item;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        this.items.add(item);
    }

    public double getCost() {
        double total = 0.0;
        for (Item i :
                items) {
            total += i.getPrice();

        }
        return total;
    }

    public void showItems() {
        for (Item i :
                items) {
            System.out.println("商品: " + i.getName() + " 价格:" + i.getPrice() +" 包装为:"+i.packing().pack());

        }
        System.out.println("小计:" + items.size());
    }
}
