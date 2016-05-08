package com.neel.factoryPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(("shape").equalsIgnoreCase(factory)){
            return new ShapeFactory();
        } else if (("color").equalsIgnoreCase(factory)){
            return new ColorFactory();
        }
        return null;
    }
}
