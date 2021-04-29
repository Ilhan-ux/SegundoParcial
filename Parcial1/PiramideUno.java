
package Parcial1;

/**
 *
 * @author Miguel
 */
import java.util.Scanner;
public class PiramideUno {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Cuantos asteriscos quieres: ");
        n=sc.nextInt();
        for (int l=0; l<n; l++){
            for (int a=0; a<=l; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

