package com.neel.singletonPattern;

/**
 * Created by Neel on 08-05-2016.
 */
public class SingleObject {
    private static SingleObject instance;

    private SingleObject(){};

    public static SingleObject getInstance(){
        if (instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton Achieved!!!");
    }

}
