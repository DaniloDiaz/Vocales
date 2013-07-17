import java.io.*;
/**
 *
 * @author Administrador
 */
public class Programacion3 {
   
    public static void main(String[] args) {
 
       char car=' ';

       
       InputStreamReader entrada = new InputStreamReader(System.in);
       BufferedReader flujoEntrada = new BufferedReader(entrada);

         // Variable para tomar los datos leidos del flujo de entrada
       String datoEntrada;
         // Leer dato
       try
       {
         
         System.out.print("Teclee un caracter: ");
         //car = (char)System.in.read();
         
         datoEntrada = flujoEntrada.readLine();           
        // car = Character(datoEntrada);
         car = datoEntrada.charAt(0);
       } 
       catch (IOException error)
       {
          System.err.println("Error " + error.getMessage());
       }

    // Imprimir salida
       switch (car)
       {
          case 'a':
          case 'e': 
          case 'i':
          case 'o':
          case 'u':
                 System.out.println(car + " es un vocal minuscula");
                 break;
          case 'A':
          case 'E':
          case 'I':
          case 'O':
          case 'U':
                 System.out.println(car + " es vocal mayuscula");
                 break;
          default:
                 System.out.println(car + " no es vocal");                  
       }
    }
    
}
