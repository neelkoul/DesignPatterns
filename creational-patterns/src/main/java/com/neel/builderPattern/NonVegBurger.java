package com.neel.builderPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class NonVegBurger extends Burger {
    public String name() {
        return "NonVegBurger";
    }

    public float price() {
        return 100;
    }
}
