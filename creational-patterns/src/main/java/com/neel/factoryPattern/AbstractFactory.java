package com.neel.factoryPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
