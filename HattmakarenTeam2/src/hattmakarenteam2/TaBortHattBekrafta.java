/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author andre
 */
public class TaBortHattBekrafta extends javax.swing.JFrame {

    private InfDB idb;
    private String hatt;
    private int orderID;

    /**
     * Creates new form TaBortHattBekrafta
     */
    public TaBortHattBekrafta(InfDB idb, String hatt, int orderID) {
        this.idb=idb;
        this.hatt=hatt;
        this.orderID = orderID;
        initComponents();
        setHattID();
    }
    
    private void taBortHatt(){
        int hattIDint = Integer.parseInt(hatt);
        String fraga = "DELETE FROM specialhattar WHERE SpecialhattID = " + hattIDint + ";";
        
        try {
            idb.delete(fraga);
            
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }
    }
    
    private void setHattID(){
        hattIDlbl.setText(hatt);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fragalbl = new javax.swing.JLabel();
        hattIDlbl = new javax.swing.JLabel();
        frageteckenlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        avbrytbtn = new javax.swing.JButton();
        bekraftabtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bekr�fta borttagning av hatt");

        fragalbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fragalbl.setText("�r du s�ker p� att du vill ta bort hatt med ID");

        hattIDlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hattIDlbl.setText("1234");

        frageteckenlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        frageteckenlbl.setText("?");

        avbrytbtn.setText("Avbryt");
        avbrytbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytbtnActionPerformed(evt);
            }
        });

        bekraftabtn.setText("Bekr�fta");
        bekraftabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekraftabtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fragalbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hattIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frageteckenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(avbrytbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bekraftabtn)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(fragalbl)
                    .addComponent(hattIDlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frageteckenlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avbrytbtn)
                    .addComponent(bekraftabtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avbrytbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytbtnActionPerformed
        RedigeraOrder nyRedOrder = new RedigeraOrder(idb, orderID);
        nyRedOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avbrytbtnActionPerformed

    private void bekraftabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bekraftabtnActionPerformed
        taBortHatt();
        RedigeraOrder nyRedOrder = new RedigeraOrder(idb, orderID);
        nyRedOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bekraftabtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbrytbtn;
    private javax.swing.JButton bekraftabtn;
    private javax.swing.JLabel fragalbl;
    private javax.swing.JLabel frageteckenlbl;
    private javax.swing.JLabel hattIDlbl;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
