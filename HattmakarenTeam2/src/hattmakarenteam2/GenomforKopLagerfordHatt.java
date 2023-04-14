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
public class GenomforKopLagerfordHatt extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form GenomforKopLagerfordHatt
     */
    public GenomforKopLagerfordHatt(InfDB idb) {
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
        jComboBoxHattar = new javax.swing.JComboBox<>();
        jButtonGenomfor = new javax.swing.JButton();
        jButtonLagerHattar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLagerHattar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Hatt:");

        jComboBoxHattar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filthatt", "Panamahatt", "Str�hatt", "Tyghatt", "L�derhatt" }));

        jButtonGenomfor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGenomfor.setText("Genomf�r k�p");
        jButtonGenomfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenomforActionPerformed(evt);
            }
        });

        jButtonLagerHattar.setText("Visa info");
        jButtonLagerHattar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLagerHattarActionPerformed(evt);
            }
        });

        jTableLagerHattar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lagerhatt ID", "Tyg", "Beskrivning", "Pris"
            }
        ));
        jScrollPane1.setViewportView(jTableLagerHattar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLagerHattar)
                    .addComponent(jComboBoxHattar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenomfor))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxHattar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLagerHattar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButtonGenomfor)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenomforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenomforActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenomforActionPerformed

    private void jButtonLagerHattarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLagerHattarActionPerformed
        // Koda h�r: 
        try {
            //H�mta info vald hatt
            String hattTypen = jComboBoxHattar.getSelectedItem().toString();
            
            DefaultTableModel dTM = (DefaultTableModel) jTableLagerHattar.getModel();
        dTM.setRowCount(0);
        
         String sqlFraga = "Select lagerHattID, tyg, ovrigBeskrivning, Pris from lagerfordahattar where typ = '" + hattTypen + "'";
        
        
        ArrayList<HashMap<String, String>> hattLista;
        hattLista = idb.fetchRows(sqlFraga);
        
        for(HashMap enHatt : hattLista){
                Vector nyLista = new Vector(); 
                nyLista.add(enHatt.get("lagerHattID"));
                nyLista.add(enHatt.get("tyg"));
                nyLista.add(enHatt.get("ovrigBeskrivning"));
                nyLista.add(enHatt.get("Pris"));
                dTM.addRow(nyLista);
                    
        } 
        } catch(InfException ex){
            JOptionPane.showMessageDialog(null, "N�got gick fel");
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jButtonLagerHattarActionPerformed

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
            java.util.logging.Logger.getLogger(GenomforKopLagerfordHatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenomforKopLagerfordHatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenomforKopLagerfordHatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenomforKopLagerfordHatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenomfor;
    private javax.swing.JButton jButtonLagerHattar;
    private javax.swing.JComboBox<String> jComboBoxHattar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLagerHattar;
    // End of variables declaration//GEN-END:variables
}
