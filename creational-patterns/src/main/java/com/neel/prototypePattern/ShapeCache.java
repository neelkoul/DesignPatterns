package com.neel.prototypePattern;

import java.util.HashMap;

/**
 * Created by nk77679 on 5/9/2016.
 */
public class ShapeCache {
    public static HashMap<String,Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);

        return (Shape) cachedShape.clone();
    }


    //this is where you hit all the queries and get it cached

    public static void  loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }
}
