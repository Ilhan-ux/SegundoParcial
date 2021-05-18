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
public class Rectangulo extends Cuadrilatero{
    protected double base;
    protected double altura;
    protected double areaRectangulo;

    public Rectangulo(double base, double altura, double areaRectangulo, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.base = base;
        this.altura = altura;
        this.areaRectangulo = areaRectangulo;
    }
    public Rectangulo(){
    
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(double areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
        
    }

   


}    
    
    


