package hattmakarenteam2;

import javax.swing.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Orderhantering extends javax.swing.JFrame {
private DefaultTableModel ejPadHattMod;
private DefaultTableModel pabHattMod;
private DefaultTableModel avslutadHattMod;
private ArrayList<String> ejPabHatt;
private ArrayList<String> pabHatt;
private ArrayList<String> avslutadHatt;

    public Orderhantering() {
        
        ejPabHatt = new ArrayList<>();
        pabHatt = new ArrayList<>();
        avslutadHatt = new ArrayList<>();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderhanteringLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ejPaborjadLabel = new javax.swing.JLabel();
        paborjadLabel = new javax.swing.JLabel();
        avslutadLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ejPaborjadList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        avslutadList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        paborjadList = new javax.swing.JList<>();
        hanteraOrderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderhanteringLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        orderhanteringLabel.setText("Orderhantering");

        ejPaborjadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ejPaborjadLabel.setText("Ej Påbörjad");

        paborjadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        paborjadLabel.setText("Påbörjad");

        avslutadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        avslutadLabel.setText("Avslutad");

        jScrollPane2.setViewportView(ejPaborjadList);

        jScrollPane3.setViewportView(avslutadList);

        jScrollPane4.setViewportView(paborjadList);

        hanteraOrderBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hanteraOrderBtn.setText("Hantera vald order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(ejPaborjadLabel)
                .addGap(134, 134, 134)
                .addComponent(paborjadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avslutadLabel)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(orderhanteringLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hanteraOrderBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hanteraOrderBtn)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void hamtaData(){
  ejPabHatt = idb.fetchColumn("SELECT Namn FROM Alien WHERE Alien_ID IN(SELECT Alien_ID FROM Boglodite)");
  pabHatt = idb.fetchColumn("SELECT Namn FROM Alien WHERE Alien_ID IN(SELECT Alien_ID FROM Boglodite)");
  avslutadHatt = idb.fetchColumn();
  }
    private void fyllListor(){
    hamtaData();
    ejPabHattMod = (DefaultListModel) ejPaborjadList.get

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avslutadLabel;
    private javax.swing.JList<String> avslutadList;
    private javax.swing.JLabel ejPaborjadLabel;
    private javax.swing.JList<String> ejPaborjadList;
    private javax.swing.JButton hanteraOrderBtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderhanteringLabel;
    private javax.swing.JLabel paborjadLabel;
    private javax.swing.JList<String> paborjadList;
    // End of variables declaration//GEN-END:variables
}
