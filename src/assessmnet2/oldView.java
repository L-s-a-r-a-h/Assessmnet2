/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sarah
 */
public class oldView extends JFrame implements Observer {

    private JPanel bsPanel= new JPanel();
    private JLabel eventListLabel = new JLabel("Event List");
    private JList eventList = new JList();
    private JLabel newEventLabel = new JLabel("Add new event");
    // for creating new event
    private JLabel eventNameLabel = new JLabel("Event name: "); 
            public JTextField eventNamefield = new JTextField(20); // field to enter event name 

    private JLabel eventDateLabel = new JLabel("Event date: ");
    public JTextField eventDatefield = new JTextField(20); // field to enter event date 

    private JButton deleteEventButton = new JButton();
    private JButton createEventButton = new JButton();
    private JButton addBookingButton = new JButton();
    private JButton deleteBookingButton = new JButton();
    
    private JComboBox selectEventBox = new JComboBox(); 
      private JLabel errorMessageLabel = new JLabel();



    public oldView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComp();
        this.setSize(1300, 800);
      
        this.add(bsPanel);
        this.setVisible(true);
    }
    
    public void initComp(){
        
        this.eventListLabel.setFont(new Font ("Arial",Font.PLAIN, 25));
        this.eventListLabel.setAlignmentX(TOP_ALIGNMENT);
          this.bsPanel.add(eventListLabel);
        this.bsPanel.add(eventDateLabel);
        
    }

    @Override
    public void update(Observable arg0, Object arg1) {
    }

    void addActionListener(ActionListener Listener) {
        this.deleteBookingButton.addActionListener(Listener);
        this.createEventButton.addActionListener(Listener);
        this.deleteEventButton.addActionListener(Listener);
        this.addBookingButton.addActionListener(Listener);
    }

}
