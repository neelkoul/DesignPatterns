package com.neel.builderPattern;

import java.util.ArrayList;

/**
 * Created by Neel on 08-05-2016.
 */
public class Meal {
    private ArrayList<Item> items = new ArrayList<Item>(10);

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float price = 0;
        for (Item item: items) {
            price += item.price();
        }
        return price;
    }

    public void showItems(){
        for(Item item: items){
            System.out.println("Item :" + item.name() + ", " + "Packing :" + item.packing().pack());
            System.out.println("Price :" + item.price() + "\n");
        }
    }
}
