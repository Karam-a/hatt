/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;


import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author axelbrave
 */
public class VisaKundsBeställningsHistorik extends javax.swing.JFrame {

      private InfDB idb;

    public VisaKundsBeställningsHistorik(InfDB idb) {
        this.idb=idb;
        initComponents();
        hamtaKund ();
    }

   
    
    
    
    
    
    
     private void hamtaKund () 
   {
      String hamtakund = "Select kundNamn from Kund"; 
      
                  ArrayList<String> Kunder;

       try {
             
            Kunder = idb.fetchColumn(hamtakund);
                
                for (String enKund : Kunder){
                                 
                     kundBox.addItem(enKund);
                }
                
                
            }
        
        
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
        }
       
   } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ordrarTXT = new javax.swing.JTextArea();
        beställningBtn = new javax.swing.JButton();
        kundBox = new javax.swing.JComboBox<>();
        tillbakaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beställningshistorik");

        ordrarTXT.setColumns(20);
        ordrarTXT.setRows(5);
        jScrollPane1.setViewportView(ordrarTXT);

        beställningBtn.setText("Visa beställningshistorik");
        beställningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beställningBtnActionPerformed(evt);
            }
        });

        kundBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kundBoxActionPerformed(evt);
            }
        });

        tillbakaButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tillbakaButton.setText("Tillbaka");
        tillbakaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Beställningshistorik");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kund:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kundBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(beställningBtn)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tillbakaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kundBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beställningBtn)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tillbakaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kundBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundBoxActionPerformed
    }//GEN-LAST:event_kundBoxActionPerformed

    private void beställningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beställningBtnActionPerformed
 ordrarTXT.setText(null);
    ArrayList<HashMap<String, String>> kundsHattar;
  
    try{
     
     String kundNamn  = kundBox.getSelectedItem().toString();
     String hamtaKundId = "Select kundiD from Kund where kundNamn = '" +kundNamn+"' ; " ;
     String kundID = idb.fetchSingle(hamtaKundId);
     String hamtaHattar = "Select * from specialHattar where OrderiD in (Select orderID from ordrar where kundID = "+kundID+");" ;
    
     kundsHattar = idb.fetchRows(hamtaHattar); 

        for (HashMap<String, String> hatt : kundsHattar){
                
                ordrarTXT.append(hatt.get("Namn") + "\n");
   
        }
    }
    
    catch (InfException ettUndantag){
    JOptionPane.showMessageDialog(null, "Något gick snett.");
    }

    }//GEN-LAST:event_beställningBtnActionPerformed

    private void tillbakaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaButtonActionPerformed
 
       this.dispose();
        
    }//GEN-LAST:event_tillbakaButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beställningBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> kundBox;
    private javax.swing.JTextArea ordrarTXT;
    private javax.swing.JButton tillbakaButton;
    // End of variables declaration//GEN-END:variables
}
