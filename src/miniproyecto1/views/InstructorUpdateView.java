/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.views;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import miniproyecto1.controllers.Controller;
import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.models.Instructor;

/**
 *
 * @author Mota
 */
public class InstructorUpdateView extends javax.swing.JFrame {

    /**
     * Creates new form InstructorUpdateView
     */
    public InstructorUpdateView(MySQLdbConnection db, LinkedHashMap<String, Object> instructor) {
        super("Actualizar Cliente");
        this.db = db;
        this.instructor = instructor;
        initComponents();
        restringirTeclas();
        initJtext();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        educacionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        ciField = new javax.swing.JTextField();
        apellidoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Registrar Instructor");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Nivel de Formación");

        emailField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electrónico");

        nameField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        educacionComboBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        educacionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educación Básica", "Técnico Medio", "Educación Profesional", "Postgrado", "Máster", "Doctorado" }));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono");

        telefonoField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFieldActionPerformed(evt);
            }
        });

        ciField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ciField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciFieldActionPerformed(evt);
            }
        });

        apellidoField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Cédula de Identidad");

        aceptarButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        aceptarButton.setText("Actualizar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ciField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(educacionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(jLabel3)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ciField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(educacionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(86, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

    private void ciFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciFieldActionPerformed

    private void apellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoFieldActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed

        try
        {
            if(validaciones() != true)
            {
                LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();

                map.put("nvl_formacion", educacionComboBox.getSelectedItem().toString().toUpperCase());
                map.put("nombre", nameField.getText().toUpperCase());
                map.put("cedula", Integer.parseInt(ciField.getText()));
                map.put("apellido", apellidoField.getText().toUpperCase());
                map.put("correo", emailField.getText().toUpperCase());
                map.put("telefono", telefonoField.getText());

                Controller<Instructor> controller = new Controller<Instructor>(Instructor.class);

                if(controller.editCI(map, db, 0, (long) instructor.get("3")) == true)
                {
                    dispose();
                    JOptionPane.showMessageDialog(null, "El Instructor se ha actualizado correctamente", "Registro con éxito", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error al actualizar Instructor","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e)
        {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);

            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        dispose() ;
    }//GEN-LAST:event_cancelarButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField ciField;
    private javax.swing.JComboBox<String> educacionComboBox;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
    private MySQLdbConnection db;
    DefaultListModel cursoList = new DefaultListModel();
    private KeyListener eventosDeTecla;
    private KeyListener eventosDeTeclaOnlyLetters;
    LinkedHashMap<String, Object> instructor;
    
    private void initJtext()
    {

        nameField.setText((String) instructor.get("2"));
        ciField.setText(Long.toString((long) instructor.get("3")));
        apellidoField.setText((String) instructor.get("4"));
        emailField.setText((String) instructor.get("5"));
        telefonoField.setText((String) instructor.get("6"));
    
    }
       
    private void initButtons()
    {
        emailField.setToolTipText("Debe ingresar su correo con '@' y '.domain'");
        //jTable1.setToolTipText("Puede escoger varios en caso de que aplique");
    }
    
    private void restringirTeclas()
    {
        eventosDeTecla = new KeyListener() 
        {
            @Override
            public void keyTyped(KeyEvent ke) 
            {
               char caracter = ke.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
                   ke.consume();  
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        };
        
        eventosDeTeclaOnlyLetters = new KeyListener() 
        {
            @Override
            public void keyTyped(KeyEvent ke) 
            {
               char caracter = ke.getKeyChar();
                if((Character.isLetter(caracter)) == false )
                {
                   ke.consume();   
                }
                   
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        };
        
        nameField.addKeyListener(eventosDeTeclaOnlyLetters);
        apellidoField.addKeyListener(eventosDeTeclaOnlyLetters);
        
        ciField.addKeyListener(eventosDeTecla);
        telefonoField.addKeyListener(eventosDeTecla);
    }
    
    public boolean isValidEmailAddress(String email) 
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\."
                + "[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    
    public boolean validaciones()
    {
        if(nameField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error:Debe ingresar un nombre","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        if(ciField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error: Debe ingresar una cédula","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        } 
        
        if(telefonoField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error:Debe ingresar un apellido","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        if(telefonoField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error: Debe ingresar un teléfono","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        if(isValidEmailAddress(emailField.getText()) == false)
        {
                JOptionPane.showMessageDialog(null,"Error:El correo ingresado no es válido","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        return false;
    }
    
    /*{
        String sql = "SELECT * FROM curso";
        db.open();
        ResultSet resultSet = db.getResultSet(sql);
        jTable1.setModel(buildTableModel(resultSet));
        db.close();
    }
 
    
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException 
    {
        ResultSetMetaData metaData = rs.getMetaData();
        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) 
        {
            columnNames.add(metaData.getColumnName(column));
        }
        System.out.println(columnNames);

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) 
        {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) 
            {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        System.out.println(data);

 
        return new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
    }
    
    public ArrayList<String> myMethod() 
    {
        ArrayList<String> result = new ArrayList<String>();
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getRowCount() > 0) {
            if (jTable1.getSelectedRowCount() > 0) {
                int selectedRow[] = jTable1.getSelectedRows();
                for (int i : selectedRow) 
                {
                    String id = Integer.toString((int) jTable1.getValueAt(i, 0));
                    result.add(id);
                    
                }
            }
        }
        System.out.println(result);
        
        return result;  
    }*/
    

}
