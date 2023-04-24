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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kundBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(beställningBtn)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kundBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beställningBtn))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kundBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundBoxActionPerformed
    }//GEN-LAST:event_kundBoxActionPerformed

    private void beställningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beställningBtnActionPerformed
 ordrarTXT.setText(null);
    ArrayList<HashMap<String, String>> kundsHattar;
  
    try
 {
     
 
     String kundNamn  = kundBox.getSelectedItem().toString();
     String hamtaKundId = "Select kundiD from Kund where kundNamn = '" +kundNamn+"' ; " ;
     String kundID = idb.fetchSingle(hamtaKundId);
     String hamtaHattar = "Select * from specialHattar where OrderiD in (Select orderID from ordrar where kundID = "+kundID+");" ;
    
     kundsHattar = idb.fetchRows(hamtaHattar); 

for (HashMap<String, String> hatt : kundsHattar){
                
                ordrarTXT.append(hatt.get("Namn") + "\n");
            }
     
     
     
     
     
}
 
 catch (InfException ettUndantag)
 
 {
    JOptionPane.showMessageDialog(null, "Något gick snett.");
 }


    }//GEN-LAST:event_beställningBtnActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beställningBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kundBox;
    private javax.swing.JTextArea ordrarTXT;
    // End of variables declaration//GEN-END:variables
}
