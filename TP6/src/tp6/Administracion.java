
package tp6;


public class Administracion extends javax.swing.JFrame {

    public static Directorio miDirectorio=new Directorio();
    
    public Administracion() {
        super ("Clientes");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jAgregar = new javax.swing.JMenuItem();
        jBuscar = new javax.swing.JMenuItem();
        jBorrar = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorio.setBackground(new java.awt.Color(0, 0, 153));
        jEscritorio.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu.setBackground(new java.awt.Color(255, 255, 255));
        jMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu.setForeground(new java.awt.Color(0, 0, 0));
        jMenu.setText("Menu");

        jAgregar.setBackground(new java.awt.Color(0, 0, 255));
        jAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jAgregar.setText("Agregar Cliente");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });
        jMenu.add(jAgregar);

        jBuscar.setBackground(new java.awt.Color(0, 0, 255));
        jBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBuscar.setText("Buscar Cliente");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jMenu.add(jBuscar);

        jBorrar.setBackground(new java.awt.Color(0, 0, 255));
        jBorrar.setForeground(new java.awt.Color(0, 0, 0));
        jBorrar.setText("Borrar Cliente");
        jBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarActionPerformed(evt);
            }
        });
        jMenu.add(jBorrar);

        jMenuBar1.add(jMenu);

        jSalir.setBackground(new java.awt.Color(255, 255, 255));
        jSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSalir.setForeground(new java.awt.Color(0, 0, 0));
        jSalir.setText("Salir");

        jMenuItemSalir.setBackground(new java.awt.Color(0, 0, 255));
        jMenuItemSalir.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jSalir.add(jMenuItemSalir);

        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        vistaAgregarCliente vac = new vistaAgregarCliente();
        vac.setVisible(true);
        jEscritorio.add(vac);
        jEscritorio.moveToFront(vac);
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarActionPerformed
        // TODO add your handling code here:
         jEscritorio.removeAll();
        jEscritorio.repaint();
        vistaBorrarClientes vborrar = new vistaBorrarClientes();
        vborrar.setVisible(true);
        jEscritorio.add(vborrar);
        jEscritorio.moveToFront(vborrar);
    }//GEN-LAST:event_jBorrarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
        jEscritorio.removeAll();
        jEscritorio.repaint();
        vistaBusquedaClientes vbc = new vistaBusquedaClientes();
        vbc.setVisible(true);
        jEscritorio.add(vbc);
        jEscritorio.moveToFront(vbc);
    }//GEN-LAST:event_jBuscarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAgregar;
    private javax.swing.JMenuItem jBorrar;
    private javax.swing.JMenuItem jBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables
}
