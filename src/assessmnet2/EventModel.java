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
    public String message; //to set the error message for the display panel 

    public EventModel() {
        // this.dbManager = new DBManager();
        this.db = new Database();
        this.Edata = db.EdataList; //get arraylist of event data
        this.getEventsList();

    }

    public void getEventsList() {
        this.Edata = db.getEventList();

    }

    //get the event details for the event
 /*   public EventData getEvent(String name) {
        EventData thisEvent = null;
        Edata.contains(thisEvent);

        return thisEvent;
    } */
    
//create a new event and add it to the database

    public boolean CreateEvent(EventData data) {
        //check if the values entered are valid with the checkCventInput function
//return false if any of the values are invalid
        if (!checkEventInput(data)) {

            return false;
            //otherwise creates a new event in the database and adds it to the event data arraylist
        } else {
            this.db.addEvent(data);
            this.Edata.add(data);

            return true;
        }

    }
//checks the users input values for invalid input
    //if all the values are valid, it will return true, and if any of the values are invalid, it will return false

    public boolean checkEventInput(EventData data) {
        boolean isValid = true;
        //check the string value for blanks and non alphanumeric characters, annd checks the length
        // check the string for invalid characters that cannot be used to create new database table
        String name = data.getName().replaceAll("\\s+", "");
        name = name.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
        if (name.length() > 0 && name.length() <= 30) {
//check to see if the string starts with a number
//database cannot create table with name that starts with a number 
            if (Character.isDigit(name.charAt(0))) {
                isValid = false;
                this.message = "name cannot begin with a number";  //
            }
            if ((db.checkEvent(data.getName()))||(db.tableExists(name))) //check if event already exists in the database
            {
                isValid = false;
                this.message = "event with same name already exists";
            }
        } else {
            isValid = false;
            this.message = "name must have 1-30 alphnumerics";
        }
//checks if the price is within valid range
        if (data.getPrice() <= 0 || data.getPrice() > 1000) {
            isValid = false;
            this.message = "price must be greater than $0 and less than $1000";
        }
        // sanity check the date and checks the date format
        if (!checkDate(data.getDate())) {
            message = "invalid date";
            isValid = false;
        }

        return isValid;

    }
    // sanity check the date and check the format

    public boolean checkDate(String EventDate) {
        boolean isValid;
        LocalDate ld = LocalDate.now(); // get the current date 
        String todayStr = ld.toString(); //change the current date to string  
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd"); // required format of date
        format.setLenient(false); //make it so cannot enter non existant dates like 2022/20/30
        try {
            // change the current date format 
            todayStr = todayStr.replace("-", "/");
            // parse the user entered date, if not in the correct format it will set the error message
            // check to see if the entered date is in the future,
            // if the date is past, it will set the error message
            Date todayDate = format.parse(todayStr);
            Date evdate = format.parse(EventDate);

            if (evdate.after(todayDate)) {
                isValid = true;
            } else {
                this.message = "invalid date";
                isValid = false;
            }

        } catch (Exception e) {

            System.out.println("Date error " + e.getMessage());
            isValid = false;
        }

        return isValid;
    }

    // get the price for the selected event
    public double getEventPrice(String evName) {
        double price = 0;
        for (int i = 0; i < this.Edata.size(); i++) {
            if (this.Edata.get(i).getName() == evName) {
                price = this.Edata.get(i).getPrice();

            }
        }
        return price;

    }

}
