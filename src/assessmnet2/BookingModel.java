/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sarah
 */
public class BookingModel {

    //  public Booking Cdata;
    public Database db;
    public ArrayList<Integer> bookedSeats; // list of unavailable seats
    private String message;
    private String seats;

    public BookingModel(Database db) {
        // this.dbManager = new DBManager();

        this.db = db;
        this.bookedSeats = new ArrayList();

    }

    public String getMessage() {
        return this.message;
    }

    public boolean addBooking(String eventName, Booking bk) {
       // System.out.println("add Booking");
String name = eventName.replaceAll("[^a-zA-Z0-9]", "");
name =name.replaceAll("\\s+", "");
        if (db.checkEvent(eventName)) {

            getBookings(name);
            if (checkSeat(bk.seatNo)) {
                this.db.addBooking(name, bk);
                this.message = "success";
                return true;
            } else {
                this.message = "seat unavailable";
                return false;
            }
        } else {
            this.message = "error";
            return false;

        }

    }
//check if selected seat is not available return false
    private boolean checkSeat(int seatNo) {
        
        return !this.bookedSeats.contains(seatNo);

    }
//checks if user input is valid
    public boolean checkInput(String str) {
      // str= str.replaceAll("[0-9]", "");
        if (str.isBlank()) {
            this.message = "Please enter customer name";
            return false;
        } else {
            return true;
        }

    }
    
 // get the unavailable seats for the selected event    
    public String getBookings(String event) {
    try{
        this.bookedSeats = this.db.getEventSeats(event);
    

        if (!this.bookedSeats.isEmpty()) {
            //  System.out.println(this.bookedSeats.toString());
            //put the seat values in order
            Collections.sort(bookedSeats);
            return this.bookedSeats.toString();

        } else {
            seats = "none";
        }
        return seats;
        }
    catch(Exception ex){
        System.out.println("get bookings error"+ex.getMessage());
    }
        return null;

    }

}
