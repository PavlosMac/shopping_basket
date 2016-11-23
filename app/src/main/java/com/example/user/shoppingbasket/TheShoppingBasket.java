package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 23/11/2016.
 */

public class TheShoppingBasket {

    Customer customer;
    ArrayList<Item> basket;

    public TheShoppingBasket(Customer customer){
        this.basket = new ArrayList<Item>();
        this.customer = customer;

    }

    public boolean customerHasLoyaltyCard(){
        return this.customer.hasLoyaltyCard();
    }

    public void addItem(Item item){
        basket.add(item);
    }

    public int getTotalItems(){
        return basket.size();
    }


}
