package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/11/2016.
 */

public class CustomerTest {

    Customer customer;


    @Before
    public void before(){

         customer = new Customer("Henry", false);
    }



    @Test
    public void testCustomerHasName(){
        String name = customer.getName();
        assertEquals("Henry", name);
    }

//  @Test
    public void testCustomerHasLoyaltyCard(){
        assertEquals(false, customer.hasLoyaltyCard());
    }
//
}
