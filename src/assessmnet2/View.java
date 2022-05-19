/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Sarah
 */
public class View extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form View2
     */
    public View() {
        initComponents();
    
    this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BSLabel = new javax.swing.JLabel();
        addBookingPanel = new javax.swing.JPanel();
        customerNameLabel = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        eventSelectLabel = new javax.swing.JLabel();
        eventsBox = new javax.swing.JComboBox<>();
        customerTypeBox = new javax.swing.JComboBox<>();
        customerTypeLabel = new javax.swing.JLabel();
        addBookingButton = new javax.swing.JButton();
        seatNoLanel = new javax.swing.JLabel();
        seatNumberBox = new javax.swing.JComboBox<>();
        addEventPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventsListList = new javax.swing.JList<>();
        eventNameLabel = new javax.swing.JLabel();
        eventNameField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        createEventButton = new javax.swing.JButton();
        newEventLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BSLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BSLabel.setText("BOOKING SYSTEM");

        customerNameLabel.setText("Customer Name: ");

        customerNameField.setText("Enter name");

        eventSelectLabel.setText("Select Event:");

        eventsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        customerTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        customerTypeLabel.setText("Type: ");

        addBookingButton.setText("Add booking");

        seatNoLanel.setText("Seat number: ");

        seatNumberBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout addBookingPanelLayout = new javax.swing.GroupLayout(addBookingPanel);
        addBookingPanel.setLayout(addBookingPanelLayout);
        addBookingPanelLayout.setHorizontalGroup(
            addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNameLabel)
                    .addComponent(eventSelectLabel)
                    .addComponent(customerTypeLabel)
                    .addComponent(seatNoLanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBookingButton)
                .addGap(31, 31, 31))
        );
        addBookingPanelLayout.setVerticalGroup(
            addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookingPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventSelectLabel)
                    .addComponent(eventsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerTypeLabel))
                .addGap(18, 18, 18)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatNoLanel)
                    .addComponent(seatNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBookingButton)
                .addGap(85, 85, 85))
        );

        eventsListList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(eventsListList);

        eventNameLabel.setText("Event name:");

        eventNameField.setText("jTextField1");

        dateField.setText("jTextField1");

        dateLabel.setText("Event date:");

        priceField.setText("jTextField2");

        createEventButton.setText("Add Event");

        newEventLabel.setText("Add a new event:");

        priceLabel.setText("Seat price:");

        javax.swing.GroupLayout addEventPanelLayout = new javax.swing.GroupLayout(addEventPanel);
        addEventPanel.setLayout(addEventPanelLayout);
        addEventPanelLayout.setHorizontalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addEventPanelLayout.createSequentialGroup()
                                .addComponent(eventNameLabel)
                                .addGap(35, 35, 35)
                                .addComponent(eventNameField))
                            .addGroup(addEventPanelLayout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addGap(39, 39, 39)
                                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(priceLabel)
                                .addGap(18, 18, 18)
                                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createEventButton)
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(addEventPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        addEventPanelLayout.setVerticalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventNameLabel)
                    .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(createEventButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addEventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BSLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(addBookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BSLabel)
                .addGap(18, 18, 18)
                .addComponent(addEventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BSLabel;
    private javax.swing.JButton addBookingButton;
    private javax.swing.JPanel addBookingPanel;
    private javax.swing.JPanel addEventPanel;
    private javax.swing.JButton createEventButton;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JComboBox<String> customerTypeBox;
    private javax.swing.JLabel customerTypeLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField eventNameField;
    private javax.swing.JLabel eventNameLabel;
    private javax.swing.JLabel eventSelectLabel;
    private javax.swing.JComboBox<String> eventsBox;
    private javax.swing.JList<String> eventsListList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newEventLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel seatNoLanel;
    private javax.swing.JComboBox<String> seatNumberBox;
    // End of variables declaration//GEN-END:variables

    public String getEventName()
    {
        return this.eventNameField.getText();
    }
    
       public String getEventDate()
    {
        return this.dateField.getText();
    }
       public String getEventPrice()
    {
        return this.priceField.getText();
    }
          public String getCustomerName()
    {
        return this.customerNameField.getText();
    }
     public void addActionListener(ActionListener Listener) {
 //       this.deleteBookingButton.addActionListener(Listener);
        this.createEventButton.addActionListener(Listener);
 //       this.deleteEventButton.addActionListener(Listener);
        this.addBookingButton.addActionListener(Listener);
        
    }
    
    @Override
    public void update(Observable arg0, Object arg1) {
            addEventPanel.repaint();
    }
}