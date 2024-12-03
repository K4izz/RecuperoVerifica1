/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperoverifica1;

/**
 *
 * Wang Jimmy 4infD
 * Dopo aver ottenuto da tastiera un numero decimale, calcola la rappresentazione dello stesso numero nel sistema binario.
 */
public class CalcoloBinario {
    
    private int Calcolo ;
    
     // Inizio : Creazione del metodo per il Trasformazione del numero decimale inserito dall'utente in un num binario con il passaggio di un valore.  
    public void CalcoloBinario(int InputUtente){
        Calcolo = InputUtente;
        System.out.print("\nleggere da destra a sinistra : ");
        do {
            InputUtente = Calcolo;
            if(InputUtente%2==1){
                System.out.print("1");
        } else {
                System.out.print("0");
            }
        Calcolo = Calcolo / 2;
        } while (Calcolo!=0);
    }
    // Fine : Creazione del metodo per il Trasformazione del numero decimale inserito dall'utente in un num binario con il passaggio di un valore.  

}
