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
public class Instructor
{
    protected String nvl_formacion;
    protected String nombre;
    protected int cedula;
    protected String apellido;
    protected String correo;
    protected String telefono;

    public String getNvl_formacion() {
        return nvl_formacion;
    }

    public void setNvl_formacion(String nvl_formacion) {
        this.nvl_formacion = nvl_formacion;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
