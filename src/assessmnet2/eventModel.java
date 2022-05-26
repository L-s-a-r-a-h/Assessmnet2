/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sarah
 */
public class EventModel {

    //  public DBManager dbManager;
    public ArrayList<EventData> Edata = new ArrayList();
    public Database db;
    public String message;

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
            System.out.println(thisEvent.getName() + " " + thisEvent.getDate() + " $" + thisEvent.getPrice());

        }

    }

    //get the event details for the event
    public EventData getEvent(String name) {
        EventData thisEvent = null;
        Edata.contains(thisEvent);

        return thisEvent;
    }

    public boolean CreateEvent(EventData data) {

        if (!checkEventInput(data)) {
            System.out.println("Input error");
            return false;
        } else {
            this.db.addEvent(data);
            this.Edata.add(data);

            return true;
        }

    }

    public boolean checkEventInput(EventData data) {
        boolean isValid = true;

        if (data.getName().length() > 0 && data.getName().length() <= 50) {

            if (Character.isDigit(data.getName().charAt(0))) {
                isValid = false;
                this.message = "name cannot begin with a number";
            }
            if (db.checkEvent(data.getName())) //if event already exists
            {
                isValid = false;
                this.message = "event with same name already exists";
            }
        } else {
            isValid = false;
            this.message = "name must have between 1 and 50 alphabetic characters";
        }

        if (data.getPrice() <= 0 || data.getPrice() > 1000) {
            isValid = false;
            this.message = "price must be greater than $0 and less than $1000";
        }
        if (!checkDate(data.getDate())) {
            message = "invalid date";
            isValid = false;
        }
        System.out.println(message);
        return isValid;

    }

    public boolean checkDate(String EventDate) {
        boolean isValid;
        LocalDate ld = LocalDate.now();
        String todayStr = ld.toString();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd"); // required format of date

        try {
            todayStr = todayStr.replace("-", "/");

            Date todayDate = format.parse(todayStr);
            Date evdate = format.parse(EventDate);
            if (evdate.after(todayDate)) {
                isValid = true;
            } else {
                this.message = "invalid date";
                isValid = false;
            }

        } catch (Exception e) {
            // Logger.getLogger(BookingSystem.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Date error " + e.getMessage());
            isValid = false;
        }

        return isValid;
    }

    public double getEventPrice(String evName) {
        double price = 0;
        for (int i = 0; i < this.Edata.size(); i++) {
            if (this.Edata.get(i).getName() == evName) {
                price = this.Edata.get(i).getPrice();
                System.out.println(price);
            }
        }
        return price;

    }

}
