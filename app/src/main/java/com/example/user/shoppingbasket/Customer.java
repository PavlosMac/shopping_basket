package com.example.user.shoppingbasket;

/**
 * Created by user on 23/11/2016.
 */




public class Customer {

    private boolean loyaltyCard;
    private String name;

    public Customer(String name, boolean loyaltyCard){
        this.name = name;
        this.loyaltyCard = loyaltyCard;
    }


    public Customer(String name) {
        this.name = name;
    }



    public String getName(){
        return this.name;
    }


    public boolean hasLoyaltyCard(){
        return this.loyaltyCard;
    }

}
