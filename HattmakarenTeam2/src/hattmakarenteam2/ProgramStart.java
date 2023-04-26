package hattmakarenteam2;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ProgramStart extends javax.swing.JFrame {

 private static InfDB idb;
 
    public ProgramStart() {
         {   
        try { idb=new InfDB("hattProjektet", "3306","hattProjektet","hattkey");
          } 
        catch (InfException e){
                Logger.getLogger(ProgramStart.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null,"Anslutningen misslyckades! V�nligen f�rs�k igen!");
                }
            }
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kassaBtn = new javax.swing.JButton();
        regOrderBtn = new javax.swing.JButton();
        orderMenyBtn = new javax.swing.JButton();
        kundMenyBtn = new javax.swing.JButton();
        materialBestBtn = new javax.swing.JButton();
        loggaInBtn = new javax.swing.JButton();
        jButtonBestallningar = new javax.swing.JButton();
        regSpecHattBtn = new javax.swing.JButton();
        foljdSedel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ottos Hattar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ottos Hattar");

        kassaBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kassaBtn.setText("Kassa");
        kassaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kassaBtnActionPerformed(evt);
            }
        });

        regOrderBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        regOrderBtn.setText("Registrera Order");
        regOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regOrderBtnActionPerformed(evt);
            }
        });

        orderMenyBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        orderMenyBtn.setText("Ordermeny");
        orderMenyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMenyBtnActionPerformed(evt);
            }
        });

        kundMenyBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kundMenyBtn.setText("Kundmeny");
        kundMenyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kundMenyBtnActionPerformed(evt);
            }
        });

        materialBestBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        materialBestBtn.setText("Skapa Materialbest�llning");
        materialBestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialBestBtnActionPerformed(evt);
            }
        });

        loggaInBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loggaInBtn.setText("Logga In");
        loggaInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInBtnActionPerformed(evt);
            }
        });

        jButtonBestallningar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonBestallningar.setText("H�mta best�llningsinfo");
        jButtonBestallningar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBestallningarActionPerformed(evt);
            }
        });

        regSpecHattBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        regSpecHattBtn.setText("Registrera Specialhatt");
        regSpecHattBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSpecHattBtnActionPerformed(evt);
            }
        });

        foljdSedel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        foljdSedel.setText("Skapa Frakt/F�ljdsedel");
        foljdSedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foljdSedelActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Genomf�r k�p av lagerf�rd hatt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("F�rs�ljningsstatistik");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kundMenyBtn)
                            .addComponent(regSpecHattBtn)
                            .addComponent(materialBestBtn)
                            .addComponent(regOrderBtn))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loggaInBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kassaBtn)
                        .addGap(236, 236, 236))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orderMenyBtn)
                                .addGap(215, 215, 215)
                                .addComponent(foljdSedel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonBestallningar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(kassaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(foljdSedel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(loggaInBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderMenyBtn)
                        .addGap(18, 18, 18)
                        .addComponent(regOrderBtn)
                        .addGap(18, 18, 18)
                        .addComponent(regSpecHattBtn)
                        .addGap(18, 18, 18)))
                .addComponent(jButtonBestallningar)
                .addGap(18, 18, 18)
                .addComponent(kundMenyBtn)
                .addGap(18, 18, 18)
                .addComponent(materialBestBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kassaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kassaBtnActionPerformed
        new KassajFrame(idb).setVisible(true);
    }//GEN-LAST:event_kassaBtnActionPerformed

    private void regOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regOrderBtnActionPerformed
        new RegOrder(idb).setVisible(true);
    }//GEN-LAST:event_regOrderBtnActionPerformed

    private void orderMenyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMenyBtnActionPerformed
        new Orderplanyta(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderMenyBtnActionPerformed

    private void kundMenyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundMenyBtnActionPerformed
        // TODO add your handling code here:
         new Kundmeny(idb).setVisible(true);
           this.dispose();
    }//GEN-LAST:event_kundMenyBtnActionPerformed

    private void materialBestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialBestBtnActionPerformed
        // TODO add your handling code here:
        new Materialbest�llningslista(idb).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_materialBestBtnActionPerformed

    private void loggaInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInBtnActionPerformed
        // TODO add your handling code here:
     new InloggAdmin(idb).setVisible(true);
     this.dispose();
    }//GEN-LAST:event_loggaInBtnActionPerformed

    private void jButtonBestallningarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBestallningarActionPerformed
        // �ppna upp hamtaBestallningar
        HamtaBestallningsInfo nyRuta = new HamtaBestallningsInfo(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBestallningarActionPerformed

    private void regSpecHattBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSpecHattBtnActionPerformed
        new RegisteraSpecialhatt(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regSpecHattBtnActionPerformed

    private void foljdSedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foljdSedelActionPerformed
        // TODO add your handling code here:
         new FraktsedelFoljdsedelUtskrift(idb).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_foljdSedelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // knapp f�r �ppna j-frame Genomf�rKopAvLagerfordhatt
        GenomforKopLagerfordHatt nyRuta = new GenomforKopLagerfordHatt(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new F�rs�ljningsstatistik(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foljdSedel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBestallningar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kassaBtn;
    private javax.swing.JButton kundMenyBtn;
    private javax.swing.JButton loggaInBtn;
    private javax.swing.JButton materialBestBtn;
    private javax.swing.JButton orderMenyBtn;
    private javax.swing.JButton regOrderBtn;
    private javax.swing.JButton regSpecHattBtn;
    // End of variables declaration//GEN-END:variables
}
