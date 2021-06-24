/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3Parcial;

/**
 *
 * @author Miguel
 */
public class Cliente {
    protected int Id;
    protected String Nombre;
    protected int Edad;
    protected String Correo;
    protected String Telefono;
    
    public Cliente(){
    }

    public Cliente(int Id, String Nombre, int Edad, String Correo, String Telefono) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    int setId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
