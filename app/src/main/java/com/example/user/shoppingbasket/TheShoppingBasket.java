package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by user on 23/11/2016.
 */

public class TheShoppingBasket implements Discountable {

    Customer customer;
    ArrayList<Item> basket;
    float total;

    public TheShoppingBasket(Customer customer){
        this.basket = new ArrayList<Item>();
        this.customer = customer;
        this.total = 0;

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


    public double getBasketSum(){
        for(Item basketItems : basket){
            total += basketItems.getPrice();
        }
        makeDiscount();
        loyaltyCardAdjustmentToBasket();
        double roundedTotal = Math.round( total * 100.0 )/100.0;
        return roundedTotal;
    }


    public void removeItem(Item item){
        Iterator<Item> it = basket.iterator();
        while(it.hasNext()){
            if(it.next().equals(item)){
                it.remove();
            }
        }
    }


    public void makeDiscount(){
        if(total >= 20.00f) {
            total -= (total * 0.1f);
        }
    }



    public void loyaltyCardAdjustmentToBasket(){
        if(customer.hasLoyaltyCard()){
            total -= (total * 0.02f);
        }
    }


    public void addTwinOfBogofItemToBasket(Item item){
        Item replica = new Item(item.getDescription(), 0.0f, false);
        basket.add(replica);

    }


}
