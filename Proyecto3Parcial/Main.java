/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3Parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Cliente> cliente =new ArrayList<>(); 
        ArrayList<Cliente> arrayCliente=new ArrayList<>();
        
//        String[] datos = new String[5];
        int Id = 0, Edad = 0;
        String Nombre = "", Correo = "", Telefono = "";
        boolean salir =false;
        int opcion;
                
        System.out.println("BIENVENIDO A LA CARTERA DE CLIENTES");
        System.out.println("Menu");
        
         while(!salir){
            
           System.out.println("1. Agragar Datos Del Cliente");
           System.out.println("2. Eliminar Datos Del Cliente");
           System.out.println("3. Buscar Cleinte Por Nombre");
           System.out.println("4. Mostras Datos De Los Clientes");
           System.out.println("0. Salir");
            
           System.out.print("Escribe una de las opciones: ");
           opcion = sc.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Agergar Cliente Nuevo......");
//                   cliente.setId(Id);
//                   cliente.setNombre(Nombre);
//                   cliente.setEdad(Edad);
//                   cliente.setCorreo(Correo);
//                   cliente.setTelefono(Telefono);
//                   arrayCliente.add(cliente);
                   System.out.print("Id: ");
                   Id=sc.nextInt();
                   System.out.print("Nombre: ");
                   Nombre=bf.readLine();
                   System.out.print("Edad: ");
                   Edad=sc.nextInt();
                   System.out.print("Corre: ");
                   Correo=bf.readLine();
                   System.out.print("Telefono: ");
                   Telefono=bf.readLine();
                   break;
               case 2:
                   System.out.println("Elimina Datos De Clientes....");
                   System.out.println("Id del cliente: ");
                   Id=sc.nextInt();
                   for(int i = 0; i<arrayCliente.size(); i++){
                       if (arrayCliente.get(i).getId() == Id) {
                             System.out.println("ELIMINADO.");
                             arrayCliente.remove(i);
                         }
                     }
                   break;
                case 3:
                   System.out.println("Buscar Cliente Por Nombre....");
                   System.out.print("Nombre Cliente: ");
                    Nombre = bf.readLine();
                    System.out.println(cliente.indexOf(Nombre));
                   break;
                case 4:
                   System.out.println("Mostrar Cartera De Clientes....");
                        System.out.println("ID: "+Id);
                        System.out.println("Nombre: "+Nombre);
                        System.out.println("Edad: "+Edad);
                        System.out.println("Correo: "+Correo);
                        System.out.println("Telefono: "+Telefono);
                    for(Cliente c:cliente){
                        System.out.println("ID: "+c.getId());
                        System.out.println("Nombre: "+c.getNombre());
                        System.out.println("Edad: "+c.getEdad());
                        System.out.println("Correo: "+c.getCorreo());
                        System.out.println("Telefono: "+c.getTelefono());
                         System.out.println("ID: "+Id);
                        System.out.println("Nombre: "+Nombre);
                        System.out.println("Edad: "+Edad);
                        System.out.println("Correo: "+Correo);
                        System.out.println("Telefono: "+Telefono);
                    }
                   break;
                case 0:
                    System.out.println("GRACIAS POR TU VISITA");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
            
       }
    }
}
