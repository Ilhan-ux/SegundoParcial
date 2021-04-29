/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Miguel
 */
public class MainCliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Cliente[] clientes;
        int tam = 0;
        int esp=0;
        //int esp = 0;
        System.out.println("Bienbenidos a la cartera de clientes de LoxxO");
        System.out.print("De que tamaño sera la cartera de clintes?: ");
        tam = sc.nextInt();
        clientes = new Cliente[tam];
        Cliente cliente;
        
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
          }

        int opc = 0;
        while (opc != 4) {
            System.out.println("Tamaño de la cartera " + tam);
            System.out.println("Espacio en la cartera " + esp );
            System.out.println("1) Agregar cliente.");
            System.out.println("2) Mostrar clientes.");
            System.out.println("3) Buscar Cliente.");
            System.out.println("0) cerrar sistema");
            System.out.print("Elige una opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                    case 1:
                        System.out.println("__AGREGAR CLIENTE___");
                        if(tam>=clientes.length){
                        try{
                            for (int i = 0; i < clientes.length; i++) {
                                System.out.print("Codigo de Cliente: ");
                                clientes[i].setCodeCliente(sc.nextInt());
                                System.out.print("Nombre: ");
                                clientes[i].setNombre(bf.readLine());
                                System.out.print("Apellido Paterno: ");
                                clientes[i].setApellidoPaterno(bf.readLine());
                                System.out.print("Apellido Materno: ");
                                clientes[i].setApellidoMaterno(bf.readLine());
                                System.out.print("Teléfono: ");
                                clientes[i].setTelefono(bf.readLine());
                                System.out.print("Dirección: ");
                                clientes[i].setDireccion(bf.readLine());
                                System.out.print("Edad: ");
                                clientes[i].setEdad(sc.nextInt());
                            }
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("_____________________________________");
                        }else{
                            System.out.println("ya no hay esapcio");
                        }
                    break;
                    case 2:
                        System.out.println("___LISTA DE LIENTES__");
                        for (int i = 0; i < clientes.length; i++) {
                            System.out.println("Código Cliente: "+clientes[i].getCodeCliente());
                            System.out.println("Nombre:      "+clientes[i].getNombre());
                            System.out.println("ApellidoP:    "+clientes[i].getApellidoPaterno());
                            System.out.println("ApellidoM:   "+clientes[i].getApellidoMaterno());
                            System.out.println("Teléfono:     "+clientes[i].getTelefono());
                            System.out.println("Direccion:    "+clientes[i].getDireccion());
                            System.out.println("Edad:          "+clientes[i].getEdad());
                        }
                        System.out.println("______________________________________");
                    break;
                    case 3:
                        System.out.println("___BUSCAR CLIENTE___");
                        int op=0;
                        while(op!=3){
                            System.out.println("1) Por Código.");
                            System.out.println("2) Por Nombre.");
                            System.out.println("3) Regrear menu principal");
                            System.out.println("Elige una opcion");
                            op =sc.nextInt();
                        }switch(op){
                            case 1:
                                for (int i = 0; i < clientes.length; i++) {
                                      if(clientes[i].equals(clientes[i].getCodeCliente())){
                                          System.out.println("Codigo de cliente");
                                          clientes[i].setCodeCliente(sc.nextInt());
                                      }else{
                                          System.out.println("Codigo no existe");
                                      }
                                          
                                }
                                break;
                            case 2:
                                for (int i = 0; i < clientes.length; i++) {
                                 if(clientes[i].equals(clientes[i].getCodeCliente())){
                                          System.out.println("Codigo de cliente");
                                          clientes[i].setCodeCliente(sc.nextInt());
                                      }else{
                                          System.out.println("Codigo no existe");
                                      }
                                          
                                }
                                break;
                            case 3:
                                System.out.println("MEnu principal");
                                break;
                        }
                    
                    break;
                    case 4:
                        System.out.println("Close. Gracias por su visita");
                        
                    break;
                    

            }
        }
    }

}
