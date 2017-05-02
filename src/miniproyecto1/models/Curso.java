/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.models;

/**
 *
 * @author Mota
 */
public class Curso 
{
    protected int id;
    protected String titulo;
    protected int tope;
    protected boolean estatus;

    public Curso(int id, String titulo, int tope, boolean estatus) {
        this.id = id;
        this.titulo = titulo;
        this.tope = tope;
        this.estatus = estatus;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
    
}
