/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperoverifica1;

/**
 *
 * @author ospite
 */
public class RecuperoVerifica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scan myScan = new Scan(); // Creazione dell'oggetto.
        CalcoloBinario Binario = new CalcoloBinario();
        // Inizio : Richiamo dei metodi tramite l'oggetto creato.
        myScan.Scan();
        Binario.CalcoloBinario(myScan.getInputUtente());
        // Fine : Richiamo dei metodi tramite l'oggetto creato.
    }
    
}
