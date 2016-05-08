package com.neel.builderPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class MealBuilder {

    public static Meal prepareVegMeal(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Sprite());
        return vegMeal;
    }

    public static Meal prepareNonVegMeal(){
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new NonVegBurger());
        nonVegMeal.addItem(new Fanta());
        return nonVegMeal;
    }
}
