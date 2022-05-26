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
    public EventData eventData;
    public Booking booking;
    public Customer c;

    public Controller(EventView view, EventModel evModel) {
        this.evView = view;
        this.evModel = evModel;
        setTable();
        this.evView.addActionListener(this);

        //  this.bkModel=new BookingModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Add Event":
                 try {
                EventName = this.evView.getEventName();
                String EventDate = this.evView.getEventDate();

                String EventPrice = this.evView.getEventPrice();
                double dPrice = Double.parseDouble(EventPrice);
                eventData = new EventData(EventName, EventDate, dPrice);
                
                if (this.evModel.CreateEvent(eventData)) {
                    this.evView.setEventBox(EventName);

                    this.evView.addevent(eventData);

                    this.evView.setMessage("event created!");
                } else {
                    this.evView.setMessage("input error " + evModel.message);
                }

            } catch (NumberFormatException ex) {
                this.evView.setMessage("invalid !");

            }

            break;

            case "Add Booking": {

                EventName = this.evView.getSelectedEvent();
                bkModel = new BookingModel(this.evModel.db);
                if (bkView == null || bkView.isOpen() == false) {

                    bkView = new BookingView(EventName);
                        bkView.setSeats(bkModel.getSeats());
                    this.bkView.addActionListener(this);

                }
                break;
            }
            case "Add": {
                // System.out.println("Add");
                    String name = this.bkView.getCustomerName().trim();
                    String type = this.bkView.getCustomerType();
                    int seatNo = this.bkView.getSeatNo();
                    System.out.println(name + type+seatNo);
                    booking = new Booking(name, type, seatNo);
    
                    bkModel.addBooking(EventName, booking);
              
                       bkView.setMessage(bkModel.getMessage());
                   

            }
        }
    }

    private void setTable() {
        int size = this.evModel.Edata.size();
        // this.evView.setTablesize(size);
        for (int i = 0; i < size; i++) {
            String name = this.evModel.Edata.get(i).getName();

            this.evView.addevent(this.evModel.Edata.get(i));
            this.evView.setEventBox(name);

        }
    }
}
