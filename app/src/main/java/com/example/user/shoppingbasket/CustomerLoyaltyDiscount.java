package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2016.
 */

public class CustomerLoyaltyDiscount implements Discountable {


    private String description;



    public CustomerLoyaltyDiscount(String description){
        this.description = description;
    }



    public float makeDiscount(float total){
           total -= (total * 0.02f);
        return total;
    }



}
