/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoPacialDos;

/**
 *
 * @author Miguel
 */
public class Trapecio extends Cuadrilatero{
    
    protected double Bmayor; //base mayor
    protected double bmenor; //base menor
    protected double h; // altura
    protected double areaTrapecio; 
 
    public Trapecio(){
        
    }
    public Trapecio(double Bmayor, double bmenor, double h, double areaTrapecio, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.Bmayor = Bmayor;
        this.bmenor = bmenor;
        this.h = h;
        this.areaTrapecio = areaTrapecio;
    }

 
  
    public double getBmayor() {
        return Bmayor;
    }

    public void setBmayor(double Bmayor) {
        this.Bmayor = Bmayor;
    }

    public double getBmenor() {
        return bmenor;
    }

    public void setBmenor(double bmenor) {
        this.bmenor = bmenor;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAreaTrapecio() {
        return areaTrapecio;
               
    }

    public void setAreaTrapecio(double areaTrapecio) {
        this.areaTrapecio = areaTrapecio;
    
    }
public void areaTrapecio(){
   
     areaTrapecio=(Bmayor+bmenor)*h/2;
}
     
}
