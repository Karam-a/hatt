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
    //Klass som kontrollerar inmatning av textf�lten
    
    //Metod som g�r detta.
    public static boolean finnsVarde(JTextField ettVarde)
    {
        boolean finns= true; 
        if(ettVarde.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fyll i n�dv�ndiga f�lt som saknar v�rde");
            finns = false; 
        }
        return finns; 
    }  
    
    
    
    
        
    
            
 

    
    
    
    
    
}