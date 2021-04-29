/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;
import java.util.Scanner;
/**
 *
 * @author Miguel
 */
public class MainPromedio {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double suma=0;
        double prom=0;
         PromedioArreglo[] numeros;
        numeros =new PromedioArreglo[1];
        for (int i=0; i<numeros.length; i++){
            numeros[i] =new PromedioArreglo();
        }
        try{
         for (int i=0; i<numeros.length; i++){
            System.out.print("1er Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("2do Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("3ro Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("4to Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("5to Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("6to Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("7mo Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("8vo Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("9no Número: ");
            numeros[i].setNum(sc.nextInt());
            System.out.print("10mo Número: ");
            numeros[i].setNum(sc.nextInt());
           // suma += numeros[i].getNum();
           // prom=suma/10;
        }
         
        }catch(Exception e){
            System.out.println(e.getMessage()); 
        }
        for (int i=0; i<numeros.length; i++){
            System.out.println("1erNúmero: "+numeros[i].getNum());
            System.out.println("2doNúmero: "+numeros[i].getNum());
            System.out.println("3erNúmero: "+numeros[i].getNum());
            System.out.println("4toNúmero: "+numeros[i].getNum());
            System.out.println("5toNúmero: "+numeros[i].getNum());
            System.out.println("6toNúmero: "+numeros[i].getNum());
            System.out.println("7moNúmero: "+numeros[i].getNum());
            System.out.println("8voNúmero: "+numeros[i].getNum());
            System.out.println("9noNúmero: "+numeros[i].getNum());
            System.out.println("10moNúmero: "+numeros[i].getNum());
            System.out.println("____El Promedio es " +prom);
    }
      
        
}
}
