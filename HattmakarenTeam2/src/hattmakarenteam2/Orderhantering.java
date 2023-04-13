package hattmakarenteam2;

import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;

public class Orderhantering extends javax.swing.JFrame {
private DefaultTableModel ejPabHattMod;
private DefaultTableModel pabHattMod;
private DefaultTableModel avslutadHattMod;
private ArrayList<String> ejPabHatt;
private ArrayList<String> pabHatt;
private ArrayList<String> avslutadHatt;
private InfDB idb;

    public Orderhantering(InfDB idb) {
        this.idb=idb;
        ejPabHatt = new ArrayList<>();
        pabHatt = new ArrayList<>();
        avslutadHatt = new ArrayList<>();
        initComponents();
        fyllTabeller();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderhanteringLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ejPaborjadLabel = new javax.swing.JLabel();
        paborjadLabel = new javax.swing.JLabel();
        avslutadLabel = new javax.swing.JLabel();
        hanteraOrderBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        avslutTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ejPabTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        pabTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderhanteringLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        orderhanteringLabel.setText("Orderhantering");

        ejPaborjadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ejPaborjadLabel.setText("Ej P�b�rjad");

        paborjadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        paborjadLabel.setText("P�b�rjad");

        avslutadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        avslutadLabel.setText("Avslutad");

        hanteraOrderBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hanteraOrderBtn.setText("Hantera vald order");
        hanteraOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraOrderBtnActionPerformed(evt);
            }
        });

        avslutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Avslutade ordrar"
            }
        ));
        jScrollPane1.setViewportView(avslutTable);
        if (avslutTable.getColumnModel().getColumnCount() > 0) {
            avslutTable.getColumnModel().getColumn(0).setResizable(false);
        }

        ejPabTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Ej p�b�rjade ordrar"
            }
        ));
        jScrollPane2.setViewportView(ejPabTable);
        if (ejPabTable.getColumnModel().getColumnCount() > 0) {
            ejPabTable.getColumnModel().getColumn(0).setResizable(false);
        }

        pabTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "P�b�rjade ordrar"
            }
        ));
        jScrollPane3.setViewportView(pabTable);
        if (pabTable.getColumnModel().getColumnCount() > 0) {
            pabTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ejPaborjadLabel)
                .addGap(172, 172, 172)
                .addComponent(paborjadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avslutadLabel)
                .addGap(108, 108, 108))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hanteraOrderBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(orderhanteringLabel)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderhanteringLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ejPaborjadLabel)
                    .addComponent(paborjadLabel)
                    .addComponent(avslutadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hanteraOrderBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hanteraOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraOrderBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanteraOrderBtnActionPerformed

  private void hamtaData(){
      try{
  ejPabHatt = idb.fetchColumn("Select kundNamn from kund where kundID in(Select kundID from ordrar where orderStatus='Ej P�b�rjad')");
  pabHatt = idb.fetchColumn("Select kundNamn from kund where kundID in(Select kundID from ordrar where orderStatus='P�b�rjad')");
  avslutadHatt = idb.fetchColumn("Select kundNamn from kund where kundID in(Select kundID from ordrar where orderStatus='Avslutad')");
  }
      catch(InfException e){
            System.out.println("N�got gick fel!");
        }
  }
      
    private void fyllTabeller(){
    hamtaData();
    ejPabHattMod = (DefaultTableModel) ejPabTable.getModel();
    pabHattMod = (DefaultTableModel) pabTable.getModel();
    avslutadHattMod = (DefaultTableModel) avslutTable.getModel();
    
    for(String namn : ejPabHatt){
            ejPabHattMod.addRow(new Object[]{namn});
        }
    for(String namn : pabHatt){
            pabHattMod.addRow(new Object[]{namn});
        }
    for(String namn : avslutadHatt){
            avslutadHattMod.addRow(new Object[]{namn});
        }
    }

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable avslutTable;
    private javax.swing.JLabel avslutadLabel;
    private javax.swing.JTable ejPabTable;
    private javax.swing.JLabel ejPaborjadLabel;
    private javax.swing.JButton hanteraOrderBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderhanteringLabel;
    private javax.swing.JTable pabTable;
    private javax.swing.JLabel paborjadLabel;
    // End of variables declaration//GEN-END:variables
}
