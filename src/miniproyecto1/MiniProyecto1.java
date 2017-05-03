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
import javax.swing.JFrame;
import miniproyecto1.controllers.Controller;
import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.models.Aula;
import miniproyecto1.models.Cliente;
import miniproyecto1.models.Curso;
import miniproyecto1.models.Horario;
import miniproyecto1.models.Instructor;
import miniproyecto1.utils.PDFGenerator;
import static miniproyecto1.utils.PDFGenerator.createPDFFromHashMapList;
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
        
        /*Controller<Instructor> cliente = new Controller<Instructor>(Instructor.class);
        LinkedHashMap<String, Object> hor = new LinkedHashMap<String, Object>();
        LinkedHashMap<String, Object> or = new LinkedHashMap<String, Object>();
        hor.put("cedula", 16222333);
        or= cliente.findOne(hor, con);
        System.out.println(or);*/
        
        /*List<LinkedHashMap<String, Object>> list = instructor.getAll(con); //lista de resultados
        
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
