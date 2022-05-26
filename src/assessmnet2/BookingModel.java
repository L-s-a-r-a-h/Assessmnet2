/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

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
        System.out.println("add Booking");

        if (db.checkEvent(eventName)) {
            getBookings(eventName);
            if (checkSeat(bk.seatNo)) {
                this.db.addBooking(eventName, bk);
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

    private boolean checkSeat(int seatNo) {
        //if seat is not available return false
        return !this.bookedSeats.contains(seatNo);

    }
    
    public void checkInput(String str)
    {
        this.message = "";
    }

    public String getBookings(String event) {
        this.bookedSeats = this.db.getEventSeats(event);
      
        if (!this.bookedSeats.isEmpty()) {
            System.out.println(this.bookedSeats.toString());
            Collections.sort(bookedSeats);
      return this.bookedSeats.toString();

        }
        else
        {
            seats = "none";
        }
        return seats;

    }



}
