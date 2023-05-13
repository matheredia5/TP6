
package vistas;

import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Directorio;


public class ViewBorrarCliente extends javax.swing.JInternalFrame {

    private static Directorio miDirectorio=new Directorio();
    
    public ViewBorrarCliente() {
        initComponents();
    }
    
    public static Directorio getDirectorio(){
        return miDirectorio;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNom = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jTTel = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jTDni = new javax.swing.JTextField();
        jBBorrar = new javax.swing.JButton();
        jLabelBusqueda = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTCiudad = new javax.swing.JTextField();
        jLabelApe = new javax.swing.JLabel();

        jLabelNom.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNom.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelNom.setText("NOMBRE:");

        jLabelCiudad.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCiudad.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelCiudad.setText("CIUDAD");

        jButtonSalir.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\TP6\\img\\pngwing2.com.png")); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jLabelBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBusqueda.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBusqueda.setText("Borrar Clientes");

        jLabelTel.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTel.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelTel.setText("TELEFONO");

        jLabelApellido.setBackground(new java.awt.Color(0, 0, 0));
        jLabelApellido.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelApellido.setText("DNI:");

        jLabelApe.setBackground(new java.awt.Color(0, 0, 0));
        jLabelApe.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelApe.setText("APELLIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelApe)
                    .addComponent(jLabelNom)
                    .addComponent(jLabelCiudad)
                    .addComponent(jLabelApellido)
                    .addComponent(jLabelTel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTApellido)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTTel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jTDni))
                                .addGap(40, 40, 40)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabelBusqueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBorrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellido))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApe))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNom))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCiudad))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalir)
                            .addComponent(jBBorrar)))
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        String tel = jTTel.getText();
        Cliente cli = Menu.getDirectorio().buscarCliente(tel);
        if (cli!=null){
            jTDni.setText(cli.getDni()+"");
            jTNombre.setText(cli.getNombre());
            jTApellido.setText(cli.getApellido());
            jTCiudad.setText(cli.getCiudad());
        }else
            JOptionPane.showMessageDialog(null,"No existe el cliente! ");
            limpiar();
            jTTel.requestFocus();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
        String tel = jTTel.getText();
        Menu.getDirectorio().borrarCliente(tel);
        
        limpiar();
    }//GEN-LAST:event_jBBorrarActionPerformed

    public void limpiar(){    
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTCiudad.setText("");
        jTTel.setText("");
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTel;
    // End of variables declaration//GEN-END:variables
}
