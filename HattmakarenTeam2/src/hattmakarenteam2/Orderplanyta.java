
package hattmakarenteam2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Orderplanyta extends javax.swing.JFrame {

private int valdOrderID;
private DefaultTableModel ejPabOrdTableMod;
private DefaultTableModel pabOrdTableMod;
private DefaultTableModel avslutOrdTableMod;
private ArrayList<String> ePOTaL;
private ArrayList<String> pOTaL;
private ArrayList<String> aOTaL;
private InfDB idb;

    public Orderplanyta(InfDB idb) {
        this.idb = idb;
        ePOTaL = new ArrayList<>();
        pOTaL = new ArrayList<>();
        aOTaL = new ArrayList<>();
        initComponents();
        setTable();
    }

    //Metod som hämtar data från databasen och lägger till i arrayLists.
    private void getData(){
        try{
                ePOTaL = idb.fetchColumn("Select kundNamn from kund where kundID in(Select kundID from ordrar where orderStatus='Ej Påbörjad')");
                pOTaL = idb.fetchColumn("Select kundNamn from kund where kundID in(Select kundID from ordrar where orderStatus='Påbörjad')");
                aOTaL = idb.fetchColumn("Select kundNamn from kund where kundID in(Select kundID from ordrar where orderStatus='Avslutad')");
        }
      catch(InfException e){
            JOptionPane.showMessageDialog(null, "Gick ej att hämta innehållet i databasen.");
        }
    }
    
    //Metod som sätter alla värden i tabellen från databasen. Hämtar först data. 
    //Loopar genom och lägger till i modellen för varje enskild tabell
    private void setTable(){
     getData();
     ejPabOrdTableMod = (DefaultTableModel) ejPabOrdTable.getModel();
     pabOrdTableMod = (DefaultTableModel) pabOrdTable.getModel();
     avslutOrdTableMod = (DefaultTableModel) avslutOrdTable.getModel();
    
    for(String namn : ePOTaL){
            ejPabOrdTableMod.addRow(new Object[]{namn});
        }
    for(String namn : pOTaL){
            pabOrdTableMod.addRow(new Object[]{namn});
        }
    for(String namn : aOTaL){
            avslutOrdTableMod.addRow(new Object[]{namn});
        }
    }
    

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pabOrdTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ejPabOrdTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        avslutOrdTable = new javax.swing.JTable();
        hantOrdBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tillbakaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pabOrdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Påbörjade ordrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pabOrdTable.setColumnSelectionAllowed(true);
        pabOrdTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(pabOrdTable);
        pabOrdTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (pabOrdTable.getColumnModel().getColumnCount() > 0) {
            pabOrdTable.getColumnModel().getColumn(0).setResizable(false);
        }

        ejPabOrdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ej Påbörjade ordrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ejPabOrdTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ejPabOrdTable);
        ejPabOrdTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (ejPabOrdTable.getColumnModel().getColumnCount() > 0) {
            ejPabOrdTable.getColumnModel().getColumn(0).setResizable(false);
        }

        avslutOrdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Avslutade ordrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        avslutOrdTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(avslutOrdTable);
        avslutOrdTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (avslutOrdTable.getColumnModel().getColumnCount() > 0) {
            avslutOrdTable.getColumnModel().getColumn(0).setResizable(false);
        }

        hantOrdBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hantOrdBtn.setText("Hantera Vald Order");
        hantOrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hantOrdBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Orderplaneringsyta");

        tillbakaBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tillbakaBtn.setText("Tillbaka");
        tillbakaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hantOrdBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tillbakaBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tillbakaBtn)
                    .addComponent(hantOrdBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hantOrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hantOrdBtnActionPerformed
        //Vid knapptryck. Hittar vilken table ett val gjorts i först.
        JTable valdTable = null;
        if(ejPabOrdTable.getSelectedRow() != -1){
            valdTable = ejPabOrdTable;
        }
        else if (pabOrdTable.getSelectedRow() != -1){
            valdTable = pabOrdTable;
        }
        else if(avslutOrdTable.getSelectedRow() != -1){
            valdTable = avslutOrdTable;
        }
        else{
            JOptionPane.showMessageDialog(null,"Vänligen välj en order att hantera!");
        }
         //anger den valda ordern som det valda värdet i den valda tabellen.
        Object valdOrder = valdTable.getValueAt(valdTable.getSelectedRow(),0);
 
        //Hämtar sedan ut orderID för vald order.
        try{
            valdOrderID = Integer.parseInt(idb.fetchSingle("SELECT orderID FROM ordrar WHERE kundID IN(SELECT kundID FROM kund WHERE kundNamn=" +"'"+ valdOrder.toString() + "'"+ ")" ));
            new RedigeraOrder(idb,valdOrderID).setVisible(true);
            this.dispose();
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Misslyckades med att hämta ut OrderID för vald order.");
        }
    }//GEN-LAST:event_hantOrdBtnActionPerformed

    private void tillbakaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaBtnActionPerformed
        this.dispose();
        new ProgramStart().setVisible(true);
    }//GEN-LAST:event_tillbakaBtnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable avslutOrdTable;
    private javax.swing.JTable ejPabOrdTable;
    private javax.swing.JButton hantOrdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable pabOrdTable;
    private javax.swing.JButton tillbakaBtn;
    // End of variables declaration//GEN-END:variables
}
