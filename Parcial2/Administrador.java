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
public class Administrador extends Persona {

    protected String idAdmin;
    protected String codePrivado;

    public Administrador(String idAdmin, String codePrivado, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.idAdmin = idAdmin;
        this.codePrivado = codePrivado;
    }

    public void cuidar(){
        System.out.println("Requiere atencion para el negocio");
    }
    public void desiscion(){
        System.out.println(" toma desiciones para el sistema y negocio");
    }
}
