/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivobinario;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author C-Lo 12
 */
public class BinarioDOS {

    
    public static void escribir(){
        try{
            FileOutputStream escritura = 
                    new FileOutputStream("C:\\Temp\\upana\\arcBinario.upana");
            DataOutputStream manejador = new DataOutputStream(escritura);
            manejador.writeInt(21);
            manejador.close();
            
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        escribir();
        
    }
    
}
