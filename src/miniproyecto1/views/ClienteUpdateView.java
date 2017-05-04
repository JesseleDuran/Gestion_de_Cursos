/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.views;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import miniproyecto1.controllers.Controller;
import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.models.Cliente;

/**
 *
 * @author Mota
 */
public class ClienteUpdateView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteUpdateView
     */
    public ClienteUpdateView(MySQLdbConnection db, LinkedHashMap<String, Object> cliente) {
        super("Actualizar Cliente");
        this.db = db;
        this.cliente = cliente;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ciField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        telefonoField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apellidoField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono");

        ciField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ciField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciFieldActionPerformed(evt);
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

        telefonoField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFieldActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Actualizar Participante");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        apellidoField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ciField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciFieldActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed

        try
        {
            if(validaciones() != true)
            {
                LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();

                map.put("nombre", nameField.getText().toUpperCase());
                map.put("cedula", Integer.parseInt(ciField.getText()));
                map.put("apellido", apellidoField.getText().toUpperCase());
                map.put("telefono", telefonoField.getText());

                Controller<Cliente> controller = new Controller<Cliente>(Cliente.class);
                

                if(controller.editCI(map, db, 0, (long) cliente.get("2")) == true)
                {
                    dispose();
                    JOptionPane.showMessageDialog(null, "El Participante se ha actualizado correctamente", "Registro con éxito", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error al actualizar Participante","ERROR",JOptionPane.ERROR_MESSAGE);
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

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void apellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField ciField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
    private KeyListener eventosDeTecla;
    private MySQLdbConnection db;
    private LinkedHashMap<String, Object> cliente;
    private KeyListener eventosDeTeclaOnlyLetters;
    
    private void initJtext()
    {

        nameField.setText((String) cliente.get("1"));
        ciField.setText(Long.toString((long) cliente.get("2")));
        apellidoField.setText((String) cliente.get("3"));
        telefonoField.setText((String) cliente.get("4"));
    
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
        
        apellidoField.addKeyListener(eventosDeTeclaOnlyLetters);       
        nameField.addKeyListener(eventosDeTeclaOnlyLetters);
    
        ciField.addKeyListener(eventosDeTecla);//poner el resto
        telefonoField.addKeyListener(eventosDeTecla);   
    }
    
    public boolean validaciones()
    {
        if(nameField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error:Debe ingresar un nombre","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        if(apellidoField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error: Debe ingresar un apellido","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        if(ciField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error: Debe ingresar una cedula","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
            
       if(telefonoField.getText().isEmpty() == true )
        {
                JOptionPane.showMessageDialog(null,"Error: Debe ingresar un telefono","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }          
        
        return false;
    }
}
