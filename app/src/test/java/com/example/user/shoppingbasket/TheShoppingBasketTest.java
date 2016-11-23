package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 23/11/2016.
 */

public class TheShoppingBasketTest {


    private TheShoppingBasket shoppingBasket1;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;
    Item item6;


    @Before
    public void before(){

        Customer customer1 = new Customer("James", true);
        shoppingBasket1 = new TheShoppingBasket(customer1);
        item1 = new Item("Jeans", 54.99f, true);
        item2 = new Item("jumper", 43.99f, false);
        item3 = new Item("FakeHair", 33.99f, true);
        item4 = new Item("Glasses", 20.00f, false);
        item4 = new Item("Ginger beard", 33.00f, true);
        item5 = new Item("string", 10.00f, false);
        item6 = new Item("Muffins", 2.00f, false);


    }

    @Test
    public void doesBasketsCustomerHaveLoyaltyCard(){
        boolean result = shoppingBasket1.customerHasLoyaltyCard();
        assertTrue(result);

    }
//
    @Test
    public void canAddItemToBasket(){
        shoppingBasket1.addItem(item1);
        assertEquals(1, shoppingBasket1.getTotalItems());
    }
}
