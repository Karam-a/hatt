/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarenteam2;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/** hej **/
   
public class ValideringKlass {
    //Klass som kontrollerar inmatning av textfälten
    
    //Metod som gör detta.
    public static boolean finnsVarde(JTextField ettVarde)
    {
        boolean finns= true; 
        if(ettVarde.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fyll i nödvändiga fält som saknar värde");
            finns = false; 
        }
        return finns; 
    }  
    
    
    public static boolean KontrolleraLösenord(InfDB idb, String tabel, String anvandare, JPasswordField Lösenord) {
        boolean isRight = false;
        try {
            String dbLösenord = idb.fetchSingle("Select Lösenord from " + tabel + " where Användarnamn ='" + anvandare + "'");
            if (Lösenord.equals(dbLösenord)) {
                isRight = true;
            } else {
                JOptionPane.showMessageDialog(null, "Inloggning misslyckades!, Felaktig Lösenordet");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Fel inloggningsuppgifter, försök igen.");
                        System.out.println("Internt felmeddeland" + e.getMessage());
        }
        return isRight;
    }
    
        
    
            
 

    
    
    
    
    
}