/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.FleetDirectory;
import java.awt.CardLayout;
/**
 *
 * @author DivyaThanigaiArasu
 */
public class MainJFrame extends javax.swing.JFrame {
private FleetDirectory fleetDirectory;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.fleetDirectory = new FleetDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        btnFleetMng = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topJPanel.setBackground(new java.awt.Color(0, 102, 102));

        btnFleetMng.setBackground(new java.awt.Color(153, 153, 153));
        btnFleetMng.setText("Uber Fleet Manager");
        btnFleetMng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleetMngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topJPanelLayout.createSequentialGroup()
                .addContainerGap(629, Short.MAX_VALUE)
                .addComponent(btnFleetMng, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFleetMng, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topJPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFleetMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleetMngActionPerformed
        // TODO add your handling code here:
        FleetMngWorkAreaJPanel panel = new FleetMngWorkAreaJPanel(userProcessContainer, fleetDirectory);
        userProcessContainer.add("FleetMngWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFleetMngActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFleetMng;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
