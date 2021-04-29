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
public class Posicion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = -1;
        int num[] = new int[10];
       

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " Dame un Numero: ");
            num[i] = sc.nextInt();
        }

        System.out.println("Ingrese un Número: ");
        int n = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("No se encontro");
        } else {
        }
        System.err.println("la posicion de: " + n + " es " + pos);

    }

}
