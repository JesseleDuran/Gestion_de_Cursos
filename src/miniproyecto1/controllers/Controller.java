/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.controllers;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import miniproyecto1.dbConnections.MySQLdbConnection;

/**
 *
 * @author Mota
 */
public class Controller<T> 
{   
    private final Class<T> type;
    
    public Controller(Class<T> t)
    {
        //Esto Consigue la Clase del Tipo Generico!
        this.type = t;
        
    }
    
    protected String getGenericName()
    {
        return type.getSimpleName();
    }
    
    public void findOne()
    {
        //SELECT * FROM cliente WHERE nombre='Jessele'AND cedula='25696458';
    }
    
    /**

     * @param nombre_tabla
     * @param db
     * @return
     */
    public List<LinkedHashMap<String, Object>> getAll(MySQLdbConnection db) throws SQLException, Exception
    {
        LinkedHashMap<String, Object> mMap = new LinkedHashMap();//hashmap
        List<LinkedHashMap<String, Object>> list = new ArrayList<>();//lista para los hashmap
        
        String sql = "SELECT * FROM " + getGenericName().toLowerCase() + ";";
        
        db.open();
        ResultSet resultSet = db.getResultSet(sql);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        
        while (resultSet.next()) 
        {
            mMap = new LinkedHashMap();
            for (int i = 1; i <= columnsNumber; i++) 
            {
                
                String columnValue = resultSet.getString(i);
                mMap.put(rsmd.getColumnName(i),columnValue);
 
            }
            list.add(mMap);
        }
        
        db.close();
        
        return list;
    }
    
    public int getLast(MySQLdbConnection db) throws Exception
    {
        String lastValue = null;
        String sql = "SELECT * FROM " + getGenericName().toLowerCase() + ";";
        db.open();
        ResultSet rs = db.getResultSet(sql);

        while(rs.next())
        {  
            lastValue = rs.getString("id");
            System.out.println(lastValue);
        }
        
        return Integer.parseInt(lastValue);
    }
    
    public boolean insert(LinkedHashMap<String, Object> hash, MySQLdbConnection db) throws SQLException, Exception
    {
        int i = 0;        
        String sql = "INSERT INTO " + getGenericName().toLowerCase() + "(";

        for(Entry<String, Object> entry: hash.entrySet()) 
        {
            i++;
            if(i == hash.size())
            {
               sql += entry.getKey() + ")";
               // Si no es el último  
            }
            else
            {
                sql += entry.getKey() + ",";
            }
     
        }
        
        sql += " VALUES(";
        i = 0;
        for(Entry<String, Object> entry: hash.entrySet()) 
        {
            i++;
            if(hash.size() == i)
            {
                sql += "'"+entry.getValue() + "');";
               // Si no es el último  
            }
            else
            {
                sql += "'"+entry.getValue() + "',";   
            }   
        }
        
        System.out.println(sql);
        
        return ejecutarTransaccion(sql, db);
    }
    
    
    public boolean edit(LinkedHashMap<String, Object> hash, MySQLdbConnection db) throws Exception
    {
        String sql = "UPDATE " + getGenericName().toLowerCase() + "SET ";
        int i = 0;
        
        for(Entry<String, Object> entry: hash.entrySet()) 
        {
            i++;
            if(hash.size() == i)
            {
                sql += entry.getKey() + "=";
                sql += entry.getKey() + " WHERE";
               
            }
            else
            {
               sql += entry.getKey() + "=";// Si no es el último
               sql += entry.getValue() + ",";
                
            }
            
        }
        
        for(Entry<String, Object> entry: hash.entrySet()) 
        {
            if(entry.getKey().equals("id"))
            {
               sql += "id='" + entry.getValue()+ "';"; 
            }
            
            if(entry.getKey().equals("cedula"))
            {
               sql += "cedula='" + entry.getValue()+ "';"; 
            }
        }
        System.out.println(sql);
       return ejecutarTransaccion(sql, db);
    }
    
    public boolean delete(LinkedHashMap<String, Object> hash, MySQLdbConnection db) throws Exception
    {
        String sql = "DELETE FROM " + getGenericName().toLowerCase() + " WHERE ";
        
        for(Entry<String, Object> entry: hash.entrySet()) 
        {
            if(entry.getKey().equals("id"))
            {
               sql += "id='" + entry.getValue()+ "';"; 
            }
            
            if(entry.getKey().equals("cedula"))
            {
               sql += "cedula='" + entry.getValue() + "';"; 
            }
        }
        System.out.println(sql);
        
        return ejecutarTransaccion(sql, db);
    }
    
    public boolean ejecutarTransaccion(String accion, MySQLdbConnection db) throws Exception
    {
        try
        {
            db.open();
            db.executeUpdate(accion);
            db.close();  
        }
        catch(Exception e)
        {
            //System.out.println("No se pudo realizar transaccion "+ getGenericName().toLowerCase());
            e.printStackTrace();
            return false;
        }
        
        return true;
         
    }
    
    public int findHorario(String intervalo, MySQLdbConnection db) throws Exception
    {
        int iIni = intervalo.indexOf(" ");  
        int count = 0;
        String hora_ini = intervalo.substring(0 , iIni);
        String hora_final = intervalo.substring(iIni+3, intervalo.length());
        
        String sql = "SELECT id FROM horario WHERE (TIME(hr_inicio) = '" 
                + hora_ini + "' AND TIME(hr_final) = '" +hora_final+ "');"; 
                
        db.open();
        ResultSet rs = db.getResultSet(sql);
        
        while(rs.next())
        {
            count = rs.getInt(1);
            System.out.println(count);
        }
        db.close();    
        return count;
        
    }
  
}
