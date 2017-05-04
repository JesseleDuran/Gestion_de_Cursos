/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1;

import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.views.LoginView;

/**
 *
 * @author Jessele Durán
 */
public class MiniProyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        MySQLdbConnection con = new MySQLdbConnection("cursos","jessele","6221");
     
        LoginView loginFrame = new LoginView(con);
        loginFrame.setVisible(true);        
    }
    
}
