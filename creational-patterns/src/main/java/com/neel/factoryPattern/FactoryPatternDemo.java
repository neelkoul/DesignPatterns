package com.neel.factoryPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        new ShapeFactory().getShape("square").draw();
        new ColorFactory().getColor("green").fill();
    }
}
