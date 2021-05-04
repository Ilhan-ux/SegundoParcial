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
public class Usuario extends Persona {

    protected String idUsuario;
    protected String sucursal;

    public Usuario(String idUsuario, String sucursal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.idUsuario = idUsuario;
        this.sucursal = sucursal;
    }

public void altaUsuario(){
    System.out.println("Se da de alta un nuevo perfil para al sistema");
}
public void realizaMovimientos(){
    System.out.println(" liberta de hacer movimientos en el sistema");
}
}
