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
public class Aula 
{
    protected boolean estatus;
    protected int id;

    public Aula(boolean estatus, int id) {
        this.estatus = estatus;
        this.id = id;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
