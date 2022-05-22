/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

/**
 *
 * @author Sarah
 */
public class BookingModel {
      public CustomerData Cdata;
          public Database db;
      
          public BookingModel() {
        // this.dbManager = new DBManager();
        this.db = new Database();
        this.Cdata = db.Cdata;
    

    }
    public void addBooking(String EventName, String customerName, String cType, int seatNo) {
        System.out.println("add Booking");
        boolean exist = db.checkEvent(EventName);
        System.out.println("hello");
        if (db.checkEvent(EventName)) {
            this.db.addBooking(EventName, customerName, cType, seatNo);
        } else {
            //  this.db.createEventBookingsTable(EventName);
            this.db.addBooking(EventName, customerName, cType, seatNo);

        }


    }
}
