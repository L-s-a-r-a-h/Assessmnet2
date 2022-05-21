/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author Sarah
 */
public class Model {
    
  //  public DBManager dbManager;
    public ArrayList <EventData> Edata;
    public CustomerData Cdata;
    public Database db;
   
    
    public Model(){
       // this.dbManager = new DBManager();
       this.db= new Database();
       this.Edata = new ArrayList();
        this.getEventsList();

    }
    
    public void getEventsList(){
        EventData thisEvent=null;
               this.Edata= db.getEventList();
               for(int i = 0;i<= this.Edata.size()-1;i++)
               {
                   thisEvent = this.Edata.get(i);
                   System.out.println(thisEvent.name.replace("_", " ")+" "+ thisEvent.date +" $" + thisEvent.price);
                   
               }
               
    }
    
        //get the event details for the event
    public EventData getEvent(String name) {
        EventData thisEvent = null;
        Edata.contains(thisEvent);
 
     return thisEvent;
    }
    
    public void CreateEvent (String name, String date, double price)
    {
 
       
        EventData newEvent = new EventData(name,date,price) ;
 
    }
    public boolean CheckEvent(String name)
    {
        return db.checkEvent(name);
    }


    public void addBooking(String EventName, String customerName, String cType,int seatNo) {
        System.out.println("yes hi");
        boolean exist = db.checkEvent(EventName);
        System.out.println("hello");
        if (db.checkEvent(EventName))
        {
            this.db.addBooking(EventName,customerName,cType,seatNo);
        }else
        {
            this.db.createEventBookingsTable(EventName);
            this.db.addBooking(EventName,customerName,cType,seatNo);


        }
        
        System.out.println("booked");

    }

}
