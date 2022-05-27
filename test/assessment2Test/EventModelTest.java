package assessment2Test;

import assessmnet2.EventData;
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
public class EventModelTest {

    private EventModel model;
    private EventData data;

    @Before
    public void setUp() {
        model = new EventModel();
    }

    @Test
    public void testMain() {
        System.out.println("Event Model Test");
       // String[] args = null;

    }

    @Test
    public void checkEventInputEmptyName() {
        System.out.println("checkEventInput");
        String name = "";
        String date = "2022/12/22";
        double price = 60.0;
      
        data = new EventData(name,date,price);
        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
    
    
    @Test
    public void checkEventInvalidCharName() {
        System.out.println("checkEventInput");
        String name = "!@#$%^&*(___+;'.]/*-";
        String date = "2022/12/22";
        double price = 60.0;
      
        data = new EventData(name,date,price);
        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
    
      @Test
    public void checkEventNamewithSpace() {
        System.out.println("checkEventInput");
        String name = "hello how are you";
        String date = "2022/12/22";
        double price = 60.0;
      
        data = new EventData(name,date,price);
        boolean expResult = true;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }

    @Test
    public void checkEventInputNameOver50() {
        System.out.println("checkEventInput");
        String name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String date = "2022/12/22";
        double price = 60.0;
        data = new EventData(name,date,price);
        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }

    @Test
    public void checkEventInput1CharName() {
        System.out.println("checkEventInput");
        String name = "a";
        String date = "2022/12/22";
        double price = 60.0;

        data = new EventData(name,date,price);
        boolean expResult = true;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
    @Test
    public void checkEventInputEmptyDate() {
        System.out.println("checkEventInput");
        String name = "test2";
        String date = "";
        double price = 60.0;
        data = new EventData(name,date,price);
 
        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }

        @Test
        public void checkEventInputPastDate() {
        System.out.println("checkEventInput");
        String name = "test2";
        String date = "2022/05/12";
        double price = 60.0;
        data = new EventData(name,date,price);

        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
    @Test
    public void checkEventInputGoodDate() {
        System.out.println("checkEventInput");
        String name = "test2";
        String date = "2022/06/01";
        double price = 60.0;
      data = new EventData(name,date,price);

        boolean expResult = true;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
    
        @Test
    public void checkEventInputPriceLessThan0() {
        System.out.println("checkEventInput");
        String name = "test2";
        String date = "2022/12/23";
        double price = -10;
        data = new EventData(name,date,price);

        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
    @Test
        public void checkEventInputPriceis0() {
        System.out.println("checkEventInput");
        String name = "test2";
        String date = "2022/12/23";
        double price = 0;
        data = new EventData(name,date,price);

        boolean expResult = false;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }
            @Test
        public void checkEventInputPriceGreaterThan0() {
        System.out.println("checkEventInput");
        String name = "test2";
        String date = "2022/12/23";
        double price = 1;
   
        data = new EventData(name,date,price);
        boolean expResult = true;
        boolean result = model.checkEventInput(data);
        assertEquals(expResult, result);

    }

}
