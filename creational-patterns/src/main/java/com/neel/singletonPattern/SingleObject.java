package com.neel.singletonPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){};

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton Achieved!!!");
    }

}
