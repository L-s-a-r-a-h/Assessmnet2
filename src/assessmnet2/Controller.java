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
    
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
switch (command){
    case "Add Event": 
        String EventName = this.view.getEventName();
    String EventDate = this.view.getEventDate();
    String EventPrice = this.view.getEventPrice();
            System.out.println(EventName +" "+EventDate);
            System.out.println(EventPrice);
            break;
    case "Add Booking":
    {
        String customerName = this.view.getCustomerName();
        System.out.println(customerName);
    }
}
    }
    
}
