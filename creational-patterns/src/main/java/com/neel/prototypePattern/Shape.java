package com.neel.prototypePattern;

/**
 * Created by nk77679 on 5/9/2016.
 */
public abstract class Shape implements Cloneable{
    private String id;

    public String type;


    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
