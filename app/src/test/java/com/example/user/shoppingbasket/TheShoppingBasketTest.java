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
    Item item7;


    @Before
    public void before(){

        Customer customer1 = new Customer("James", true);
        shoppingBasket1 = new TheShoppingBasket(customer1);
        item1 = new Item("Jeans", 54.99f, true);
        item2 = new Item("jumper", 43.99f, false);
        item3 = new Item("FakeHair", 33.99f, true);
        item4 = new Item("Glasses", 20.00f, false);
        item5 = new Item("Ginger beard", 33.00f, true);
        item6 = new Item("string", 10.00f, false);
        item7 = new Item("Muffins", 2.00f, false);
        shoppingBasket1.addItem(item1);
        shoppingBasket1.addItem(item2);
        shoppingBasket1.addItem(item3);
        shoppingBasket1.addItem(item4);
        shoppingBasket1.addItem(item5);
        shoppingBasket1.addItem(item6);
        shoppingBasket1.addItem(item7);


    }

    @Test
    public void doesBasketsCustomerHaveLoyaltyCard(){
        boolean result = shoppingBasket1.customerHasLoyaltyCard();
        assertTrue(result);

    }
//

    @Test
    public void canAddItemToBasket(){
        assertEquals(7, shoppingBasket1.getTotalItems());
    }


    @Test
    public void canRemoveItemsFromBasket(){
        shoppingBasket1.removeItem(item3);
        assertEquals(6, shoppingBasket1.getTotalItems());
    }
//
//
    @Test
    public void testCanMakeOverCertainSumDiscountOnBasket(){
        assertEquals(174.61, shoppingBasket1.getBasketSum());
    }
//
    @Test
    public void testShoppingBasketTotalAdjustedAfterLoyaltyCardCheck(){
        shoppingBasket1.loyaltyCardAdjustmentToBasket();
        assertEquals(174.61, shoppingBasket1.getBasketSum());
    }

    @Test
    public void testCustomerCanChooseFreeBogofItem(){
        shoppingBasket1.addTwinOfBogofItemToBasket(item1);
        assertEquals(8, shoppingBasket1.getTotalItems());
        assertEquals(174.61, shoppingBasket1.getBasketSum());
    }
}
