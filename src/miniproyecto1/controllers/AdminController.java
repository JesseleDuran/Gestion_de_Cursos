/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.models.Admin;

/**
 *
 * @author Mota
 */
public class AdminController 
{

    public AdminController() {
    }   
    
    public int auth(int cedula, String pass, MySQLdbConnection db) throws SQLException, Exception
    {
        int count = 0;
        String sql = "SELECT COUNT(*) AS total FROM admin WHERE cedula='"
                +cedula+"' AND clave='"+pass+"';";
        db.open();
        ResultSet rs = db.getResultSet(sql);
        
        while(rs.next())
        {
            count=rs.getInt(1);
            System.out.println(count);
        }
        db.close();    
        return count;
    }
    
}
