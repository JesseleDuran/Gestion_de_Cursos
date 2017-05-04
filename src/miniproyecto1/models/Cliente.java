/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.models;

/**
 *
 * @author Jessele Durán
 */
public class Cliente 
{
    protected String nombre;
    protected String apellido;
    protected int cedula;
    protected String telefono;
    
    public Cliente(String nombre, String apellido, int cedula, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }
   
    public Cliente()
    {
        this.nombre = "";
        this.apellido = "";
        this.cedula = 0;
        this.telefono = "";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
