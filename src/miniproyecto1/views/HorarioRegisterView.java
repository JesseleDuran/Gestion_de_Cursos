/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto1.views;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner;
import miniproyecto1.controllers.Controller;
import miniproyecto1.dbConnections.MySQLdbConnection;
import miniproyecto1.models.Horario;

/**
 *
 * @author Jessele Durán
 */
public class HorarioRegisterView extends javax.swing.JFrame {

    /**
     * Creates new form HorarioRegisterView
     */
    public HorarioRegisterView(MySQLdbConnection db) {
        super("Registrar Horario");
        this.db = db;
        initComponents();
        initButtons();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.MINUTE);
        inicioJSpinner = new javax.swing.JSpinner(sm);
        Date date2 = new Date();
        SpinnerDateModel sm2 =
        new SpinnerDateModel(date2, null, null, Calendar.MINUTE);
        finalJSpinner = new javax.swing.JSpinner(sm2);
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Hora Final");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Hora de Inicio");

        aceptarButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        aceptarButton.setText("Aceptar");
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

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Registrar Horario");

        JSpinner.DateEditor de = new JSpinner.DateEditor(inicioJSpinner, "HH:mm");
        de.getTextField().setEditable( false );
        inicioJSpinner.setEditor(de);
        inicioJSpinner.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(finalJSpinner, "HH:mm");
        de2.getTextField().setEditable( false );
        finalJSpinner.setEditor(de2);
        finalJSpinner.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Formato 24hrs (H:mm)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inicioJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inicioJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);

        JSpinner spinner = new JSpinner(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm");
        de.getTextField().setEditable( false );
        spinner.setEditor(de);
        
        Date date2 = new Date();
        SpinnerDateModel sm2 = new SpinnerDateModel(date2, null, null, Calendar.MINUTE);

        JSpinner spinner2 = new JSpinner(sm2);
        JSpinner.DateEditor de2 = new JSpinner.DateEditor(spinner2, "HH:mm");
        de2.getTextField().setEditable( false );
        spinner2.setEditor(de2);
        
        String hr_inicio = de.getFormat().format(inicioJSpinner.getValue()).toString();
        String hr_final = de.getFormat().format(finalJSpinner.getValue()).toString();
        int iIni = hr_inicio.indexOf(":"); 
        int iend = hr_final.indexOf(":");
        String hora_ini = null;
        String hora_final = null;
        
        if (iIni != -1)
        {
            hora_ini = hr_inicio.substring(0 , iIni); 
        }
        if (iend != -1)
        {
            hora_final = hr_final.substring(0 , iend); 
        }
        
        if(Integer.parseInt(hora_ini) > Integer.parseInt(hora_final))
        {
            JOptionPane.showMessageDialog(null, "El Horario Inicial no puede ser mayor que el Horario Final", "Registro con éxito", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        
        if(Integer.parseInt(hora_ini) == Integer.parseInt(hora_final))
        {
            JOptionPane.showMessageDialog(null, "El Horario Inicial no puede ser igual al Horario Final", "Registro con éxito", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
 
        try
        {
            LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
            
            map.put("hr_inicio", de.getFormat().format(inicioJSpinner.getValue()).toString());
            map.put("hr_final", de2.getFormat().format(finalJSpinner.getValue()).toString());
            
           
            Controller<Horario> controller = new Controller<Horario>(Horario.class);

            if(controller.insert(map, db) == true)
            {
                dispose();
                JOptionPane.showMessageDialog(null, "El Horario se ha registrado correctamente", "Registro con éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error al registrar Horario","ERROR",JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton cancelarButton;
    private javax.swing.JSpinner finalJSpinner;
    private javax.swing.JSpinner inicioJSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    private MySQLdbConnection db;
    
    private void initButtons()
    {
        inicioJSpinner.setToolTipText("Ingrese la hora de inicio del bloque de horario");
        finalJSpinner.setToolTipText("Ingrese la hora final del bloque de horario");
    }
    
  

}
