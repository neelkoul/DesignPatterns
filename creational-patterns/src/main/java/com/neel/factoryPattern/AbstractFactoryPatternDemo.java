package com.neel.factoryPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer.getFactory("shape").getShape("square").draw();
        FactoryProducer.getFactory("color").getColor("red").fill();
    }
}
