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

    public View view;
    public Model model;
    String EventName;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Add Event":

 
    try {

                EventName = this.view.getEventName();
                String EventDate = this.view.getEventDate();
                String EventPrice = this.view.getEventPrice();
                double dPrice = Double.parseDouble(EventPrice);

                if (dPrice <= 0) {
                    this.view.setMessage("invalid price must be greater than 0!");
                } else {
                    this.model.CreateEvent(EventName, EventDate, dPrice);
                    System.out.println(EventName + " " + EventDate);
                            this.view.setEventBox(EventName);
                               this.view.setMessage("success!");

                }
            } catch (NumberFormatException ex) {
                this.view.setMessage("invalid seat price!");

            }

            break;
            case "Add Booking": {
                String customerName = this.view.getCustomerName();
                String cType = this.view.getCustomerType();
                int seatNo = this.view.getSeatNo();
                try {
                    EventName = this.view.getSelectedEvent();
                     System.out.println(EventName+" "+customerName + " " + cType);
                    this.model.addBooking(EventName, customerName, cType,seatNo);
                   
                } catch (NullPointerException ex) {
                    this.view.setMessage("please select event!");
                    System.out.println("please selecet or create new event");
                }

            }
        }
    }

}
