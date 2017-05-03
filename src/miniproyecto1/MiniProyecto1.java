/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import miniproyecto1.controllers.Controller;
import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.models.Aula;
import miniproyecto1.models.Cliente;
import miniproyecto1.models.Horario;
import miniproyecto1.models.Instructor;
import miniproyecto1.views.LoginView;

/**
 *
 * @author Mota
 */
public class MiniProyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        MySQLdbConnection con = new MySQLdbConnection("cursos","jessele","6221");
        
        /*Controller<Horario> horario = new Controller<Horario>(Horario.class);
        List<LinkedHashMap<String, Object>> list = instructor.getAll(con); //lista de resultados
        
        for (Iterator<LinkedHashMap<String, Object>> i = list.iterator(); i.hasNext();) 
        {
            LinkedHashMap<String, Object> item = i.next();
            String valor = (String) item.get("id");
            System.out.println("aula:"+valor);
            System.out.println(item);
            
            for (String key : item.keySet() ) {
                System.out.println( key );
            }
        }*/

        LoginView loginFrame = new LoginView(con);
        loginFrame.setVisible(true);
        
        
        
    }
    
}
