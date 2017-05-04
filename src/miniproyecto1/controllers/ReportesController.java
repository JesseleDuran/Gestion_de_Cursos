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
import miniproyecto1.dbConnections.MySQLdbConnection;

/**
 *
 * @author Jessele Durán
 */
public class ReportesController 
{
    public ReportesController()
    {
        
    }
    public List<LinkedHashMap<String, Object>> mostrarCursosActivos(MySQLdbConnection db) throws SQLException, Exception
    {
        LinkedHashMap<String, Object> mMap = new LinkedHashMap();//hashmap
        List<LinkedHashMap<String, Object>> list = new ArrayList<>();//lista para los hashmap
        
        String sql = "SELECT * FROM curso WHERE estatus = 1;";
        
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
    
    public List<LinkedHashMap<String, Object>> inscritosPorCurso(MySQLdbConnection db) throws Exception
    {
        LinkedHashMap<String, Object> mMap = new LinkedHashMap();//hashmap
        List<LinkedHashMap<String, Object>> list = new ArrayList<>();//lista para los hashmap
        String sql =    "SELECT curso.titulo, COUNT(*) AS inscritos\n" +
                        "FROM curso\n" +
                        "INNER JOIN inscripcion\n" +
                        "ON curso.id = inscripcion.id_curso\n" +    
                        "GROUP BY curso.titulo;";
        
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
    
    public List<LinkedHashMap<String, Object>> instructoresPorCurso(MySQLdbConnection db) throws Exception
    {
        LinkedHashMap<String, Object> mMap = new LinkedHashMap();//hashmap
        List<LinkedHashMap<String, Object>> list = new ArrayList<>();//lista para los hashmap
        String sql =    "SELECT instructor.nombre, curso.titulo\n" +
                        "FROM instructor\n" +
                        "INNER JOIN curso_instructor\n" +
                        "ON instructor.cedula = curso_instructor.ci_instructor\n" +
                        "INNER JOIN curso\n" +
                        "ON curso.id = curso_instructor.id_curso";
        
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
   
}
