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

    public float getPrice(){
        return this.price;
    }

//    public static itemGenerator(String description, float price, boolean bogof){
//        Item itemOnTheFly = new Item(description, price, bogof);
//        return itemOnTheFly;
//    }

    public String toString(){
        String ifBogof = "";

        if(getBogof()){
            ifBogof = "BoGoF";
        }
        else {
            ifBogof = "No BoGoF";
        }

        String description = String.format("%s, %f, %s", getDescription(),getPrice(), ifBogof);
        return description;
    }
}
