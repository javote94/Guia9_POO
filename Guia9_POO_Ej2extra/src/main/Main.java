
package main;

import entidad.Ahorcado;
import java.util.Scanner;
import servicio.AhorcadoService;


public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AhorcadoService cs = new AhorcadoService();
        Ahorcado juego1 = cs.crearJuego();
        
        cs.juego(juego1);
        System.out.println("Hola mundo");
    }
    
}
