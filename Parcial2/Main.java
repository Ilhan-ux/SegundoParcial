/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) {
//        Animal animal =new Animal();
//        System.out.println(animal.color);

            Mamifero mamifero =new Mamifero() {
                @Override
                public int setTamaño() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            mamifero.setColor("Cafe");
            System.out.println(mamifero.color);
    }
}
