/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2Test;

import assessmnet2.Booking;
import assessmnet2.BookingModel;
import assessmnet2.Database;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sarah
 */
public class BookingModelTest {

private BookingModel model;
private Database db ;

    @Before
    public void setUp() {
db=new Database();
model = new BookingModel(db);
    }

    @Test
    public void testMain() {
        System.out.println("Booking Model Test");
     //   String[] args = null;

    }
    
    @Test
    public void testAddBooking()
    {
        Booking bk = new Booking("bob","Student",2);
        String name = "Run Mummy Run";
        
      boolean result = model.addBooking(name,bk);
      boolean expResult = true;
              assertEquals(expResult, result);

    }
    
    //test if user enters blank string
    @Test
    public void testAddBookingEmptyString()
    {
        Booking bk = new Booking("","Student",2);
        String name = "Run Mummy Run";
        
      boolean result = model.addBooking(name,bk);
      boolean expResult = false;
              assertEquals(expResult, result);

    }
    
}
