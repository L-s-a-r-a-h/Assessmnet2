/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sarah
 */
public class Database {

    private final DBManager manager;
    private final Connection conn;
    private Statement statement;

    public ArrayList<EventData> EdataList;
    // public Booking Cdata;

    Database() {
        this.EdataList = new ArrayList();
        manager = new DBManager();
        manager.dbSetup();
        conn = manager.getConnection();
        this.initDB();
        this.setEventDetails();

        // initDB();
    }

// get the arraylist of events
    public ArrayList getEventList() {
        return this.EdataList;
    }

    private void initDB() {
        try {
            this.statement = conn.createStatement();
         //   this.statement.executeUpdate("DROP TABLE EVENTS");

            this.statement.executeUpdate("CREATE  TABLE EVENTS  (  eventName   VARCHAR(50),   eventDate   VARCHAR(20),   PRICE   DOUBLE)");
            System.out.println("table created");
            this.statement.executeUpdate("INSERT INTO EVENTS VALUES ( 'Slum Dog Millionaire', '11/12/2022', 19.90),\n"
                    + "( 'Run Mummy Run', '30/06/2022', 28.00),\n"
                    + "('The Land of Painted Caves', '30/06/2022', 15.40),\n"
                    + "( 'Cook with Jamie', '13/09/2022', 55.20),\n"
                    + "('Far Eastern Odyssey', '20/07/2022', 24.90)");

        } catch (Exception ex) {
           // System.out.println("Please start Java db server");
        }
    }

    // put the events from the database into an arraylist
    private void setEventDetails() {

        try {
            ResultSet rs = queryDB("SELECT * FROM EVENTS");
            while (rs.next()) {
                String name = rs.getString("eventName");
                String date = rs.getString("eventDate");
                double price = rs.getDouble("PRICE");
                EventData eventData = new EventData(name, date, price);
                this.EdataList.add(eventData);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException e) {
            System.out.println("set event error " + e.getMessage());
        }

    }

    // query the database
    private ResultSet queryDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    // add the new event to the database
    public void addEvent(EventData newEvent) {
        String name = (newEvent.getName());

        try {
            this.statement.executeUpdate("INSERT INTO EVENTS VALUES ( '" + name + "', '" + newEvent.getDate() + "', " + newEvent.getPrice() + ")");
            createTable(name);
            this.EdataList.add(newEvent);
        } catch (SQLException ex) {
            System.out.println("add event error " + ex.getMessage());
        }
    }
// create a new table for an events seat bookings

    private void createTable(String str) {
        String name = str.replaceAll("\\s+", "");
        try {
            this.statement.executeUpdate("CREATE TABLE " + name + " (cName VARCHAR(20), seatNo INT, cType VARCHAR(20))");
            System.out.println(name + "  Table created");
        } catch (SQLException ex) {
            // System.out.println("createEventBookingsTable error " + ex.getMessage());
        }
    }

 
    // create a new booking table when a new event is created
//check to see if the event exists
    public boolean checkEvent(String eventName) {
        boolean exists = false;

        ResultSet rs = queryDB("SELECT * FROM EVENTS WHERE eventName = '" + eventName + "'");
        try {
            if (rs.next()) {
                System.out.println("event exists");
                exists = true;
            } else {
                System.out.println("event does not exist");
                exists = false;
            }
        } catch (SQLException ex) {
            System.out.println("checkEvent error : " + ex.getMessage());
        }

        return exists;

    }

// add customer booking to selected event
    public void addBooking(String EventName, Booking customer) {
        String name = EventName.replaceAll("\\s+", "");
        if (!tableExists(name)) {
            createTable(name);
        }
        try {
            this.statement.executeUpdate("INSERT INTO " + name + " VALUES ('" + (customer.name) + "'," + customer.seatNo + ", '" + customer.type + "')");
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

    public ArrayList getEventSeats(String EventName) {
        ArrayList seatList = new ArrayList();
        String name =EventName.replaceAll("\\s+", "");
        ResultSet rs = queryDB("SELECT seatNo FROM " + name);
        int thisSeat;
        try {
            while (rs.next()) {
                thisSeat = rs.getInt("seatNo");
           //     System.out.println(thisSeat);
                seatList.add(thisSeat);
             //   System.out.println(seatList.toString());
            }
    
        } catch (Exception ex) {
            System.out.println("get event seats error : " + ex.getMessage());
        }

        return seatList;

    }

    private boolean tableExists(String name) {
        boolean exists = false;
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, name, null);

            exists = rs.next();
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        return exists;
    }

   
}
