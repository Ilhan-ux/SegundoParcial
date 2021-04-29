
package Parcial1;

/**
 *
 * @author Miguel
 */
import java.util.Scanner;
public class PiramideDos {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Cantidad de filas que desea: ");
        // cariavle con las clase Scanner y metodo nextInt() para lectura por teclado. 
        int filas =sc.nextInt();
        sc.close();
        
        System.out.println(); //para un salto de linea
        //ciclo for  
        for (int alto=1; alto<=filas; alto++){
            //ciclo_for para dar espacio en blanco
            for (int blanco=1; blanco<=filas-alto; blanco++){
                    System.out.print(" ");//secuencia de espacios sea consecutiva
            }
            //ciclo_for para asteriscos
            for (int ast=1; ast<=(alto*2)-1; ast++){
                    System.out.print("*");
            }
                System.out.println(" ");// para cada imprecion de asteriscos se da un salto de linea
        }
    
    }
  } 


