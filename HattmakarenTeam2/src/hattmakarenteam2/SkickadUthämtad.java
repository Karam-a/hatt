/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author alexm
 */
public class SkickadUthämtad extends javax.swing.JFrame {
private InfDB idb;
private int valdOrder;
    /**
     * Creates new form SkickadUthämtad
     * @param idb
     */
    public SkickadUthämtad(InfDB idb, int valdOrder) {
       this.valdOrder = valdOrder;
        this.idb = idb;
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

        Skickad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultat = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Skickad.setText("Skapa Följdsedel");
        Skickad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkickadActionPerformed(evt);
            }
        });

        Resultat.setColumns(20);
        Resultat.setRows(5);
        jScrollPane1.setViewportView(Resultat);

        jLabel1.setText("Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Skickad)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Skickad)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkickadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkickadActionPerformed
        // TODO add your handling code here:
       //Pdf orderbeställning, all info om hatten. Pris för varje hatt, totatlpris. Info för att ta kontakt tillbaka.  
//Kostnadsförslaget kanske ska va pdf.
//Fraktsedeln utgör bevis för att varorna skickats
        //Printing av pdf
        Document doc = new Document();  
       
                 try {
        
        //Förmodligen så hämtas all info från Jframen som Andreas jobbar. OrderIdt 
        String kundFraga = "Select kundId from ordrar where orderID="+valdOrder+"";
        String kundFraga2 = idb.fetchSingle(kundFraga);
        String kundFraga3 = "Select kundNamn from kund where kundID="+kundFraga2+"";
        String namn = idb.fetchSingle(kundFraga3);
        
        String produktFraga = "Select Namn, Modell, Pris from specialhattar where orderID ="+valdOrder+"";
       ArrayList<HashMap<String, String>> produktSvar= idb.fetchRows(produktFraga);
       
        String fraga= "Select orderDatum,pris from ordrar where orderID ="+valdOrder+"";
        ArrayList<String> info= idb.fetchColumn(fraga);
        
        
        //ej klar
       //strängen som ja sparar totalpriset i
      int kopID = 123; // Replace with the actual ID value
String totalprisQuery = "SELECT SUM(pris) AS totalprice FROM specialhattar WHERE orderID = " + valdOrder+"";
ArrayList<String> totalpris = idb.fetchColumn(totalprisQuery);
double totalprisWithVAT = 0.0;
if (!totalpris.isEmpty()) {
    String totalprisStr = totalpris.get(0); // Get the first (and only) element from the list
    double totalprisDouble = Double.parseDouble(totalprisStr); // Convert the string to a double
     totalprisWithVAT = totalprisDouble * 1.25; // Multiply by 1.25 to include VAT
    System.out.println("Total price with VAT: " + totalprisWithVAT);
} else {
    System.out.println("No results found.");
}
      


 // Get the current text in the Resultat text box
        //String currentText = Resultat.getText();

        // Append the new text to the current text
        String newText = "Hej din order är skickad "+namn+"\n"+produktSvar+"\n"+ info+"\n"+"Totalpris + 25% moms"+totalprisWithVAT + "\n"+"Du kan kontakta oss via hattmakrn@yahoo.se eller 0720567";

        // Set the updated text in the Resultat text box
        Resultat.setText(newText);
        
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        try  
{  
 String print = Resultat.getText();
//generate a PDF at the specified location  
    String filePath = System.getProperty("user.home") + "\\Downloads\\HattFöljdsedel.pdf";
PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(filePath));  
System.out.println("PDF created.");  
//opens the PDF  
doc.open();  
//adds paragraph to the PDF file  
doc.add(new Paragraph(print));   
//close the PDF file  
doc.close();  
//closes the writer  
writer.close();  
}   
catch (DocumentException e)  
{  
e.printStackTrace();  
}   
catch (FileNotFoundException e)  
{  
e.printStackTrace();  
}  
    }//GEN-LAST:event_SkickadActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SkickadUthämtad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkickadUthämtad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkickadUthämtad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkickadUthämtad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultat;
    private javax.swing.JButton Skickad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
