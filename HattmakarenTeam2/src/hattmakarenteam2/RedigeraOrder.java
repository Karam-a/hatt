package hattmakarenteam2;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author andre
 */
public class RedigeraOrder extends javax.swing.JFrame {

    private InfDB idb;
    private int valdOrder;
    private String hattensID;
    
    
    
    /**
     * Creates new form RedigeraOrder
     */
    public RedigeraOrder(InfDB idb, int valdOrder) {
        this.idb = idb;
        this.valdOrder = valdOrder;
        initComponents();
        visaOrderID();
        visaHattar();
        visaKundensNamn();
        visaOrderDatum();
        visaOrderStatus();
        
    }
    
    private void visaOrderID(){
        String orderIDString = Integer.toString(valdOrder);
        valdOrderlbl.setText(orderIDString);
    }
    
    private void visaKundensNamn(){
        String fraga = "SELECT kundNamn FROM kund WHERE kundID IN(SELECT kundID FROM ordrar WHERE orderID=" + valdOrder +");";
        
        try {
            String kunden = idb.fetchSingle(fraga);
            
            kundTillOrderlbl.setText(kunden);
            
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }
    }
    
    private void visaOrderDatum(){
        
        String fraga = "SELECT orderDatum FROM ordrar WHERE orderID=" + valdOrder + ";";
        
        try {
            String orderDatum = idb.fetchSingle(fraga);
            
            orderDatum1lbl.setText(orderDatum);
            
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }

    }
    
    private void visaOrderStatus(){
        
        String fraga = "SELECT orderStatus FROM ordrar WHERE orderID =" + valdOrder + ";";
        
        try {
            String orderStatus = idb.fetchSingle(fraga);
            
            orderStatuscmb.setSelectedItem(orderStatus);
            
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }
    }
    
    
    private void visaHattar(){
        
        ArrayList<String> hattarIOrder;
        String fraga = "SELECT Namn FROM specialhattar WHERE orderID = " + valdOrder +";";
        
        DefaultListModel mod = new DefaultListModel();
        hattlist.setModel(mod);
        try {
            hattarIOrder = idb.fetchColumn(fraga);
            
            for (String hatt : hattarIOrder){
            mod.addElement(hatt);
            }

            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }
    }
    
    
    private void fyllHattInfo(String markeradHatt){
        
        HashMap<String, String> hatten;
        
        String fraga = "SELECT * FROM hattprojektet.specialhattar WHERE namn = '" + markeradHatt + "' AND specialhattar.orderID = " + valdOrder +";";
    
        try {
            hatten = idb.fetchRow(fraga);
            
            String hattensOrderID = Integer.toString(valdOrder);
            hattensID = hatten.get("SpecialhattID");
            String tyg = hatten.get("Tyg");
            String storlek = hatten.get("Storlek");
            String modell = hatten.get("Modell");
            String farg = hatten.get("Färg");
            String dekoration = hatten.get("Dekoration");
            String beskrivning = hatten.get("beskrivning");
            String ovrigt = hatten.get("Övrigt");
            String hattStatus = hatten.get("hattStatus");
            String pris = hatten.get("pris");
            String bradskandeHatt = hatten.get("bradskandeHatt");
            String ansvar = hatten.get("ansvar");
            
            
            String allHattInfo = 
                    "HattID: " + hattensID + 
                    "\nHattnamn: " + markeradHatt + 
                    "\nTyg: " + tyg +
                    "\nModell: " + modell +
                    "\nStorlek: " + storlek +
                    "\nFärg: " + farg +
                    "\nDekoration: " + dekoration +
                    "\nBeskrivning: " + beskrivning +
                    "\nÖvrigt: " + ovrigt +
                    "\nHattstatus: " + hattStatus +
                    "\nPris: " + pris +
                    "\nBrådskande hatt: " + bradskandeHatt +
                    "\nHattansvar: " + ansvar +
                    "\nTillhör Order: " + hattensOrderID;
            
            hattInfotxtarea.setText(allHattInfo);
        
        
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

        orderlbl = new javax.swing.JLabel();
        valdOrderlbl = new javax.swing.JLabel();
        kundTillOrderlbl = new javax.swing.JLabel();
        orderDatum1lbl = new javax.swing.JLabel();
        kundlbl = new javax.swing.JLabel();
        orderDatumlbl = new javax.swing.JLabel();
        hattlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hattlist = new javax.swing.JList<>();
        redigeraValdHattbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        taBortValdHattbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hattInfotxtarea = new javax.swing.JTextArea();
        prioriteraHattbtn = new javax.swing.JButton();
        prioriteraOrder = new javax.swing.JButton();
        tillbakabtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        orderStatuslbl = new javax.swing.JLabel();
        orderStatuscmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Redigera Order");

        orderlbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        orderlbl.setText("Order");

        valdOrderlbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        valdOrderlbl.setText("12345");

        kundTillOrderlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kundTillOrderlbl.setText("Otto Ottosson");

        orderDatum1lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderDatum1lbl.setText("2023-01-01");

        kundlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kundlbl.setText("Kund");

        orderDatumlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderDatumlbl.setText("Orderdatum");

        hattlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hattlbl.setText("Hattar");

        hattlist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hattlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hattlistMouseClicked(evt);
            }
        });
        hattlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                hattlistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(hattlist);

        redigeraValdHattbtn.setText("Redigera vald hatt");
        redigeraValdHattbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraValdHattbtnActionPerformed(evt);
            }
        });

        taBortValdHattbtn.setText("Ta bort vald hatt");
        taBortValdHattbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortValdHattbtnActionPerformed(evt);
            }
        });

        hattInfotxtarea.setEditable(false);
        hattInfotxtarea.setColumns(20);
        hattInfotxtarea.setRows(5);
        jScrollPane2.setViewportView(hattInfotxtarea);

        prioriteraHattbtn.setText("Prioritera Hatt");
        prioriteraHattbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioriteraHattbtnActionPerformed(evt);
            }
        });

        prioriteraOrder.setText("Prioritera hela ordern");
        prioriteraOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioriteraOrderActionPerformed(evt);
            }
        });

        tillbakabtn.setText("Tillbaka");
        tillbakabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakabtnActionPerformed(evt);
            }
        });

        jButton1.setText("Följdsedel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        orderStatuslbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderStatuslbl.setText("ORDERSTATUS");

        orderStatuscmb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderStatuscmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej Påbörjad", "Påbörjad", "Avslutad" }));
        orderStatuscmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderStatuscmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderlbl)
                .addGap(18, 18, 18)
                .addComponent(valdOrderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(hattlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kundlbl)
                                    .addComponent(orderDatumlbl))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kundTillOrderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderDatum1lbl))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(orderStatuslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderStatuscmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taBortValdHattbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redigeraValdHattbtn)
                                    .addComponent(tillbakabtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(prioriteraHattbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prioriteraOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(13, 13, 13)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valdOrderlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderStatuslbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kundlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kundTillOrderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderStatuscmb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orderDatumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orderDatum1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hattlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(redigeraValdHattbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBortValdHattbtn)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prioriteraHattbtn)
                            .addComponent(prioriteraOrder)
                            .addComponent(tillbakabtn))
                        .addContainerGap(8, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redigeraValdHattbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraValdHattbtnActionPerformed
        new RedigeraSpecialhatt(idb, this, hattensID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_redigeraValdHattbtnActionPerformed

    private void taBortValdHattbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortValdHattbtnActionPerformed
        TaBortHattBekrafta nyTaBortHatt = new TaBortHattBekrafta(idb, hattensID, valdOrder);
        nyTaBortHatt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_taBortValdHattbtnActionPerformed

    private void hattlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_hattlistValueChanged
        hattlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        String markeradHatt = hattlist.getSelectedValue();
        fyllHattInfo(markeradHatt);
    }//GEN-LAST:event_hattlistValueChanged

    private void hattlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hattlistMouseClicked
        String valdHatt = hattlist.getSelectedValue();
        fyllHattInfo(valdHatt);
    }//GEN-LAST:event_hattlistMouseClicked

    private void prioriteraHattbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioriteraHattbtnActionPerformed
        // gör prioritering av hatt tillgänglig
        BradskandeHatt nyRuta = new BradskandeHatt(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prioriteraHattbtnActionPerformed

    private void prioriteraOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioriteraOrderActionPerformed
        // TODO add your handling code here:
        
         BradskandeOrder nyRuta = new BradskandeOrder(idb);
        nyRuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prioriteraOrderActionPerformed

    private void tillbakabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakabtnActionPerformed
        ProgramStart nyStartruta = new ProgramStart();
        nyStartruta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tillbakabtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         new SkickadUthämtad(idb,  valdOrder).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orderStatuscmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderStatuscmbActionPerformed
        String orderStatus = orderStatuscmb.getSelectedItem().toString();
        
        String fraga = "UPDATE ordrar SET orderStatus = '" + orderStatus + "' WHERE orderID = " + valdOrder + ";";
        
        try {
            idb.update(fraga);

            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + e.getMessage());        
        }
    }//GEN-LAST:event_orderStatuscmbActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea hattInfotxtarea;
    private javax.swing.JLabel hattlbl;
    private javax.swing.JList<String> hattlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kundTillOrderlbl;
    private javax.swing.JLabel kundlbl;
    private javax.swing.JLabel orderDatum1lbl;
    private javax.swing.JLabel orderDatumlbl;
    private javax.swing.JComboBox<String> orderStatuscmb;
    private javax.swing.JLabel orderStatuslbl;
    private javax.swing.JLabel orderlbl;
    private javax.swing.JButton prioriteraHattbtn;
    private javax.swing.JButton prioriteraOrder;
    private javax.swing.JButton redigeraValdHattbtn;
    private javax.swing.JButton taBortValdHattbtn;
    private javax.swing.JButton tillbakabtn;
    private javax.swing.JLabel valdOrderlbl;
    // End of variables declaration//GEN-END:variables
}
