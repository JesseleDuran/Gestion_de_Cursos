/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.models;

import java.sql.Time;

/**
 *
 * @author Mota
 */
public class Horario 
{
    protected int id;
    protected Time hr_inicio;
    protected Time hr_final;

    public Horario(int id, Time hr_inicio, Time hr_final) {
        this.id = id;
        this.hr_inicio = hr_inicio;
        this.hr_final = hr_final;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getHr_inicio() {
        return hr_inicio;
    }

    public void setHr_inicio(Time hr_inicio) {
        this.hr_inicio = hr_inicio;
    }

    public Time getHr_final() {
        return hr_final;
    }

    public void setHr_final(Time hr_final) {
        this.hr_final = hr_final;
    }
    
    
    
}
