package hattmakarenteam2;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class KassajFrame extends javax.swing.JFrame {
    private InfDB idb;
    
    public KassajFrame(InfDB idb) {
        initComponents();
        this.idb= idb;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        prisField = new javax.swing.JTextField();
        hattNamnField = new javax.swing.JTextField();
        genomforKopBtn = new javax.swing.JButton();
        tillbakaBtn = new javax.swing.JButton();
        hattnamnLabel = new javax.swing.JLabel();
        prisLabel = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kassa");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Kassa");

        hattNamnField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hattNamnFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hattNamnFieldFocusLost(evt);
            }
        });

        genomforKopBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genomforKopBtn.setText("Genomf�r K�p");
        genomforKopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genomforKopBtnActionPerformed(evt);
            }
        });

        tillbakaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tillbakaBtn.setText("Tillbaka");
        tillbakaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaBtnActionPerformed(evt);
            }
        });

        hattnamnLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hattnamnLabel.setText("Produktnamn:");

        prisLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prisLabel.setText("Pris:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(tillbakaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genomforKopBtn)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hattnamnLabel)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prisLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hattNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prisField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(hattNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hattnamnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prisLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genomforKopBtn)
                    .addComponent(tillbakaBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hattNamnFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hattNamnFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_hattNamnFieldFocusGained

    private void hattNamnFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hattNamnFieldFocusLost
       //TODO
    }//GEN-LAST:event_hattNamnFieldFocusLost

    private void genomforKopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genomforKopBtnActionPerformed
        try{
            int ID = Integer.parseInt(idb.getAutoIncrement("kop", "kopID"));
            String prodNamn = hattNamnField.getText();
            double pris = Double.parseDouble(prisField.getText());
            LocalDate kopDatum = LocalDate.now();
            String fraga = "INSERT INTO hattprojektet.kop VALUES (" + ID + "," + "'" + prodNamn + "'" + "," + pris + "," + "'" + kopDatum+ "'"+");";

            idb.insert(fraga);
            JOptionPane.showMessageDialog(null, prodNamn + " har registrerats!");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel");
        }
        
    }//GEN-LAST:event_genomforKopBtnActionPerformed

    private void tillbakaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_tillbakaBtnActionPerformed

 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton genomforKopBtn;
    private javax.swing.JTextField hattNamnField;
    private javax.swing.JLabel hattnamnLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField prisField;
    private javax.swing.JLabel prisLabel;
    private javax.swing.JButton tillbakaBtn;
    // End of variables declaration//GEN-END:variables
}
