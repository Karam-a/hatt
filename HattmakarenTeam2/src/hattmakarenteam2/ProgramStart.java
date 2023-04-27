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
                JOptionPane.showMessageDialog(null,"Anslutningen misslyckades! Vänligen försök igen!");
                }
            }
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regOrderBtn = new javax.swing.JButton();
        orderMenyBtn = new javax.swing.JButton();
        kundMenyBtn = new javax.swing.JButton();
        materialBestBtn = new javax.swing.JButton();
        loggaInBtn = new javax.swing.JButton();
        regSpecHattBtn = new javax.swing.JButton();
        foljdSedel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        avslutaBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ottos Hattmakeri");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ottos Hattmakeri");

        regOrderBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        regOrderBtn.setText("Orderregistrering");
        regOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regOrderBtnActionPerformed(evt);
            }
        });

        orderMenyBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        orderMenyBtn.setText("Planeringsyta");
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
        materialBestBtn.setText("Materialbeställningslista");
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

        regSpecHattBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        regSpecHattBtn.setText("Registrera Specialhatt");
        regSpecHattBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSpecHattBtnActionPerformed(evt);
            }
        });

        foljdSedel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        foljdSedel.setText("Skapa Frakt/Följdsedel");
        foljdSedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foljdSedelActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Butiksköp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Statistik");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Admin & Kassa");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Orderhantering");

        avslutaBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        avslutaBtn.setText("Avsluta");
        avslutaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avslutaBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("© Garcia Systems AB 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kundMenyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loggaInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avslutaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(regSpecHattBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(materialBestBtn))
                                .addComponent(foljdSedel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(orderMenyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(regOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(avslutaBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loggaInBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kundMenyBtn)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderMenyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regOrderBtn)
                .addGap(8, 8, 8)
                .addComponent(regSpecHattBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materialBestBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foljdSedel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        new Materialbeställningslista(idb).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_materialBestBtnActionPerformed

    private void loggaInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInBtnActionPerformed
        // TODO add your handling code here:
     new InloggAdmin(idb).setVisible(true);
     this.dispose();
    }//GEN-LAST:event_loggaInBtnActionPerformed

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
        // knapp för öppna j-frame GenomförKopAvLagerfordhatt
        GenomforKopLagerfordHatt nyRuta = new GenomforKopLagerfordHatt(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Försäljningsstatistik(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void avslutaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avslutaBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_avslutaBtnActionPerformed

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
    private javax.swing.JButton TillbakaBtn;
    private javax.swing.JButton avslutaBtn;
    private javax.swing.JButton foljdSedel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton kundMenyBtn;
    private javax.swing.JButton loggaInBtn;
    private javax.swing.JButton materialBestBtn;
    private javax.swing.JButton orderMenyBtn;
    private javax.swing.JButton regOrderBtn;
    private javax.swing.JButton regSpecHattBtn;
    // End of variables declaration//GEN-END:variables
}
