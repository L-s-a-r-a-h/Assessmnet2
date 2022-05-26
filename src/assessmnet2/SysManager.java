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


    SysManager(EventView view, EventModel evModel) {
        this.evView = view;
        this.evModel = evModel;
        setTable();
    }

    public void addEvent() {
        if (bkView == null || bkView.isOpen() == false) {

            try {
                EventName = this.evView.getEventName();
                String EventDate = this.evView.getEventDate();

                String EventPrice = this.evView.getEventPrice();
                double dPrice = Double.parseDouble(EventPrice);
                eventData = new EventData(formatString(EventName), EventDate, dPrice);

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

        } else {
            this.evView.setMessage("Please close booking panel");
            System.out.println("please close booking panel");
        }

    }

    public void addBooking(Controller control) {
        if (bkView == null || bkView.isOpen() == false) {
        EventName = (this.evView.getSelectedEvent());
        bkModel = new BookingModel(this.evModel.db);
        
            bkView = new BookingView(EventName);
            this.price = evModel.getEventPrice(EventName);
            this.bkView.setSeats(this.bkModel.getBookings(EventName));
            this.bkView.addActionListener(control);
            //this.open = true;

        }else{
            this.evView.setMessage("Please close booking panel");
        }
    }

    public void add() {
        try {

           
            String name = formatString(this.bkView.getCustomerName());
            String type = this.bkView.getCustomerType();
            int seatNo = this.bkView.getSeatNo();
            
            getCustomer(type);
            System.out.println(name + this.c.customerType + seatNo);
            booking = new Booking(name, this.c.customerType, seatNo);

            bkModel.addBooking(EventName, booking);
            this.bkView.setSeats(this.bkModel.getBookings(EventName));
            bkView.setMessage(bkModel.getMessage());
            bkView.setPriceLabel(c.getInfo()+ " :  $"+this.c.getCost());
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
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

    private String formatString(String str) {

        return str.replaceAll("[^a-zA-Z0-9]+", "").trim();
    }

    
    private void getCustomer(String str){
        switch (str)
        {
            case "Adult":
            {
                this.c=new Adult(this.price);
                break;
            }
            case "Student":
            {
                this.c=new Student(this.price);
                break;
            }
                        case "Child":
            {
                this.c=new Child(this.price);
                break;
            }
                        case "Senior":
            {
                this.c=new Senior(this.price);
                break;
            }
        }
    }
}
