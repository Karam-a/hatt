/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException; 
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class HamtaBestallningsInfo extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form HamtaBestallningsInfo
     */
    public HamtaBestallningsInfo(InfDB idb) {
        this.idb = idb;
        initComponents();
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
        jTextFieldOrderID = new javax.swing.JTextField();
        jButtonOkBestallning = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBestallning = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Best�llningsinfo");

        jLabel1.setText("Order ID:");

        jLabel2.setText("H�mta best�llningsinformation");

        jTextFieldOrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOrderIDActionPerformed(evt);
            }
        });

        jButtonOkBestallning.setText("OK");
        jButtonOkBestallning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkBestallningActionPerformed(evt);
            }
        });

        jTableBestallning.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "KundID", "SpecialhattID", "Orderdatum", "OrderStatus"
            }
        ));
        jScrollPane1.setViewportView(jTableBestallning);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonOkBestallning)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonOkBestallning)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkBestallningActionPerformed
        // skriv koden h�r:
        
        
        if(ValideringKlass.finnsVarde(jTextFieldOrderID)){
            
            try {
                
                //Inmatning av order id som man vil ha data fr�n
                String orderID = jTextFieldOrderID.getText();
                
                //Omvandla inmatningen som str�ng till en int f�r att h�mta ut Orderid:et fr�n databasen (som �r en int). 
                int intID = Integer.parseInt(orderID);
                //H�mta sqlfr�ga 
                String sqlFraga = "Select orderID, kundID, SpecialhattID, orderDatum, orderStatus from Ordrar where orderID = " + intID + "";
                
                DefaultTableModel dTM = (DefaultTableModel) jTableBestallning.getModel();
                dTM.setRowCount(0);
                
                
                //Skapandet av hashmap
                ArrayList<HashMap<String, String>> allInfoLista;
                allInfoLista = idb.fetchRows(sqlFraga);
                
                //Loopa igenom allInfoLista f�r att sedan adda dessa rader som visas i J-framen 
                for(HashMap enOrder : allInfoLista){
                    Vector nyLista = new Vector();
                nyLista.add(enOrder.get("orderID"));
                nyLista.add(enOrder.get("kundID"));
                nyLista.add(enOrder.get("SpecialhattID"));
                nyLista.add(enOrder.get("orderDatum"));
                nyLista.add(enOrder.get("orderStatus"));
                dTM.addRow(nyLista);
                }
               
            } catch (InfException ex){
                JOptionPane.showMessageDialog(null, "N�got gick fel");
            System.out.println("Error: " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "KundID m�ste fyllas i");
        }
    }//GEN-LAST:event_jButtonOkBestallningActionPerformed

    private void jTextFieldOrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOrderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOrderIDActionPerformed

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
            java.util.logging.Logger.getLogger(HamtaBestallningsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HamtaBestallningsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HamtaBestallningsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HamtaBestallningsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOkBestallning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBestallning;
    private javax.swing.JTextField jTextFieldOrderID;
    // End of variables declaration//GEN-END:variables
}
