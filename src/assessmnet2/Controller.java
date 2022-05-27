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
    public BookingView bkView = null;

    public SysManager manager;

    public Controller(EventView view, EventModel evModel) {
        this.evView = view;

        this.evView.addActionListener(this);
        manager = new SysManager(view, evModel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Add Event":
                manager.addEvent();

                break;

            case "Add Booking": {
                manager.addBooking(this);

                break;
            }
            case "Add": {
                manager.add();
            }

        }
    }
}
