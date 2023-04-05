/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;

//import javax.swing.JOptionPane;
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
        IDHatt1Label = new javax.swing.JLabel();
        IDHatt2Label = new javax.swing.JLabel();
        IDHatt3Label = new javax.swing.JLabel();
        KIDTxt = new javax.swing.JTextField();
        IDHatt1Txt = new javax.swing.JTextField();
        IDHatt3Txt = new javax.swing.JTextField();
        IDHatt2Txt = new javax.swing.JTextField();
        OStatusLabel = new javax.swing.JLabel();
        OStatusComboBox = new javax.swing.JComboBox<>();
        ODatumLabel = new javax.swing.JLabel();
        SkapaOrderBtn = new javax.swing.JButton();
        OrderDatumTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NyOrderLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 24)); // NOI18N
        NyOrderLabel.setText("Ny Order");

        KIDLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        KIDLabel.setText("Kund ID:");

        IDHatt1Label.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        IDHatt1Label.setText("ID hatt 1: ");

        IDHatt2Label.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        IDHatt2Label.setText("ID hatt 2:");

        IDHatt3Label.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        IDHatt3Label.setText("ID hatt 3: ");

        KIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KIDTxtActionPerformed(evt);
            }
        });

        OStatusLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        OStatusLabel.setText("Order Status:");

        OStatusComboBox.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        OStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ODatumLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        ODatumLabel.setText("Order Datum: ");

        SkapaOrderBtn.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 18)); // NOI18N
        SkapaOrderBtn.setText("Skapa Order");
        SkapaOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkapaOrderBtnActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDHatt1Label)
                                .addGap(18, 18, 18)
                                .addComponent(IDHatt1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDHatt2Label)
                                    .addComponent(IDHatt3Label))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDHatt3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDHatt2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ODatumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrderDatumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OStatusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(NyOrderLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(SkapaOrderBtn)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NyOrderLabel)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KIDLabel)
                    .addComponent(KIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDHatt1Label)
                    .addComponent(IDHatt1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDHatt2Label)
                    .addComponent(IDHatt2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDHatt3Label)
                    .addComponent(IDHatt3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OStatusLabel)
                    .addComponent(OStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
            String idHatt1 = IDHatt1Txt.getText();
            String idHatt2 = IDHatt2Txt.getText();
            String idHatt3 = IDHatt3Txt.getText();
            String orderDatum = OrderDatumTxt.getText();
            String orderStatus = OStatusComboBox.getText();
            String fraga = "insert into ordrar values('"+kundID+"', '"+idHatt1+"', '"+idHatt2+"', '"+idHatt3+"', '"+orderDatum+"', '"+orderStatus+"')";
                
            //Hur blir det vid flera hatt ID p� ett OrderID i databas? 
            // g�r det att h�mta ut text fr�n combobox med getText()? parse? []? fetch i array
            
            if (ValideringsKlass.v�rdeExisterar(KIDTxt) || ValideringsKlass.v�rdeExisterar(IDHatt1Txt) || ValideringsKlass.v�rdeExisterar(IDHatt2Txt) || ValideringsKlass.v�rdeExisterar(IDHatt3Txt) || ValideringsKlass.v�rdeExisterar(OrderDatumTxt) || ValideringsKlass.v�rdeExisterar(OStatusComboBox))
        {}
            
        idb.insert(fraga);
                
        JOptionPane.showMessageDialog(null, "Ny specialhatt har registrerats!");
         
        }
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "N�got gick fel!");
        }
   
    }//GEN-LAST:event_SkapaOrderBtnActionPerformed
/**
    private void KIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KIDTxtActionPerformed
        // TODO add your handling code here:L��gg till datum 
        
        //String orderDatum = OrderDatumTxt.setDate();
        
    }//GEN-LAST:event_KIDTxtActionPerformed
**/
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDHatt1Label;
    private javax.swing.JTextField IDHatt1Txt;
    private javax.swing.JLabel IDHatt2Label;
    private javax.swing.JTextField IDHatt2Txt;
    private javax.swing.JLabel IDHatt3Label;
    private javax.swing.JTextField IDHatt3Txt;
    private javax.swing.JLabel KIDLabel;
    private javax.swing.JTextField KIDTxt;
    private javax.swing.JLabel NyOrderLabel;
    private javax.swing.JLabel ODatumLabel;
    private javax.swing.JComboBox<String> OStatusComboBox;
    private javax.swing.JLabel OStatusLabel;
    private javax.swing.JTextField OrderDatumTxt;
    private javax.swing.JButton SkapaOrderBtn;
    // End of variables declaration//GEN-END:variables
}

