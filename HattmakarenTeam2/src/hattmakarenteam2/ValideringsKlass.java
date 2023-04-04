/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarenteam2;

/**
 *
 * @author alexm
 */
public class ValideringsKlass {
   //Använde den här i mitt MIB
    public static void isNullValue(String result, String typeObject) throws IDException{
        if(result != null && result != ""){
            throw new IDException("This " +typeObject + "Id already exists ");
        }
    }
}
