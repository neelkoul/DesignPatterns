package com.neel.factoryPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
