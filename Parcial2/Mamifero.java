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
public abstract class Mamifero extends Animal{

    protected int tamaño;
    
    public abstract int setTamaño();
    
    //Sobro escribe metodo
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    public Mamifero(){
        super();
    }
    
    
}
