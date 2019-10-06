/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Fleet;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.FleetDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author DivyaThanigaiArasu
 */
public class SearchResultsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ArrayList<Fleet> result;
    private FleetDirectory fleetDirectory;

    /**
     * Creates new form SearchResultsJPanel
     */
    SearchResultsJPanel(JPanel userProcessContainer, ArrayList<Fleet> result, FleetDirectory fleetDirectory) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.result = result;
       this.fleetDirectory = fleetDirectory;
       populateSearchResults(result);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        btnSearchSerial = new javax.swing.JButton();
        btnSearchBrand = new javax.swing.JButton();
        btnSearchManYr = new javax.swing.JButton();
        txtSearchSerial = new javax.swing.JTextField();
        btnSearchCity = new javax.swing.JButton();
        btnSearchModel = new javax.swing.JButton();
        txtSearchModel = new javax.swing.JTextField();
        txtSearchBrand = new javax.swing.JTextField();
        txtSearchCity = new javax.swing.JTextField();
        txtSerachManYr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSeatMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSeatMin = new javax.swing.JTextField();
        btnSearchSeat = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Search Results");

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model no.", "Serial no.", "Manufactured Yr.", "Min. seats", "Max. seats", "City", "Availability", "Maintenance Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSearch);

        btnSearchSerial.setText("Serial number search");
        btnSearchSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSerialActionPerformed(evt);
            }
        });

        btnSearchBrand.setText("Brand Search");
        btnSearchBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBrandActionPerformed(evt);
            }
        });

        btnSearchManYr.setText("Manufacture Yr. search");
        btnSearchManYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchManYrActionPerformed(evt);
            }
        });

        btnSearchCity.setText("Find avail. cars in City");
        btnSearchCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCityActionPerformed(evt);
            }
        });

        btnSearchModel.setText("Model Search");
        btnSearchModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchModelActionPerformed(evt);
            }
        });

        txtSearchBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBrandActionPerformed(evt);
            }
        });

        jLabel2.setText("Car with seats (minimum)");

        jLabel3.setText("Car with seats (maximum)");

        btnSearchSeat.setText("Search ");
        btnSearchSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSeatActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnSearchManYr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearchSerial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSearchCity)
                                        .addComponent(txtSearchSerial)
                                        .addComponent(txtSerachManYr, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addGap(129, 129, 129)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnSearchBrand)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSearchBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnSearchModel)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSearchModel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSeatMin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSeatMax, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSearchSeat))
                                .addComponent(btnSearchCity))
                            .addGap(0, 180, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearchSerial)
                                .addComponent(txtSearchSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearchBrand)
                                .addComponent(txtSearchBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSearchManYr)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSearchModel)
                                    .addComponent(txtSearchModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(txtSerachManYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchCity)
                        .addComponent(txtSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSeatMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchSeat))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSeatMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(93, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSerialActionPerformed
        // TODO add your handling code here:
        try {
        ArrayList<Fleet> sResult = fleetDirectory.searchSnumber(Integer.parseInt(txtSearchSerial.getText()), result);
        if(sResult.size() ==0) {
           JOptionPane.showMessageDialog(null, "Please enter valid serial number");
           populateSearchResults(result);
        } else {
            populateSearchResults(sResult);
        }
            }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid serial number");
           populateSearchResults(result);
        }
    }//GEN-LAST:event_btnSearchSerialActionPerformed

    private void btnSearchBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBrandActionPerformed
        // TODO add your handling code here:
        try {
        ArrayList<Fleet> sResult = fleetDirectory.searchBrand(txtSearchBrand.getText(), result);
        if(sResult.size() ==0) {
           JOptionPane.showMessageDialog(null, "Please enter valid brand name");
           populateSearchResults(result);
        } else {
            populateSearchResults(sResult);
        }
            }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid brand name");
           populateSearchResults(result);
        }
    }//GEN-LAST:event_btnSearchBrandActionPerformed

    private void btnSearchManYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchManYrActionPerformed
        // TODO add your handling code here:
        try {
        ArrayList<Fleet> sResult = fleetDirectory.searchManYr(Integer.parseInt(txtSerachManYr.getText()),result);
        if(sResult.size() ==0) {
           JOptionPane.showMessageDialog(null, "Please enter valid manufacture year");
           populateSearchResults(result);
        } else {
            populateSearchResults(sResult);
        }
            }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid manufacture year");
           populateSearchResults(result);
        }
    }//GEN-LAST:event_btnSearchManYrActionPerformed

    private void btnSearchCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCityActionPerformed
        // TODO add your handling code here:
        try {
        ArrayList<Fleet> sResult = fleetDirectory.searchCity(true,txtSearchCity.getText(),this.result);
        if(sResult.size() ==0) {
           JOptionPane.showMessageDialog(null, "Please enter valid city name");
           populateSearchResults(this.result);
        } else {
            populateSearchResults(sResult);
        }
            }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid city name");
           populateSearchResults(this.result);
        }
    }//GEN-LAST:event_btnSearchCityActionPerformed

    private void btnSearchModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchModelActionPerformed
        // TODO add your handling code here:
        try {
        ArrayList<Fleet> sResult = fleetDirectory.searchModel(txtSearchModel.getText(), result);
        if(sResult.size() ==0) {
           JOptionPane.showMessageDialog(null, "Please enter valid model number");
           populateSearchResults(result);
        } else {
            populateSearchResults(sResult);
        }
            }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid model number");
           populateSearchResults(result);
        }
    }//GEN-LAST:event_btnSearchModelActionPerformed

    private void txtSearchBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBrandActionPerformed

    private void btnSearchSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSeatActionPerformed
        // TODO add your handling code here:
        try {
        ArrayList<Fleet> sResult = fleetDirectory.searchSeat(Integer.parseInt(txtSeatMin.getText()),Integer.parseInt(txtSeatMax.getText()), result);
        if(sResult.size() ==0) {
           JOptionPane.showMessageDialog(null, "Please enter valid city name");
           populateSearchResults(result);
        } else {
            populateSearchResults(sResult);
        }
            }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid city name");
           populateSearchResults(result);
        }
    }//GEN-LAST:event_btnSearchSeatActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public void populateSearchResults(ArrayList<Fleet> result){
        DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[dtm.getColumnCount()];
        
        for (Fleet f : result) {
             row[0] = f;
             row[1] = f.getModel_num();
             row[2] = f.getSerial_num();
             row[3] = f.getManufactured_year();
             row[4] = f.getMin_seats();
             row[5] = f.getMax_seats();
             row[6] = f.getAvailble_city();
             row[7] = f.isAvailable()? "Yes" : "No";
             row[8] = f.isMaintenance_certificate()? "Not Expired" : "Expired";
             dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchBrand;
    private javax.swing.JButton btnSearchCity;
    private javax.swing.JButton btnSearchManYr;
    private javax.swing.JButton btnSearchModel;
    private javax.swing.JButton btnSearchSeat;
    private javax.swing.JButton btnSearchSerial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearchBrand;
    private javax.swing.JTextField txtSearchCity;
    private javax.swing.JTextField txtSearchModel;
    private javax.swing.JTextField txtSearchSerial;
    private javax.swing.JTextField txtSeatMax;
    private javax.swing.JTextField txtSeatMin;
    private javax.swing.JTextField txtSerachManYr;
    // End of variables declaration//GEN-END:variables
}
