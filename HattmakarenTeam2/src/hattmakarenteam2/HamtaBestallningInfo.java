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
public class HamtaBestallningInfo extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form HamtaBestallningInfo
     */
    public HamtaBestallningInfo(InfDB idb) {
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
        jTextOrderID = new javax.swing.JTextField();
        okKnappOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrder = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Order ID:");

        okKnappOrder.setText("OK");
        okKnappOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okKnappOrderActionPerformed(evt);
            }
        });

        jTableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Kund ID", "Specialhatt ID", "Order datum", "Orderstatus"
            }
        ));
        jScrollPane1.setViewportView(jTableOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(okKnappOrder)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okKnappOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okKnappOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnappOrderActionPerformed
        // TODO add your handling code here:
        //valideringen:
        
        if(ValideringKlass.finnsVarde(jTextOrderID)){
            
            try {
        
        //Inmatning av kund id som man vill ha data fr�n     
        String kundID = jTextOrderID.getText();
        //Omvandla inmatning som str�ng till en int f�r att h�mta ut ID:et fr�n databasen.
        int intID = Integer.parseInt(kundID);
        
        String sqlFraga = "Select kundID, kundNamn, adress, telefonNummer, hedersKund, epost from Kund where kundID = " +  intID + "";
        
        DefaultTableModel dTM = (DefaultTableModel) jTableKundData.getModel();
        dTM.setRowCount(0);
        
         //Skapande av  hashmap f�r att lista kundID:en och respektive namn.
        ArrayList<HashMap<String, String>> allInfoLista; 
        allInfoLista = idb.fetchRows(sqlFraga);
        
 
            //
            //Loopa igenom allInfoLista f�r att sedan adda dessa rader som visas i J-framen. 
            for(HashMap enKund : allInfoLista){
                Vector nyLista = new Vector(); //Vector rekommenderades ist�llet f�r arraylist d�rav valet.
                nyLista.add(enKund.get("kundID"));
                nyLista.add(enKund.get("kundNamn"));
                nyLista.add(enKund.get("adress"));
                nyLista.add(enKund.get("telefonNummer"));
                nyLista.add(enKund.get("hedersKund"));
                nyLista.add(enKund.get("epost"));
                dTM.addRow(nyLista);
                      
            }
        
      
        } catch (InfException ex){
            JOptionPane.showMessageDialog(null, "N�got gick fel");
            System.out.println("Error: " + ex);
        }
            
            
            
            
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "KundID m�ste fyllas i");
        }
    }  
    }//GEN-LAST:event_okKnappOrderActionPerformed

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
            java.util.logging.Logger.getLogger(HamtaBestallningInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HamtaBestallningInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HamtaBestallningInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HamtaBestallningInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /**new HamtaBestallningInfo().setVisible(true);**/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrder;
    private javax.swing.JTextField jTextOrderID;
    private javax.swing.JButton okKnappOrder;
    // End of variables declaration//GEN-END:variables
}
