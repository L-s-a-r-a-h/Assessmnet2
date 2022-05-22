/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Observable;

/**
 *
 * @author Sarah
 */
public class EventModel extends Observable {

    //  public DBManager dbManager;
    public ArrayList<EventData> Edata = new ArrayList();
    public Database db;

    public EventModel() {
        // this.dbManager = new DBManager();
        this.db = new Database();
        this.Edata = db.EdataList;
        this.getEventsList();

    }

    public void getEventsList() {
        EventData thisEvent = null;
        this.Edata = db.getEventList();
        for (int i = 0; i <= this.Edata.size() - 1; i++) {
            thisEvent = this.Edata.get(i);
            System.out.println(thisEvent.name + " " + thisEvent.date + " $" + thisEvent.price);

        }

    }

    //get the event details for the event
    public EventData getEvent(String name) {
        EventData thisEvent = null;
        Edata.contains(thisEvent);

        return thisEvent;
    }

    public boolean CreateEvent(String name, String date, double price) {

        EventData newEvent = new EventData(name, date, price);
        if (!checkEventInput(name, date, price)) {
            System.out.println("Input error");
            return false;
        } else {
            this.db.addEvent(newEvent);
            this.Edata.add(newEvent);
                    this.setChanged();
        this.notifyObservers(this.Edata);
return true;
        }


    }

    public boolean checkEventInput(String name, String date, double price) {
        boolean isValid = true;
        String message = "";
        if (name.length() > 0 && name.length() <= 50) {
            if (db.checkEvent(name)) //if event already exists
            {
                isValid = false;
            }
        } else {
            isValid = false;
            message = "name lenth must be between 1 and 50 characters";
        }
        if (price <= 0) {
            isValid = false;
            message = "price must be greater than $0";
        }
        if (!checkDate(date)) {
            message = "invalid date";
            isValid = false;
        }
        System.out.println(message);
        return isValid;
    }


    public boolean checkDate(String EventDate) {
        boolean isValid = false;
    //    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy");
SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy"); // required format of date

        try {
            Date date = format.parse(EventDate);

      //  format.parse(EventDate);
        //    if (thisDate.isAfter(today)) {
                isValid = true;
           // }
          //  thisDate = thisDate.format(format);
        } catch (Exception e) {
            // Logger.getLogger(BookingSystem.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Date error "+e.getMessage());
            isValid = false;
        }

        return isValid;
    }

}
