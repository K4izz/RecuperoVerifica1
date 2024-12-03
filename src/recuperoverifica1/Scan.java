/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperoverifica1;

import java.util.Scanner; // impor della classe per l'input dell'utente.

/**
 *
 * 
 */
public class Scan {
    
    private int InputUtente; // dichiarazione degli attributi della classe
    
    // Inizio : Creazione del metodo per la richiesta di un decimale da parte dell'utente e la sua assegnazione.  
    public void Scan(){
        Scanner myObj = new Scanner(System.in); 
        System.out.print("inserire un valore decimale : ");
        InputUtente = myObj.nextInt();
        
    }
    // Fine : Creazione del metodo per la richiesta di un decimale da parte dell'utente e la sua assegnazione.  

    public int getInputUtente() {
        return InputUtente;
    }

}
