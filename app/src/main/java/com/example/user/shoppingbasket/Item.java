package com.example.user.shoppingbasket;

/**
 * Created by user on 23/11/2016.
 */

public class Item {

    String description;
    float price;
    boolean bogof;


    public Item(String description, float price, boolean bogof){
        this.description = description;
        this.price = price;
        this.bogof = bogof;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean getBogof(){
        return this.bogof;
    }
}
