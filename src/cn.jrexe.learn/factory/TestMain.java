package cn.jrexe.learn.factory;

public class TestMain {
    public static void main(String[] args) {
        AbstractCoffee coffee = CoffeeStore.makeCoffee("cappuccio");
        System.out.println(coffee.toString());;
    }
}
