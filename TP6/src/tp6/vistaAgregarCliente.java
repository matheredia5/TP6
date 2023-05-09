
package tp6;
import javax.swing.JOptionPane;

public class vistaAgregarCliente extends javax.swing.JInternalFrame {

    
    public vistaAgregarCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jTDNI = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTCiudad = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Clientes");

        jLabelDNI.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelDNI.setForeground(new java.awt.Color(0, 0, 255));
        jLabelDNI.setText("DNI:");

        jLabelApellido.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(0, 0, 255));
        jLabelApellido.setText("APELLIDO:");

        jLabelNombre.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNombre.setText("NOMBRE:");

        jLabelCiudad.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelCiudad.setForeground(new java.awt.Color(0, 0, 255));
        jLabelCiudad.setText("CIUDAD:");

        jLabelTelefono.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTelefono.setText("TELEFONO:");

        jButtonGuardar.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonNuevo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(0, 0, 255));
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCiudad)
                            .addComponent(jLabelTelefono)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelDNI))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jButtonNuevo)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDNI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCiudad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonSalir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        try{
        int dni=Integer.parseInt(jTDNI.getText());
        String apellido=jTApellido.getText();
        String nombre=jTNombre.getText();
        String ciudad=jTCiudad.getText();
        String telefono=jTTelefono.getText();
        
        Cliente miCliente=new Cliente(dni,nombre,apellido,ciudad,null);
        boolean resu=Menu.miDirectorio.agregarCliente(telefono, miCliente);
        if(resu){
             JOptionPane.showMessageDialog(this,"Cliente Registrado");
        }else {
            JOptionPane.showMessageDialog(this,"Teléfono duplicado");
            
        }
        limpiar();
        
        }catch(Exception ca){
        
            JOptionPane.showMessageDialog(this,"Datos incorrectos");
        }
    }  
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed
    public void limpiar(){
    
        jTDNI.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTCiudad.setText("");
        jTTelefono.setText("");
    
    }
    private void jTDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
