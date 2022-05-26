/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sarah
 */
public class EventView extends javax.swing.JFrame  {

    /**
     * Creates new form View2
     */
    public EventView() {
        initComponents();
                model= (DefaultTableModel) this.eventListTable.getModel();


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
        addEventPanel = new javax.swing.JPanel();
        eventNameLabel = new javax.swing.JLabel();
        eventNameField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        createEventButton = new javax.swing.JButton();
        newEventLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventListTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        eventSelectLabel = new javax.swing.JLabel();
        eventsBox = new javax.swing.JComboBox<>();
        addBookingButton = new javax.swing.JButton();
        outMessage = new javax.swing.JLabel();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BSLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BSLabel.setText("BOOKING SYSTEM");

        eventNameLabel.setText("Event name:");

        eventNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameFieldActionPerformed(evt);
            }
        });

        dateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateFieldMouseExited(evt);
            }
        });

        dateLabel.setText("Event date:");

        createEventButton.setText("Add Event");

        newEventLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newEventLabel.setText("Add a new event:");

        priceLabel.setText("Seat price:");

        model= (DefaultTableModel) this.eventListTable.getModel();
        eventListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Date", "Price ($)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(eventListTable);
        if (eventListTable.getColumnModel().getColumnCount() > 0) {
            eventListTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("date format: yyyy/mm/dd");

        eventSelectLabel.setText("Select Event:");

        eventsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsBoxActionPerformed(evt);
            }
        });

        addBookingButton.setText("Add Booking");

        outMessage.setText("message");

        javax.swing.GroupLayout addEventPanelLayout = new javax.swing.GroupLayout(addEventPanel);
        addEventPanel.setLayout(addEventPanelLayout);
        addEventPanelLayout.setHorizontalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(eventSelectLabel)
                .addGap(18, 18, 18)
                .addComponent(eventsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBookingButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventPanelLayout.createSequentialGroup()
                        .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventNameLabel)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createEventButton)
                            .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(addEventPanelLayout.createSequentialGroup()
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addEventPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))))
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addEventPanelLayout.setVerticalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventSelectLabel)
                    .addComponent(addBookingButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outMessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventNameLabel)
                    .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEventButton)
                .addGap(15, 15, 15))
        );

        message.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(BSLabel)
                        .addGap(119, 119, 119)
                        .addComponent(message))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addEventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSLabel)
                    .addComponent(message))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addEventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventNameFieldActionPerformed

    private void dateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFieldMouseExited
    }//GEN-LAST:event_dateFieldMouseExited

    private void eventsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventsBoxActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BSLabel;
    private javax.swing.JButton addBookingButton;
    private javax.swing.JPanel addEventPanel;
    private javax.swing.JButton createEventButton;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTable eventListTable;
    private javax.swing.JTextField eventNameField;
    private javax.swing.JLabel eventNameLabel;
    private javax.swing.JLabel eventSelectLabel;
    private javax.swing.JComboBox<String> eventsBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel message;
    private javax.swing.JLabel newEventLabel;
    private javax.swing.JLabel outMessage;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
       private  DefaultTableModel model;

    public void addevent(EventData data)
    {   
                this.model.addRow(new Object[]{data.getName(),data.getDate(),data.getPrice()});
    }
    
 
    public void setEventBox(String eventName){
    this.eventsBox.addItem(eventName);
    }
    
    public String getSelectedEvent(){
        return this.eventsBox.getSelectedItem().toString();
    }
    

    public String getEventName() {
        return this.eventNameField.getText().trim();
    }

    public String getEventDate() {
        return this.dateField.getText().trim();
    }

    public String getEventPrice() {
        return this.priceField.getText().trim();
    }


 
    public void setMessage(String message)
    {
        this.outMessage.setText(message);
    }

    public void addActionListener(ActionListener Listener) {
        //       this.deleteBookingButton.addActionListener(Listener);
        this.createEventButton.addActionListener(Listener);
        this.eventsBox.addActionListener(Listener);
        //       this.deleteEventButton.addActionListener(Listener);
        this.addBookingButton.addActionListener(Listener);

    }

    
}
