/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoPacialDos;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Main {
    public static  void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       Cuadrilatero cuadrilatero =new Cuadrilatero();
       Trapecio trapecio =new Trapecio();
       Cuadrado cuadrado =new Cuadrado();
       Rectangulo rectangulo =new Rectangulo();
       
        double Bmayor, bmenor, h, areaTrapecio, areaCuadrado, areaRectangulo, lado, altura, base;
        double x1, y1, x2, y2, x3, y3, x4, y4;
        
        System.out.println("Medidad del TRAPECIO para obtener su area.");
        System.out.println("coordenadas ");
        System.out.print("x1: "); System.out.println("y1: ");
        x1=sc.nextDouble(); y1=sc.nextDouble();
        System.out.print("x2: "); System.out.println("y2: ");
         x2=sc.nextDouble(); y2=sc.nextDouble();
        System.out.print("x3: "); System.out.println("y3: ");
         x3=sc.nextDouble(); y3=sc.nextDouble();
        System.out.print("x4: "); System.out.println("y4: ");
         x4=sc.nextDouble(); y4=sc.nextDouble();
        System.out.print("Medidad de la base mayor: ");
        Bmayor=sc.nextDouble();
        System.out.print("Medida de la base menor: ");
        bmenor=sc.nextDouble();
        System.out.print("Medidad de la altura; ");
        h=sc.nextDouble();
        areaTrapecio=(Bmayor+bmenor)*h/2;
        System.out.println("El Area del Trapecio es: "+areaTrapecio+"cm^2");
        System.out.println("...........................................................................................");
        
        
        System.out.println("Medidas del CUADRADO para obtener se area.");
        System.out.println("coordenadas ");
        System.out.print("x1: "); System.out.println("y1: ");
        x1=sc.nextDouble(); y1=sc.nextDouble();
        System.out.print("x2: "); System.out.println("y2: ");
         x2=sc.nextDouble(); y2=sc.nextDouble();
        System.out.print("x3: "); System.out.println("y3: ");
         x3=sc.nextDouble(); y3=sc.nextDouble();
        System.out.print("x4: "); System.out.println("y4: ");
         x4=sc.nextDouble(); y4=sc.nextDouble();
        System.out.print("Ingresa el lado: ");
        lado=sc.nextDouble();
        areaCuadrado=lado*4;
        System.out.println("El Area de Cuadrado es: "+areaCuadrado+"cm^2");
        System.out.println(".............................................................................................");
        
        
        System.out.println("Medidas del RECTANGULO para obtener se area");
        System.out.println("coordenadas ");
        System.out.print("x1: "); System.out.println("y1: ");
        x1=sc.nextDouble(); y1=sc.nextDouble();
        System.out.print("x2: "); System.out.println("y2: ");
         x2=sc.nextDouble(); y2=sc.nextDouble();
        System.out.print("x3: "); System.out.println("y3: ");
         x3=sc.nextDouble(); y3=sc.nextDouble();
        System.out.print("x4: "); System.out.println("y4: ");
         x4=sc.nextDouble(); y4=sc.nextDouble();
        System.out.print("Medida de la base: ");
        base=sc.nextDouble();
        System.out.print("Medida de la altura: ");
        altura=sc.nextDouble();
        areaRectangulo=base*altura;
        System.out.println("El Area del Rectangulo es: "+areaRectangulo+"cm^2");
        System.out.println("....................................................................................................");
    }
}
