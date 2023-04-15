
package servicio;

import entidad.Ahorcado;
import java.util.Scanner;
import utilidad.Console;

public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        Console.println("\t.:CREANDO JUEGO DE AHORCADO:.");
        String palabra = Console.inputStr("Ingresar palabra secreta: ");
        int max = Console.inputInt("Ingresar cantidad de jugadas máxima: ");
        
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = Character.toString(palabra.charAt(i));
        }
        return new Ahorcado(vector, max);
    }
    
    private static void longitud(Ahorcado juego){
        System.out.println("Longitud la palabra: " + juego.getPalabraSecreta().length + " letras");
    }
    
    private static void buscar(Ahorcado juego, String letra){
        int contador = 0;
        for (String i : juego.getPalabraSecreta()) {
            if(i.equals(letra)){
                contador ++;
                juego.setnLetrasEncontradas(juego.getnLetrasEncontradas()+1);
            }
        }
        if(contador > 0){
            System.out.println("Acertaste! La letra ingresada pertenece a la palabra.");
        }else {
            System.out.println("Fallaste! La letra ingresada no pertenece a la palabra.");
        }
    }
    
    private static void encontradas(Ahorcado juego, String letra){
        
    }
    
   
    
    
    public void juego(Ahorcado juego){
        System.out.println("\t.:INICIO DE JUEGO:.");
        do {
            System.out.println("-----------------");
            longitud(juego);
            String letra = Character.toString(Console.inputChr("Ingrese una letra: ")).toLowerCase();
            
            
        } while (true);
        
        
        
    }
    
}
