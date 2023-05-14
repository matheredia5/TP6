
package vistas;
import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Directorio;

public class ViewBuscarCliente extends javax.swing.JInternalFrame {

    private static Directorio miDirectorio=new Directorio();
    
    public static Directorio getDirectorio(){
        return miDirectorio;
    }
    
    public ViewBuscarCliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTel = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTCiudad = new javax.swing.JTextField();
        jLabelApe = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jTTel = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jTDni = new javax.swing.JTextField();
        jLabelBusqueda = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jButtonNuevo = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        jLabelTel.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelTel.setText("TELEFONO:");

        jLabelApellido.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelApellido.setText("DNI:");

        jLabelApe.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelApe.setText("APELLIDO");

        jLabelNom.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelNom.setText("NOMBRE:");

        jLabelCiudad.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabelCiudad.setText("CIUDAD");

        jTTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\TP6\\img\\imgbuscar.png")); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabelBusqueda.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBusqueda.setText("Busqueda de Clientes");

        jButtonNuevo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBusqueda)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE)))
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExit)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelBusqueda)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTel)
                            .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellido)))
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonExit))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // Buscar Cliente:
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

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed
    
    public void limpiar(){    
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTCiudad.setText("");
        jTTel.setText("");
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNuevo;
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
