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
public class Cuadrado extends Cuadrilatero{
    protected double lado; 
    protected double areaCuadrado;

    public Cuadrado(double lado, double areaCuadrado, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.lado = lado;
        this.areaCuadrado = areaCuadrado;
    }
public Cuadrado(){
}
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(double areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

  
       
    
}
