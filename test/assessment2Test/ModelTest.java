package assessment2Test;

import assessmnet2.EventModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah
 */
public class ModelTest {

    private EventModel model;

    @Before
    public void setUp() {
        model = new EventModel();
    }

    @Test
    public void testMain() {
        System.out.println("Model");
        String[] args = null;

    }

    @Test
    public void checkEventInputEmptyName() {
        System.out.println("checkEventInput");
        String name = "";
        String date = "11/12/22";
        double price = 60.0;
        EventModel instance = new EventModel();
        boolean expResult = false;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }

    @Test
    public void checkEventInputNameOver50() {
        System.out.println("checkEventInput");
        String name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String date = "11/12/22";
        double price = 60.0;
        EventModel instance = new EventModel();
        boolean expResult = false;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }

    @Test
    public void checkEventInput1CharName() {
        System.out.println("checkEventInput");
        String name = "a";
        String date = "11/12/22";
        double price = 60.0;
        EventModel instance = new EventModel();
        boolean expResult = true;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }
    @Test
    public void checkEventInputEmptyDate() {
        System.out.println("checkEventInput");
        String name = "test";
        String date = "";
        double price = 60.0;
        EventModel instance = new EventModel();
        boolean expResult = false;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }

        @Test
        public void checkEventInputPastDate() {
        System.out.println("checkEventInput");
        String name = "test";
        String date = "01/02/12";
        double price = 60.0;
        EventModel instance = new EventModel();
        boolean expResult = false;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }
    @Test
    public void checkEventInputGoodDate() {
        System.out.println("checkEventInput");
        String name = "test";
        String date = "01/02/23";
        double price = 60.0;
        EventModel instance = new EventModel();
        boolean expResult = true;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }
    
        @Test
    public void checkEventInputPriceLessThan0() {
        System.out.println("checkEventInput");
        String name = "test";
        String date = "01/02/23";
        double price = -10;
        EventModel instance = new EventModel();
        boolean expResult = false;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }
    @Test
        public void checkEventInputPriceis0() {
        System.out.println("checkEventInput");
        String name = "test";
        String date = "01/02/23";
        double price = 0;
        EventModel instance = new EventModel();
        boolean expResult = false;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }
            @Test
        public void checkEventInputPriceGreaterThan0() {
        System.out.println("checkEventInput");
        String name = "test";
        String date = "01/02/23";
        double price = 1;
        EventModel instance = new EventModel();
        boolean expResult = true;
        boolean result = instance.checkEventInput(name, date, price);
        assertEquals(expResult, result);

    }

}
