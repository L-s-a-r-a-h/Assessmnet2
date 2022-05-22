/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sarah
 */
public class BookingView extends javax.swing.JFrame {
private boolean open ;
    /**
     * Creates new form BookingView
     */
    public BookingView() {
        initComponents();
        this.setVisible(true);
        open = true;
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookingPanel = new javax.swing.JPanel();
        customerNameLabel = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        eventSelectLabel = new javax.swing.JLabel();
        customerTypeBox = new javax.swing.JComboBox<>();
        customerTypeLabel = new javax.swing.JLabel();
        seatNoLanel = new javax.swing.JLabel();
        seatNumberBox = new javax.swing.JComboBox<>();
        addBookingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AvailableSeats = new javax.swing.JLabel();
        eventNameLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        customerNameLabel.setText("Customer Name: ");

        customerNameField.setText("Enter name");

        eventSelectLabel.setText("Add booking for: ");

        customerTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adult", "Student", "Child", "Senior" }));

        customerTypeLabel.setText("Type: ");

        seatNoLanel.setText("Seat number: ");

        seatNumberBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        seatNumberBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatNumberBoxActionPerformed(evt);
            }
        });

        addBookingButton.setText("Add");

        jLabel1.setText("Available Seats: ");

        AvailableSeats.setText("None");

        eventNameLabel.setText("jLabel2");

        cancelButton.setText("Cancel");

        javax.swing.GroupLayout addBookingPanelLayout = new javax.swing.GroupLayout(addBookingPanel);
        addBookingPanel.setLayout(addBookingPanelLayout);
        addBookingPanelLayout.setHorizontalGroup(
            addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookingPanelLayout.createSequentialGroup()
                        .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerNameLabel)
                            .addComponent(eventSelectLabel)
                            .addComponent(customerTypeLabel)
                            .addComponent(seatNoLanel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventNameLabel)))
                    .addGroup(addBookingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvailableSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookingPanelLayout.createSequentialGroup()
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        addBookingPanelLayout.setVerticalGroup(
            addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookingPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventSelectLabel)
                    .addComponent(eventNameLabel))
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
                .addGap(18, 18, 18)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AvailableSeats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(addBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookingButton)
                    .addComponent(cancelButton))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addBookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seatNumberBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatNumberBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatNumberBoxActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.open =false;
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableSeats;
    private javax.swing.JButton addBookingButton;
    private javax.swing.JPanel addBookingPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JComboBox<String> customerTypeBox;
    private javax.swing.JLabel customerTypeLabel;
    private javax.swing.JLabel eventNameLabel;
    private javax.swing.JLabel eventSelectLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel seatNoLanel;
    private javax.swing.JComboBox<String> seatNumberBox;
    // End of variables declaration//GEN-END:variables

    public String getCustomerName() {
        return this.customerNameField.getText();
    }

    public String getCustomerType(){
        return this.customerTypeBox.getSelectedItem().toString();
    }

        public int getSeatNo(){
        int seatNo = Integer.parseInt(this.seatNumberBox.getSelectedItem().toString());
        return seatNo;
    }
        
            public void addActionListener(ActionListener Listener) {

        this.cancelButton.addActionListener(Listener);
        this.addBookingButton.addActionListener(Listener);
  

    }
       public boolean isOpen(){
           return this.open;
       }


   public void close() {
WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
   }
}
