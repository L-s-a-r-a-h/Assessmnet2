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
    public CustomerData Cdata;

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
            this.statement.executeUpdate("DROP TABLE EVENTS");
            if (!this.checkTableExisting("EVENTS")) {
                this.statement.executeUpdate("CREATE  TABLE EVENTS  (eventID  INT,   eventName   VARCHAR(50),   eventDate   VARCHAR(20),   PRICE   DOUBLE)");
                System.out.println("table created");
                this.statement.executeUpdate("INSERT INTO EVENTS VALUES (1, 'Slum_Dog_Millionaire', '11/12/2022', 19.90),\n"
                        + "(2, 'Run_Mummy_Run', '30/06/2022', 28.00),\n"
                        + "(3, 'The_Land_of_Painted_Caves', '30/06/2022', 15.40),\n"
                        + "(4, 'Cook_with_Jamie', '13/09/2022', 55.20),\n"
                        + "(5, 'Far_Eastern_Odyssey', '20/07/2022', 24.90)");
            } else {
                System.out.println("table exists");
            }

        } catch (SQLException ex) {
            System.out.println("error  " + ex.getMessage());
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
    
// create a new table for an events seat bookings
    public void createEventBookingsTable(String tableName) {
        if (checkTableExisting(tableName) == false) {
            try {
                this.statement.executeUpdate("CREATE TABLE " + tableName + " (cName VARCHAR(20), seatNo INT, cType VARCHAR(20))");
            } catch (SQLException ex) {
                System.out.println("error");
            }
        }

    }
// check the database to see if a table for the bookings for an event exists
    private boolean checkTableExisting(String tableName) {
        boolean flag = false; //table does not exist
        String name = tableName.replace(" ", "_");
        try {
            System.out.println(tableName);
            System.out.println("checking tables...");
            DatabaseMetaData dm = conn.getMetaData();
            ResultSet rs = dm.getTables(null, null, tableName, null);
            if (rs.next()) {
                flag = true;

            } else {
                flag = false;
            }
        } catch (SQLException ex) {
            System.out.println("table error");
        }
        return flag;
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
        }

    }

    public boolean checkEvent(String eventName) { //check to see if the event exists
        boolean exists = false;
        String name = eventName.replace(" ", "_");
         ResultSet rs =   queryDB("SELECT * FROM EVENTS WHERE eventName = '"+name+"'");
        try {
            if (rs.next())
            {
                System.out.println("table exists");
                exists = true;
            }else{
                System.out.println(" does not exist");
             exists = false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        

        return exists;

    }

   /* private void showEventList() {
        for (EventData i : EdataList) {
            System.out.println(i.name.replace("_", " ") + " " + i.date + " " + i.price);
        }
    } */

    public void addBooking(String EventName, String customerName, String cType,int seatNo) {
        String tableName = EventName.replace(" ", "_");
        try {
            this.statement.executeUpdate("INSERT INTO "+tableName+" VALUES ('" +customerName+"',"+seatNo+" '"+cType+"')");
        } catch (SQLException ex) {
            System.out.println("error: "+ ex.getMessage());
        }
    }

 
}
