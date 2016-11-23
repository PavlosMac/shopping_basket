package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 23/11/2016.
 */

public class ItemTest {

    Item item1;

    @Before
    public void before(){

        item1 = new Item("air", 33.00f, true );
    }

    @Test
    public void testItemHasName(){
        assertEquals("air", item1.getDescription());
    }

    @Test
    public void itemHasBogof(){
        assertTrue(item1.getBogof());
    }


}
