package com.neel.prototypePattern;

import static com.neel.prototypePattern.ShapeCache.*;

/**
 * Created by nk77679 on 5/9/2016.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        loadCache();

       getShape("1").getType();

    }
}
