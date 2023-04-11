/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;

//import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
//import java.util.Date;

/**
 *
 * @author ellenportugues
 */
public class RegistreraOrder extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form RegistreraOrder
     */
    
    
    public RegistreraOrder() {
        initComponents();
   hamtaHatt() ;
   hamtaKund ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NyOrderLabel = new javax.swing.JLabel();
        KIDLabel = new javax.swing.JLabel();
        OStatusLabel = new javax.swing.JLabel();
        OStatusComboBox = new javax.swing.JComboBox<>();
        ODatumLabel = new javax.swing.JLabel();
        SkapaOrderBtn = new javax.swing.JButton();
        OrderDatumTxt = new javax.swing.JTextField();
        comboHatt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        boxKund = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NyOrderLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 24)); // NOI18N
        NyOrderLabel.setText("Ny Order");

        KIDLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        KIDLabel.setText("Kund:");

        OStatusLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        OStatusLabel.setText("Order Status:");

        OStatusComboBox.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        OStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej p�b�rjad" }));
        OStatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OStatusComboBoxActionPerformed(evt);
            }
        });

        ODatumLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        ODatumLabel.setText("Order Datum: ");

        SkapaOrderBtn.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 18)); // NOI18N
        SkapaOrderBtn.setText("Skapa Order");
        SkapaOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkapaOrderBtnActionPerformed(evt);
            }
        });

        comboHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHattActionPerformed(evt);
            }
        });

        jLabel1.setText("Hatt:");

        boxKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ODatumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrderDatumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(NyOrderLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KIDLabel)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboHatt, 0, 168, Short.MAX_VALUE)
                            .addComponent(boxKund, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(SkapaOrderBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OStatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NyOrderLabel)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KIDLabel)
                    .addComponent(boxKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboHatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OStatusLabel)
                    .addComponent(OStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ODatumLabel)
                    .addComponent(OrderDatumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(SkapaOrderBtn)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkapaOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkapaOrderBtnActionPerformed
        // TODO add your handling code here:
        try{
            idb = new InfDB("hattProjektet", "3306","hattProjektet","hattkey");
            
            String kundID = KIDTxt.getText();
          
            String orderDatum = OrderDatumTxt.getText();
            String orderStatus = OStatusComboBox.getSelectedItem().toString();
          //  String fraga = "insert into ordrar values('"+kundID+"', '"+idHatt1+"', '"+idHatt2+"', '"+idHatt3+"', '"+orderDatum+"', '"+orderStatus+"')";
                
            //Hur blir det vid flera hatt ID p� ett OrderID i databas? 
            // g�r det att h�mta ut text fr�n combobox med getText()? parse? []? fetch i array
            
            if (ValideringKlass.finnsVarde(KIDTxt)  ||  ValideringKlass.finnsVarde(OrderDatumTxt) || ValideringKlass.finnsVarde(OStatusComboBox))
        {}
            
      //  idb.insert(fraga);
                
        JOptionPane.showMessageDialog(null, "Ny specialhatt har registrerats!");
         
        }
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "N�got gick fel!");
        }
        
        

        
    
    
    }//GEN-LAST:event_SkapaOrderBtnActionPerformed

  private void hamtaHatt () {
    ArrayList<String> hattar ;
     
    String fraga = "Select Namn from specialHattar" ;
      
      try {
        hattar = idb.fetchColumn(fraga);
        
         for(String hatt : hattar){
       comboHatt.addItem(hatt);

         
         }
          
      }
   
      
      catch (InfException exception){
         JOptionPane.showMessageDialog(null, "N�got gick fel");

      }
      
  }  
    
  private void hamtaKund ()  {
  
      ArrayList<String> kunder; 
     String fraga = "Select namn from Kund" ; 
     
     
       try {
        kunder = idb.fetchColumn(fraga);
        
         for(String Kund : kunder){
       boxKund.addItem (Kund);

         
         }
          
      }
   
      
      catch (InfException exception){
         JOptionPane.showMessageDialog(null, "N�got gick fel");

      }
     
     
     
     
     
     
     
  }
    
    
    
    
    /**
    private void comboHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHattActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHattActionPerformed

    private void boxKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxKundActionPerformed

    private void OStatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OStatusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OStatusComboBoxActionPerformed
**/
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KIDLabel;
    private javax.swing.JLabel NyOrderLabel;
    private javax.swing.JLabel ODatumLabel;
    private javax.swing.JComboBox<String> OStatusComboBox;
    private javax.swing.JLabel OStatusLabel;
    private javax.swing.JTextField OrderDatumTxt;
    private javax.swing.JButton SkapaOrderBtn;
    private javax.swing.JComboBox<String> boxKund;
    private javax.swing.JComboBox<String> comboHatt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

