package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2016.
 */

public class BasketDiscount implements Discountable{

    private String description;


    public BasketDiscount(String description){
        this.description = description;
    }

    public float makeDiscount(float total){
        if(total >= 20.00f) {
             total -= (total * 0.1f);
        }
        return total;
    }


}
