package cn.jrexe.learn.factory;

public class CoffeeStore {
    public static AbstractCoffee makeCoffee(String type) {
        AbstractCoffee abstractCoffee = null;
        switch (type) {
            case "cappuccio":
                abstractCoffee = new Cappuccio();
            default:
                abstractCoffee = new Cappuccio();

        }

        return  abstractCoffee;


    }

}
