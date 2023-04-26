package hattmakarenteam2;


import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andre
 */
public class RedigeraSpecialhatt extends javax.swing.JFrame {
    
    
    private InfDB idb;
    private RedigeraOrder redOrder;
    private String hattensID;
    private int orderIDint;
    

    /**
     * Creates new form RedigeraSpecialhatt
     */
    public RedigeraSpecialhatt(InfDB idb, RedigeraOrder redOrder, String hattensID) {
        initComponents();
        this.idb = idb;
        this.redOrder = redOrder;
        this.hattensID = hattensID;
        fyllMedData();
    }
    
    private void fyllMedData(){
        int hattID = Integer.parseInt(hattensID);
        
        HashMap<String, String> hatten;
        
        String fraga = "SELECT * FROM specialhattar WHERE SpecialhattID= " + hattID +";";
        try {
            hatten = idb.fetchRow(fraga);
            
            String namn = hatten.get("Namn");
            String tyg = hatten.get("Tyg");
            String storlek = hatten.get("Storlek");
            String modell = hatten.get("Modell");
            String farg = hatten.get("F�rg");
            String dekoration = hatten.get("Dekoration");
            String beskrivning = hatten.get("Beskrivning");
            String ovrigt = hatten.get("�vrigt");
            String hattStatus = hatten.get("hattStatus");
            String orderID = hatten.get("orderID");
            String pris = hatten.get("pris");
            String bradskandeHatt = hatten.get("bradskandeHatt");
            String ansvar = hatten.get("ansvar");
            
            orderIDint = Integer.parseInt(orderID);
            
            
            hattIDlbl.setText(hattensID);
            namntxt.setText(namn);
            tygtxt.setText(tyg);
            storlektxt.setText(storlek);
            modelltxt.setText(modell);
            fargtxt.setText(farg);
            dekorationtxt.setText(dekoration);
            beskrivningtxt.setText(beskrivning);
            ovrigttxt.setText(ovrigt);
            hattstatuscmb.setSelectedItem(hattStatus);
            orderIDlbl.setText(orderID);
            pristxt.setText(pris);
            bradskandecmb.setSelectedItem(bradskandeHatt);
            ansvarcmb.setSelectedItem(ansvar);
                    
            
            
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }        
        
    }

    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redigeraHattlbl = new javax.swing.JLabel();
        hattIDlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tyglbl = new javax.swing.JLabel();
        storleklbl = new javax.swing.JLabel();
        namnlbl = new javax.swing.JLabel();
        modelllbl = new javax.swing.JLabel();
        farglbl = new javax.swing.JLabel();
        dekorationlbl = new javax.swing.JLabel();
        ovrigtlbl = new javax.swing.JLabel();
        beskrivninglbl = new javax.swing.JLabel();
        hattstatuslbl = new javax.swing.JLabel();
        prislbl = new javax.swing.JLabel();
        bekraftaandringarbtn = new javax.swing.JButton();
        namntxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        beskrivningtxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ovrigttxt = new javax.swing.JTextArea();
        tygtxt = new javax.swing.JTextField();
        storlektxt = new javax.swing.JTextField();
        modelltxt = new javax.swing.JTextField();
        fargtxt = new javax.swing.JTextField();
        dekorationtxt = new javax.swing.JTextField();
        pristxt = new javax.swing.JTextField();
        hattstatuscmb = new javax.swing.JComboBox<>();
        tillhorOrderlbl = new javax.swing.JLabel();
        orderIDlbl = new javax.swing.JLabel();
        prislbl1 = new javax.swing.JLabel();
        prislbl2 = new javax.swing.JLabel();
        avbrytbtn = new javax.swing.JButton();
        bradskandecmb = new javax.swing.JComboBox<>();
        ansvarcmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        redigeraHattlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        redigeraHattlbl.setText("Redigera hatt med ID");

        hattIDlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hattIDlbl.setText("12345");

        tyglbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tyglbl.setText("Tyg: ");

        storleklbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        storleklbl.setText("Storlek: ");

        namnlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namnlbl.setText("Namn: ");

        modelllbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modelllbl.setText("Modell: ");

        farglbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        farglbl.setText("F�rg: ");

        dekorationlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dekorationlbl.setText("Dekoration: ");

        ovrigtlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ovrigtlbl.setText("�vrigt: ");

        beskrivninglbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        beskrivninglbl.setText("Beskrivning: ");

        hattstatuslbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hattstatuslbl.setText("Hattstatus: ");

        prislbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prislbl.setText("Pris: ");

        bekraftaandringarbtn.setText("Bekr�fta �ndringar");
        bekraftaandringarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekraftaandringarbtnActionPerformed(evt);
            }
        });

        beskrivningtxt.setColumns(20);
        beskrivningtxt.setRows(5);
        jScrollPane1.setViewportView(beskrivningtxt);

        ovrigttxt.setColumns(20);
        ovrigttxt.setRows(5);
        jScrollPane2.setViewportView(ovrigttxt);

        tygtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tygtxtActionPerformed(evt);
            }
        });

        hattstatuscmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej P�b�rjad", "P�b�rjad", "Avslutad" }));
        hattstatuscmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hattstatuscmbActionPerformed(evt);
            }
        });

        tillhorOrderlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tillhorOrderlbl.setText("Tillh�r order: ");

        orderIDlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        orderIDlbl.setText("12345");

        prislbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prislbl1.setText("Br�dskande? ");

        prislbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prislbl2.setText("Ansvar:");

        avbrytbtn.setText("Avbryt");
        avbrytbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytbtnActionPerformed(evt);
            }
        });

        bradskandecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEJ", "JA" }));
        bradskandecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bradskandecmbActionPerformed(evt);
            }
        });

        ansvarcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej tilldelad", "Otto", "Judith", "Andreas" }));
        ansvarcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansvarcmbActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(redigeraHattlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hattIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tillhorOrderlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                        .addComponent(prislbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ovrigtlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(farglbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modelllbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(storleklbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dekorationlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(beskrivninglbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hattstatuslbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(namnlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tyglbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(prislbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(prislbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namntxt)
                                    .addComponent(tygtxt)
                                    .addComponent(storlektxt)
                                    .addComponent(modelltxt)
                                    .addComponent(fargtxt)
                                    .addComponent(pristxt)
                                    .addComponent(hattstatuscmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderIDlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bradskandecmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ansvarcmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(dekorationtxt))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avbrytbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bekraftaandringarbtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redigeraHattlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hattIDlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tyglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tygtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storleklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storlektxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelllbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(farglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fargtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dekorationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dekorationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beskrivninglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ovrigtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hattstatuscmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hattstatuslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pristxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prislbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bradskandecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prislbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansvarcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prislbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tillhorOrderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bekraftaandringarbtn)
                    .addComponent(avbrytbtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bekraftaandringarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bekraftaandringarbtnActionPerformed
        
        String nyNamn = namntxt.getText();
        String nyTyg = tygtxt.getText();
        String nyStorlek = storlektxt.getText();
        String nyModell = modelltxt.getText();
        String nyFarg = fargtxt.getText();
        String nyDekoration = dekorationtxt.getText();
        String nyBeskrivning = beskrivningtxt.getText();
        String nyOvrigt = ovrigttxt.getText();
        String nyHattStatus = hattstatuscmb.getSelectedItem().toString();
        String nyPris = pristxt.getText();
        String nyBradskande = bradskandecmb.getSelectedItem().toString();
        String nyAnsvar = ansvarcmb.getSelectedItem().toString();
        
        int hattID = Integer.parseInt(hattensID);
        double prisDouble = Double.parseDouble(nyPris);
        
        String fraga = "UPDATE hattprojektet.specialhattar SET Namn = '" + nyNamn + "', "
                + "Tyg = '" + nyTyg + "', "
                + "Storlek = '" + nyStorlek + "', "
                + "Modell = '" + nyModell + "', "
                + "F�rg = '" + nyFarg + "', "
                + "Dekoration = '" + nyDekoration + "', "
                + "beskrivning = '" + nyBeskrivning + "', "
                + "�vrigt = '" + nyOvrigt + "', "
                + "hattStatus = '" + nyHattStatus + "', "
                + "pris = " + prisDouble + ", "
                + "bradskandeHatt = '" + nyBradskande + "', "
                + "ansvar = '" + nyAnsvar + "' "
                + "WHERE specialhattar.SpecialhattID = " + hattID + ";";
        
        execute(fraga);
        
        RedigeraOrder nyRedOrder = new RedigeraOrder(idb, orderIDint);
        nyRedOrder.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_bekraftaandringarbtnActionPerformed

    private void execute(String fraga){
        
        try {
            idb.update(fraga);
            JOptionPane.showMessageDialog(null, "Informationen har uppdaterats!");
            this.dispose();
            redOrder.dispose();
            RedigeraOrder redOrder = new RedigeraOrder(idb, orderIDint);
            redOrder.setVisible(true);
            
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());             
        }
    
    }
    
    private void uppdateraAnsvarCMB(){
        String ansvarig = ansvarcmb.getSelectedItem().toString();
        
        if (ansvarig == "Otto"){
            ansvarcmb.setBackground(Color.yellow);
            uppdateraHattStatus();
        } 
        else if (ansvarig == "Judith") {
            ansvarcmb.setBackground(Color.green);
            uppdateraHattStatus();
        }
        else if (ansvarig == "Andreas") {
            ansvarcmb.setBackground(Color.blue);
            uppdateraHattStatus();
        }
        else if (ansvarig == "Ej Tilldelad") {
            ansvarcmb.setBackground(Color.white);
        }
    }
    
    private void uppdateraHattStatus(){
        hattstatuscmb.setSelectedItem("P�b�rjad");
    }
    
    
    
    private void tygtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tygtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tygtxtActionPerformed

    private void avbrytbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytbtnActionPerformed
        RedigeraOrder nyRedOrder = new RedigeraOrder(idb, orderIDint);
        nyRedOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avbrytbtnActionPerformed

    private void bradskandecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bradskandecmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bradskandecmbActionPerformed

    private void ansvarcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansvarcmbActionPerformed
        uppdateraAnsvarCMB();
    }//GEN-LAST:event_ansvarcmbActionPerformed

    private void hattstatuscmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hattstatuscmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hattstatuscmbActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ansvarcmb;
    private javax.swing.JButton avbrytbtn;
    private javax.swing.JButton bekraftaandringarbtn;
    private javax.swing.JLabel beskrivninglbl;
    private javax.swing.JTextArea beskrivningtxt;
    private javax.swing.JComboBox<String> bradskandecmb;
    private javax.swing.JLabel dekorationlbl;
    private javax.swing.JTextField dekorationtxt;
    private javax.swing.JLabel farglbl;
    private javax.swing.JTextField fargtxt;
    private javax.swing.JLabel hattIDlbl;
    private javax.swing.JComboBox<String> hattstatuscmb;
    private javax.swing.JLabel hattstatuslbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel modelllbl;
    private javax.swing.JTextField modelltxt;
    private javax.swing.JLabel namnlbl;
    private javax.swing.JTextField namntxt;
    private javax.swing.JLabel orderIDlbl;
    private javax.swing.JLabel ovrigtlbl;
    private javax.swing.JTextArea ovrigttxt;
    private javax.swing.JLabel prislbl;
    private javax.swing.JLabel prislbl1;
    private javax.swing.JLabel prislbl2;
    private javax.swing.JTextField pristxt;
    private javax.swing.JLabel redigeraHattlbl;
    private javax.swing.JLabel storleklbl;
    private javax.swing.JTextField storlektxt;
    private javax.swing.JLabel tillhorOrderlbl;
    private javax.swing.JLabel tyglbl;
    private javax.swing.JTextField tygtxt;
    // End of variables declaration//GEN-END:variables
}
