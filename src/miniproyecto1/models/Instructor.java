/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mota
 */
public class Instructor extends Model
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

    public Instructor(ResultSet rs) {
        super(rs);
    }

    @Override
    public void parsear(ResultSet rs) {
        try 
        {
            correo = rs.getString("correo");
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Instructor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    

    /*@Override
    public static String getTableName() {
        return "instructor";
    }*/
    
}
