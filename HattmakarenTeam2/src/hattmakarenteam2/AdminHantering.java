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
 * @author axelbrave
 */
public class AdminHantering extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form AdminHantering
     */
    public AdminHantering(InfDB idb) {
        initComponents();
        this.idb= idb;

    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laggTillAdminLabel = new javax.swing.JLabel();
        anvNamnLabel = new javax.swing.JLabel();
        losenLabel = new javax.swing.JLabel();
        repLosenLabel = new javax.swing.JLabel();
        anvNamnTxt = new javax.swing.JTextField();
        losenTxt = new javax.swing.JTextField();
        repLosenTxt = new javax.swing.JTextField();
        skapaAdminBtn = new javax.swing.JButton();
        txtNamn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefonnummer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrera Admin");

        laggTillAdminLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        laggTillAdminLabel.setText("L�gg till Admin");

        anvNamnLabel.setText("Anv�ndarnamn:");

        losenLabel.setText("L�senord:");

        repLosenLabel.setText("Repetera l�senord: ");

        skapaAdminBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        skapaAdminBtn.setText("Skapa admin");
        skapaAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skapaAdminBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn:");

        jLabel2.setText("Adress:");

        jLabel3.setText("Epost:");

        jLabel6.setText("Telefonnummer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(losenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAdress, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(anvNamnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(losenTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(repLosenTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(txtEpost)
                                .addComponent(txtTelefonnummer))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repLosenLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(skapaAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(anvNamnLabel)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(laggTillAdminLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(laggTillAdminLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anvNamnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anvNamnLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(losenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repLosenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repLosenLabel))
                .addGap(41, 41, 41)
                .addComponent(skapaAdminBtn)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skapaAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skapaAdminBtnActionPerformed
       try {
         
        String id = idb.getAutoIncrement("Admin", "AdminID") ;
        String anvNamn = anvNamnTxt.getText();
        String namn = txtNamn.getText();
        String epost = txtEpost.getText();
        String telefon = txtTelefonnummer.getText();
        String adress = txtAdress.getText();
        String losen = losenTxt.getText();
        String repLosen = repLosenTxt.getText();
        
        
        if (losen.equals(repLosen)){
          String mysqlFr�ga = "insert into Admin values (" + id + ",'" + namn + "'," + adress + ",'" + telefon + "','" + epost + "','" + anvNamn + "'," + losen + ")";
           idb.insert(mysqlFr�ga);        
        
        JOptionPane.showMessageDialog(null, "Ny admin har registrerats!");
        dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "L�senord �verensst�mmer inte!");
        }
        
        }
        catch (InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "N�got gick fel!");
        }
        
        
        
        
    }//GEN-LAST:event_skapaAdminBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anvNamnLabel;
    private javax.swing.JTextField anvNamnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel laggTillAdminLabel;
    private javax.swing.JLabel losenLabel;
    private javax.swing.JTextField losenTxt;
    private javax.swing.JLabel repLosenLabel;
    private javax.swing.JTextField repLosenTxt;
    private javax.swing.JButton skapaAdminBtn;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}
