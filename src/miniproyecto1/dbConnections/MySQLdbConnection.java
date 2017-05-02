
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.dbConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLdbConnection {
    
    private Connection connection;
    protected String dbName;
    protected String userLogin;
    protected String userPassword;
    protected String serverUrl;
    
    public MySQLdbConnection(String serverUrl, String dbName, String login, String password)
    {
        this.serverUrl = "jdbc:mysql://localhost:3306/"+dbName;
        this.dbName = dbName;
        this.userLogin = login;
        this.userPassword = password;
    }
    
    public void open() throws Exception
    {
      
        try 
        { 
            Class.forName("com.mysql.jdbc.Driver"); 
            connection = DriverManager.getConnection(serverUrl, userLogin, userPassword); 
        } 
        catch (ClassNotFoundException e) 
        { 
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }
        
        System.out.println("MySQL JDBC Driver Registered!");
    }
 

    
    public void close() 
    {
        try 
        {
            if (isOpen())
            {
                connection.close();
            }    
        } 
        catch (SQLException ex) 
        {
            //Logger.getLogger(PostgresDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isOpen()
    {
        try 
        {
            return (connection != null && !connection.isClosed());
        } 
        catch (SQLException ex) 
        {
            //Logger.getLogger(PostgresDbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int executeUpdate(String sql) throws SQLException
    {
        if (connection != null)
        {
            Statement stat = connection.createStatement();
            int r = stat.executeUpdate(sql);
            return r;
        }
        return -1;
    }
    
    public ResultSet getResultSet(String sql) throws SQLException
    {
        if (connection != null){
            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            return rs;
        }
        return null;
    }
    
}

    




