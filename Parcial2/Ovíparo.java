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
public abstract class Ovíparo extends Animal{
    
    protected int tiempo;
    
    public abstract int setTiempo();
    
    @Override
    public void setColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Ovíparo(){
        super();
    }
}
