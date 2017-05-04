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
public class Admin 
{
    protected String nombre;
    protected String clave;
    protected int cedula;

    public Admin(String nombre, String clave, int cedula) {
        this.nombre = nombre;
        this.clave = clave;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
   
}
