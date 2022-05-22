/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sarah
 */
public class Controller implements ActionListener {

    public EventView evView;
    public EventModel evModel;
    public BookingModel bkModel;
    String EventName;
    public BookingView bkView = null;

    public Controller(EventView view, EventModel evModel) {
        this.evView = view;
        this.evModel = evModel;
        this.evView.addActionListener(this);
      //  this.bkModel=new BookingModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
          try{
                    
             
        switch (command) {
            case "Add Event":

 
    try {
                EventName = this.evView.getEventName().trim();
                String EventDate = this.evView.getEventDate().trim();
                String EventPrice = this.evView.getEventPrice().trim();
                double dPrice = Double.parseDouble(EventPrice);
              /* if(!this.model.checkDate(EventDate)) 
               {
                   this.view.setMessage("Date error");
               }*/
               if( this.evModel.CreateEvent(EventName, EventDate, dPrice))
               {
                    this.evView.setEventBox(EventName);
                    this.evView.setMessage("event created!");
               }
       
            } catch (NumberFormatException ex) {
                this.evView.setMessage("invalid !");

            }
                   
            break;

            case "Add Booking": {
              
                 EventName = this.evView.getSelectedEvent();
                 if (bkView == null|| bkView.isOpen() ==false)
                 {
                            String BKcommand = e.getActionCommand();
        switch (BKcommand) {
            case "Add":
                
                break;
            case "Cancel":
                
                bkView.close();
                bkView = null;
                break;
        }
                     
                            bkView = new BookingView();
                 }
                 else
                 {
                     System.out.println("already open");
                 }
          
                 //get the available seats for the event
                
              /*  String customerName = this.evView.getCustomerName();
                String cType = this.evView.getCustomerType();
                int seatNo = this.evView.getSeatNo();
                try {
                   
                    System.out.println(EventName + " " + customerName + " " + cType);
                    this.bkModel.addBooking(EventName, customerName, cType, seatNo);

                } catch (NullPointerException ex) {
                    this.evView.setMessage("please select event!");
                    System.out.println("please selecet or create new event");
              
                } 
                */
              
break;

            }
            default :

        }
    
   }catch(NullPointerException ex)
                {
                    System.out.println("error : no events");
                }
    }
}
