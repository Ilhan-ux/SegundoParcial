
package Parcial1;

/**
 *
 * @author Miguel
 */
import java.util.Scanner;
public class ArregloOrdenar {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int num[];
    int n;
    int aux; //auxiliar para método Bubuja
        System.out.print("Cuantos numeros vas a ordenar: ");
        n=sc.nextInt();// ingresa cantidad de N numeros
        num =new int[n]; // creacion de arreglo
        for (int i = 0; i<n; i++) {
             System.out.print((i+1)+". Ingrese un numero: ");
	num[i] = sc.nextInt(); //llenar el arreglo
    }
        //método burbuja
        for(int i=0; i<(n-1); i++){
            for(int j=0; j<(n-1); j++){
                    if(num[j] > num[j+1]){ // numActual>numSig    se hace un intercambio de valores 
                            aux=num[j]; 
                            num[j]=num[j+1];    
                            num[j+1]=aux; 
                    }
            }
        }
        // esta algoritmo nos ayuda a ordenar los numeros del arreglo 

        //impresion de datos
        System.out.print("Orden de menor a mayor: ");
      //  for(int i=(n-1); i>=0; i--){    // este for es para ordenar de mayor a menor
        for(int i=0; i<n; i++){ // este for es para ordenar de menor a mayor 
            System.out.print(num[i]+"; ");
        }
  } 
}
    
