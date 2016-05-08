package com.neel.factoryPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color){
        if(("green").equalsIgnoreCase(color)){
            return new Green();
        } else if (("red").equalsIgnoreCase(color)){
            return new Red();
        }
        return null;
    }
}
