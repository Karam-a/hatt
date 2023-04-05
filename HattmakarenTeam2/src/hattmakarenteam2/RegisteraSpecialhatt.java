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
public class RegisteraSpecialhatt extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form RegisteraSpecialbeställning
     */
    public RegisteraSpecialhatt() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        ovrigtArea = new javax.swing.JTextArea();
        hattKnapp = new javax.swing.JButton();
        beskrivningTxt = new javax.swing.JTextField();
        beskrivningLabel = new javax.swing.JLabel();

        jTextField5.setText("jTextField1");

        jTextField7.setText("jTextField1");

        jTextField9.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SpecialhattLabel.setText("Specialhatt");
        SpecialhattLabel.setPreferredSize(new java.awt.Dimension(80, 17));

        NamnLabel.setText("Namn:");

        TygLabel.setText("Tyg:");

        StorlekLabel.setText("Storlek:");

        ModellLabel.setText("Modell:");

        FargLabel.setText("Färg: ");

        DekorationLabel.setText("Dekoration:");

        OvrigtLabel.setText("Övrigt:");

        namnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnTxtActionPerformed(evt);
            }
        });

        ovrigtArea.setColumns(20);
        ovrigtArea.setRows(5);
        jScrollPane2.setViewportView(ovrigtArea);

        hattKnapp.setText("Registrera hatt");

        beskrivningLabel.setText("Beskrivning:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(SpecialhattLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(TygLabel)
                                    .addGap(20, 20, 20))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(NamnLabel)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tygTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(namnTxt)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(FargLabel)
                                        .addComponent(ModellLabel)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(StorlekLabel)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(storlekTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(modellTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fargTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dekorationTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beskrivningTxt, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(beskrivningLabel)
                            .addComponent(DekorationLabel)
                            .addComponent(OvrigtLabel))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hattKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(SpecialhattLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TygLabel)
                    .addComponent(tygTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storlekTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StorlekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModellLabel)
                    .addComponent(modellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FargLabel)
                    .addComponent(fargTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DekorationLabel)
                    .addComponent(dekorationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beskrivningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beskrivningLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OvrigtLabel))
                .addGap(28, 28, 28)
                .addComponent(hattKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnTxtActionPerformed
        // TODO add your handling code here:
        
        try {
            idb=new InfDB("hattProjektet", "3306","hattProjektet","hattkey");
        
        String namn = namnTxt.getText();
        String tyg = tygTxt.getText();
        String storlek = storlekTxt.getText();
        String modell = modellTxt.getText();
        String farg = fargTxt.getText();
        String dekoration = dekorationTxt.getText();
        String beskrivning = beskrivningTxt.getText();
        String ovrigt = ovrigtArea.getText();
        String fraga = "insert into specialHattar values('"+namn+"', '"+tyg+"', '"+storlek+"', '"+modell+"', '"+farg+"', '"+dekoration+"', '"+beskrivning+"', '"+ovrigt+"')";
                
         
        if (ValideringsKlass.värdeExisterar(namnTxt) || ValideringsKlass.värdeExisterar(tygTxt) || ValideringsKlass.värdeExisterar(storlekTxt) || ValideringsKlass.värdeExisterar(modellTxt) || ValideringsKlass.värdeExisterar(fargTxt) || ValideringsKlass.värdeExisterar(dekorationTxt) || ValideringsKlass.värdeExisterar(beskrivningTxt))
        {}
            
        idb.insert(fraga);
                
        JOptionPane.showMessageDialog(null, "Ny specialhatt har registrerats!");        
            }
        catch(InfException ettUndantag){
               JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        
    }//GEN-LAST:event_namnTxtActionPerformed

 
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modellTxt;
    private javax.swing.JTextField namnTxt;
    private javax.swing.JTextArea ovrigtArea;
    private javax.swing.JTextField storlekTxt;
    private javax.swing.JTextField tygTxt;
    // End of variables declaration//GEN-END:variables
