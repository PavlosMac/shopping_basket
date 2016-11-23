package com.example.user.shoppingbasket;

import org.junit.Before;

/**
 * Created by user on 23/11/2016.
 */

public class TheShoppingBasketTest {

    private TheShoppingBasket shoppingBasket1;
    private boolean loyaltyCard;

    @Before
    public void before(){

        Customer customer1 = new Customer("James", loyaltyCard);
        shoppingBasket1 = new TheShoppingBasket(customer1);
    }

}
