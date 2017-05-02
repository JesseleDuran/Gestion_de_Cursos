/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.models;

import java.sql.ResultSet;

/**
 *
 * @author Mota
 */
public abstract class Model 
{   
    public Model(ResultSet rs)
    {
        parsear(rs);
    }
    
    public abstract void parsear(ResultSet rs);
    
    
    /*public static String getTableName()
    {
        return "";
    }*/
    
}
