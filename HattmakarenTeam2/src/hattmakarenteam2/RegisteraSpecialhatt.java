/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;

import static hattmakarenteam2.RegOrder.getKund;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author axelbrave & pellen
 */
public class RegisteraSpecialhatt extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form RegisteraSpecialbeställning
     */
    public RegisteraSpecialhatt(InfDB idb) {
        this.idb=idb;
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SpecialhattLabel = new javax.swing.JLabel();
        NamnLabel = new javax.swing.JLabel();
        TygLabel = new javax.swing.JLabel();
        StorlekLabel = new javax.swing.JLabel();
        ModellLabel = new javax.swing.JLabel();
        FargLabel = new javax.swing.JLabel();
        DekorationLabel = new javax.swing.JLabel();
        OvrigtLabel = new javax.swing.JLabel();
        namnTxt = new javax.swing.JTextField();
        tygTxt = new javax.swing.JTextField();
        storlekTxt = new javax.swing.JTextField();
        modellTxt = new javax.swing.JTextField();
        fargTxt = new javax.swing.JTextField();
        dekorationTxt = new javax.swing.JTextField();
        hattKnapp = new javax.swing.JButton();
        beskrivningTxt = new javax.swing.JTextField();
        beskrivningLabel = new javax.swing.JLabel();
        ovrigtTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prisTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField5.setText("jTextField1");

        jTextField7.setText("jTextField1");

        jTextField9.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SpecialhattLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 24)); // NOI18N
        SpecialhattLabel.setText("Specialhatt");
        SpecialhattLabel.setPreferredSize(new java.awt.Dimension(80, 17));

        NamnLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        NamnLabel.setText("Namn:");

        TygLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        TygLabel.setText("Tyg:");

        StorlekLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        StorlekLabel.setText("Storlek:");

        ModellLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        ModellLabel.setText("Modell:");

        FargLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        FargLabel.setText("Färg: ");

        DekorationLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        DekorationLabel.setText("Dekoration:");

        OvrigtLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        OvrigtLabel.setText("Övrigt:");

        hattKnapp.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 18)); // NOI18N
        hattKnapp.setText("Registrera hatt");
        hattKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hattKnappActionPerformed(evt);
            }
        });

        beskrivningLabel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        beskrivningLabel.setText("Beskrivning:");

        jLabel1.setText("Pris:");

        prisTXT.setColumns(5);

        jLabel2.setText("Vänligen för in information om hatten");

        jLabel3.setText("Varje hatt som registrerar kopplas automatisk till ordern");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(hattKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(FargLabel)
                                        .addComponent(DekorationLabel)
                                        .addComponent(ModellLabel)
                                        .addComponent(TygLabel)
                                        .addComponent(NamnLabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(StorlekLabel)))
                                    .addComponent(beskrivningLabel))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OvrigtLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beskrivningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dekorationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fargTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tygTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(storlekTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ovrigtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SpecialhattLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialhattLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamnLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TygLabel)
                    .addComponent(tygTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(prisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storlekTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StorlekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModellLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fargTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FargLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dekorationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DekorationLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beskrivningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beskrivningLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ovrigtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OvrigtLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hattKnapp)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hattKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hattKnappActionPerformed
        
        try {
            
            idb=new InfDB("hattProjektet", "3306","hattProjektet","hattkey");
            
            String ID = idb.getAutoIncrement("specialHattar", "SpecialhattID");
            String namn = namnTxt.getText();
            String hamtaKund = getKund();
            String orderiD = "Fan eller ;/ " ;
            String pris = prisTXT.getText();
            String tyg = tygTxt.getText();
            String storlek = storlekTxt.getText();
            String modell = modellTxt.getText();
            String farg = fargTxt.getText();
            String dekoration = dekorationTxt.getText();
            String beskrivning = beskrivningTxt.getText();
            String ovrigt = ovrigtTxt.getText();
            String status = "EjPåbörjad";
            String fraga = "insert into specialhattar values(" + ID + ",'" + namn + "','" + tyg + "','" + storlek + "','" + modell + "','" + farg + "','" + dekoration + "','" + beskrivning +"','" + ovrigt + "','" + status + "',"+orderiD+","+pris+");";
           
            
           
        if (ValideringKlass.finnsVarde(namnTxt) || ValideringKlass.finnsVarde(prisTXT) || ValideringKlass.finnsVarde(tygTxt) || ValideringKlass.finnsVarde(storlekTxt) || ValideringKlass.finnsVarde(modellTxt) || ValideringKlass.finnsVarde(fargTxt) || ValideringKlass.finnsVarde(dekorationTxt) || ValideringKlass.finnsVarde(beskrivningTxt))
        {}
            
        idb.insert(fraga);
                
        JOptionPane.showMessageDialog(null, "Ny specialhatt har registrerats!");
        
            }
        
        catch(InfException ettUndantag){
               JOptionPane.showMessageDialog(null, "Något gick fel, ingen specialhatt registrerades!");
        }

    }//GEN-LAST:event_hattKnappActionPerformed

    
    
    
    
    
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DekorationLabel;
    private javax.swing.JLabel FargLabel;
    private javax.swing.JLabel ModellLabel;
    private javax.swing.JLabel NamnLabel;
    private javax.swing.JLabel OvrigtLabel;
    private javax.swing.JLabel SpecialhattLabel;
    private javax.swing.JLabel StorlekLabel;
    private javax.swing.JLabel TygLabel;
    private javax.swing.JLabel beskrivningLabel;
    private javax.swing.JTextField beskrivningTxt;
    private javax.swing.JTextField dekorationTxt;
    private javax.swing.JTextField fargTxt;
    private javax.swing.JButton hattKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modellTxt;
    private javax.swing.JTextField namnTxt;
    private javax.swing.JTextField ovrigtTxt;
    private javax.swing.JTextField prisTXT;
    private javax.swing.JTextField storlekTxt;
    private javax.swing.JTextField tygTxt;
    // End of variables declaration//GEN-END:variables
}