package com.neel.builderPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total Price:" + nonVegMeal.getCost() + "\n");

        Meal vegMeal = MealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Price:" + vegMeal.getCost() + "\n");
    }
}
