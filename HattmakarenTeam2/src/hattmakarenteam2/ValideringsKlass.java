/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarenteam2;

import javax.swing.JTextField;

/**
 *
 * @author alexm
 * 
 * 
 *    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla)
    {
        boolean resultat = true; 
        
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan ‰r tom");
            resultat = false;
        }
        
        return resultat;
        
    }
    * 
    * 
    * 
    public static boolean datumKontroll (String datum){
       SimpleDateFormat datumformat = new SimpleDateFormat ("yyyy-mm-dd");
       datumformat.setLenient(false);
       
        try{
            Date datumAttKolla = datumformat.parse(datum);
            return true;
        }
        
        catch(ParseException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Fel format pÂ datum. Skriv det ≈≈≈≈-MM-DD");
            return false;
  
  * 
 */
public class ValideringsKlass {
     public static boolean v‰rdeExisterar(JTextField varde) {
        //metoden kontrollerar JTextField inte ‰r tom
        if(varde.getText().isEmpty()) {
            return false;
        }  
    }
     
     public static 
}
