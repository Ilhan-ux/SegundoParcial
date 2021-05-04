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
public class Cliente extends Persona {

    protected String telefono;
    protected String correo;

    public Cliente(String telefono, String correo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public void participacion(){
        System.out.println("El cliente nos deja sus datos en el sistema para su seguimiento");
    }
    public void cumplimiento(){
        System.out.println("Sigue al pie de la letra sus responsabilidades como cliente");
    }
}
