/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

/**
 *
 * @author Sarah
 */
public class SysManager {

    public EventView evView;
    public EventModel evModel;
    public BookingModel bkModel;
    String EventName;
    public BookingView bkView = null;
    private EventData eventData;
    private Booking booking;
    private Customer c;
    private double price;
    private String str;

  public  SysManager(EventView view, EventModel evModel) {
        this.evView = view;
        this.evModel = evModel;
        setTable();
    }

    public void addEvent() {
        // user cannot add a new event when the booking panel is open
        if (bkView == null || bkView.isOpen() == false) {
// get the user inputs from the event panel and checks for invalid input
            try {
                EventName = this.evView.getEventName();
                String EventDate = this.evView.getEventDate();
                String EventPrice = this.evView.getEventPrice();
                double dPrice = Double.parseDouble(EventPrice);
                System.out.println(EventName);
                eventData = new EventData((EventName), EventDate, dPrice);
// create a new event with the user input
                if (this.evModel.CreateEvent(eventData)) {
                    this.evView.setEventBox(EventName);

                    this.evView.addevent(eventData);

                    this.evView.setMessage("event created!");
                } else {
                    this.evView.setMessage("input error: " + evModel.message);
                }

            } catch (NumberFormatException ex) {
                this.evView.setMessage("invalid price");

            }

        } else {
            this.evView.setMessage("Please close booking panel");
        }

    }

    
    //add a booking for customer
    //controllers action listener is parsed
    public void addBooking(Controller control) {
        // if the add booking panel, it will not open a new panel
        // user must exit booking panel before opening another one
          try{
        if (bkView == null || bkView.isOpen() == false) {
          
            EventName = (this.evView.getSelectedEvent());
            bkModel = new BookingModel(this.evModel.db);
//open new booking panel 
            bkView = new BookingView(EventName);
            this.price = evModel.getEventPrice(EventName);
            this.bkView.setSeats(this.bkModel.getBookings(EventName));
            // need to add action listener to add button
            this.bkView.addActionListener(control);
     
        } else {
            this.evView.setMessage("Please close booking panel");
        }
               }catch(NullPointerException e){
                this.evView.setMessage("No events to add bookings. Please add new event");
            }

    }
// add a booking for the selected event
    public void add() {
        try {

            String name = formatString(this.bkView.getCustomerName());
            if (bkModel.checkInput(name)) {
                String type = this.bkView.getCustomerType();
                int seatNo = this.bkView.getSeatNo();

                getCustomer(type);
               // System.out.println(name + this.c.customerType + seatNo);
                booking = new Booking(name, this.c.customerType, seatNo);

                bkModel.addBooking(EventName, booking);
                this.bkView.setSeats(this.bkModel.getBookings(EventName));
                bkView.setMessage(bkModel.getMessage());
                bkView.setPriceLabel(c.getInfo() + " :  $" + this.c.getCost());
            } else {
                this.bkView.setMessage(this.bkModel.getMessage());
            }

        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }

    }
//set the table of event data
    private void setTable() {
        int size = this.evModel.Edata.size();
        // this.evView.setTablesize(size);
        for (int i = 0; i < size; i++) {
            String name = this.evModel.Edata.get(i).getName();

            this.evView.addevent(this.evModel.Edata.get(i));
            this.evView.setEventBox(name);

        }
    }
//format user input to remove invalid characters
    private String formatString(String str) {

            return str.replaceAll("[^a-zA-Z0-9+]", "").trim();
    }

    // gets prices for different customer types
    private void getCustomer(String str) {
        switch (str) {
            case "Adult": {
                this.c = new Adult(this.price);
                break;
            }
            case "Student": {
                this.c = new Student(this.price);
                break;
            }
            case "Child": {
                this.c = new Child(this.price);
                break;
            }
            case "Senior": {
                this.c = new Senior(this.price);
                break;
            }
        }
    }
}
