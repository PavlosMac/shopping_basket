package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 23/11/2016.
 */

public class TheShoppingBasket{

    private Customer customer;
    private ArrayList<Item> basket;
    private ArrayList<Discountable> discounts;
    private float total;



    public TheShoppingBasket(Customer customer){
        this.basket = new ArrayList<Item>();
        this.customer = customer;
        this.total = 0;
        this.discounts = new ArrayList<Discountable>();

    }


    public boolean customerHasLoyaltyCard(){
        return this.customer.hasLoyaltyCard();
    }



    public void addItem(Item item){
        basket.add(item);
    }



    public double getTotal(){
        double roundedTotal = Math.round( total * 100.0 )/100.0;
        return roundedTotal;
    }



    public int getTotalItems(){
        return basket.size();
    }


    public double getSum(){
        double roundedTotal = Math.round( total * 100.0 )/100.0;
        return roundedTotal;
    }


    public void makeBasketSum(){
        for(Item basketItems : basket) {
            total += basketItems.getPrice();
        }

    }


    public void removeItem(Item item){
        Iterator<Item> it = basket.iterator();
        while(it.hasNext()){
            if(it.next().equals(item)){
                it.remove();
            }
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


    public void addDiscount(Discountable discount){
        discounts.add(discount);
    }


    public int getNumberOfDiscounts(){
        return discounts.size();
    }


    public void makeDiscounts(){
        makeBasketSum();
        for(Discountable discount : discounts){
            total = discount.makeDiscount(total);
        }
    }





}
