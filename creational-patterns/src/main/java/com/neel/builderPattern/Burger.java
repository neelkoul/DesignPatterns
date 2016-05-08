package com.neel.builderPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
