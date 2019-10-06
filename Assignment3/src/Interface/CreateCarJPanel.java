/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Fleet;
import Business.FleetDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DivyaThanigaiArasu
 */
public class CreateCarJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private FleetDirectory fleetDirectory;

    /**
     * Creates new form CreateCarJPanel
     */
    CreateCarJPanel(JPanel userProcessContainer, FleetDirectory fleetDirectory) {
     initComponents();
     this.userProcessContainer = userProcessContainer;
     this.fleetDirectory = fleetDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtManufacturedYr = new javax.swing.JTextField();
        txtSerialNum = new javax.swing.JTextField();
        txtModelNum = new javax.swing.JTextField();
        txtMinSeats = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        checkMC = new javax.swing.JCheckBox();
        checkAvail = new javax.swing.JCheckBox();
        btnAddCar = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Add Car Details");

        jLabel2.setText("Minimun seats");

        jLabel3.setText("Maximum seats");

        jLabel4.setText("Manufactured Year");

        jLabel5.setText("Brand");

        jLabel6.setText("Model number");

        jLabel7.setText("Serial number");

        jLabel8.setText("City");

        jLabel9.setText("Maintenance Certificate");

        jLabel10.setText("Availability");

        txtMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxSeatsActionPerformed(evt);
            }
        });

        btnAddCar.setText("Add Car");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBrand)
                                    .addComponent(txtManufacturedYr)
                                    .addComponent(txtSerialNum)
                                    .addComponent(txtModelNum)
                                    .addComponent(txtMinSeats)
                                    .addComponent(txtMaxSeats)
                                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkMC)
                                    .addComponent(checkAvail))
                                .addGap(114, 114, 114)))))
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManufacturedYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkMC)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAvail)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxSeatsActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
                                       
        String brand = txtBrand.getText();
        if (brand == null || brand.equals("")) {
            JOptionPane.showMessageDialog(null, "Brand can't be empty");
            return;
        } else if (!brand.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(null, "Brand should contain alphabets only");
            return;
        }
        String manYr = txtManufacturedYr.getText();
        try {
            Integer.parseInt(manYr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter number for manufactured year");
            return;
        }
        String serial = txtSerialNum.getText();
        try {
            Integer.parseInt(serial);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter number for serial number");
            return;
        }
        String minSeats = txtMinSeats.getText();
        try {
            Integer.parseInt(minSeats);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter number for minimum seats");
            return;
        }
        String maxSeats = txtMaxSeats.getText();
        try {
            Integer.parseInt(maxSeats);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter number for maximum seats");
            return;
        }
        String model = txtModelNum.getText();
        if (model == null || model.equals("")) {
            JOptionPane.showMessageDialog(null, "Model number cannot be empty");
            return;
        }
        String city = txtCity.getText();
        if (city == null || city.equals("")) {
            JOptionPane.showMessageDialog(null, "City cannot be empty");
            return;
        } else if (!brand.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(null, "City should contain alphabets only");
            return;
        }
        Boolean available = checkAvail.isSelected();
        Boolean mc = checkMC.isSelected();
        
        Fleet car = fleetDirectory.addCar();
        car.setBrand(brand);
        car.setManufactured_year(Integer.parseInt(manYr));
        car.setMin_seats(Integer.parseInt(minSeats));
        car.setMax_seats(Integer.parseInt(maxSeats));
        car.setSerial_num(Integer.parseInt(serial));
        car.setModel_num(model);
        car.setAvailable(available);
        car.setAvailble_city(city);
        car.setMaintenance_certificate(mc);
        JOptionPane.showMessageDialog(null, "Car Added Successfully");

        txtBrand.setText("");
        txtSerialNum.setText("");
        txtMinSeats.setText("");
        txtMaxSeats.setText("");
        txtModelNum.setText("");
        txtCity.setText("");
        txtManufacturedYr.setText("");
        checkMC.setSelected(false);
        checkAvail.setSelected(false);
    }//GEN-LAST:event_btnAddCarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox checkAvail;
    private javax.swing.JCheckBox checkMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturedYr;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtSerialNum;
    // End of variables declaration//GEN-END:variables
}
