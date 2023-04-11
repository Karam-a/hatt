package hattmakarenteam2;
/**a*/
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
                System.out.println("Anslutningen gick åt helvete, forsok igen!");
          }
     }
        
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
        jSeparator1 = new javax.swing.JSeparator();
        kassaBtn = new javax.swing.JButton();
        regOrderBtn = new javax.swing.JButton();
        orderMenyBtn = new javax.swing.JButton();
        kundMenyBtn = new javax.swing.JButton();
        materialBestBtn = new javax.swing.JButton();
        loggaInBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonBestallningar = new javax.swing.JButton();
        regSpecHattBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ottos Hattar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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
        materialBestBtn.setText("Skapa Materialbeställning");
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

        jButton1.setText("Hämta kundinformation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonBestallningar.setText("Hämta beställningsinfo");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kassaBtn)
                                .addGap(198, 198, 198)
                                .addComponent(loggaInBtn))
                            .addComponent(regOrderBtn)
                            .addComponent(orderMenyBtn)
                            .addComponent(kundMenyBtn)
                            .addComponent(materialBestBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonBestallningar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                            .addComponent(regSpecHattBtn))))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kassaBtn)
                    .addComponent(loggaInBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regOrderBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderMenyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kundMenyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materialBestBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButtonBestallningar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regSpecHattBtn)
                .addContainerGap(310, Short.MAX_VALUE))
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
        new Orderhantering(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderMenyBtnActionPerformed

    private void kundMenyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundMenyBtnActionPerformed
        // TODO add your handling code here:
         new RegistreraNyKund(idb).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_kundMenyBtnActionPerformed

    private void materialBestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialBestBtnActionPerformed
        // TODO add your handling code here:
        new Materialbeställningslista(idb).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_materialBestBtnActionPerformed

    private void loggaInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggaInBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // hämta kundinfo
        HamtaKundInfo nyRuta= new HamtaKundInfo(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBestallningarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBestallningarActionPerformed
        // öppna upp hamtaBestallningar
        HamtaBestallningsInfo nyRuta = new HamtaBestallningsInfo(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBestallningarActionPerformed

    private void regSpecHattBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSpecHattBtnActionPerformed
        new RegisteraSpecialhatt(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regSpecHattBtnActionPerformed

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
    private javax.swing.JButton jButton1;
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
