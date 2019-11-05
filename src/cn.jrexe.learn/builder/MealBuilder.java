package cn.jrexe.learn.builder;

import cn.jrexe.learn.builder.products.ChickenBurger;
import cn.jrexe.learn.builder.products.Coke;
import cn.jrexe.learn.builder.products.Pepsi;
import cn.jrexe.learn.builder.products.VegBurger;

public class MealBuilder {
    public Meal prepersVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;

    }

    public Meal prepersNoneVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepersVegMeal();
        System.out.println("\n\nVeg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepersNoneVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());


    }
}
