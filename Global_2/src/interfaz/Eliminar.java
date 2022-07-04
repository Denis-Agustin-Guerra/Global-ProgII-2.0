
package interfaz;

import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JFrame {


    public Eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lista_nombre = new javax.swing.JComboBox<>();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELIMINAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        lista_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(lista_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 219, -1));

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu-50.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void lista_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_nombreActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < Menu.cantores.size(); i++) {
            lista_nombre.addItem(Menu.cantores.get(i));
        }
    }//GEN-LAST:event_lista_nombreActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        lista_nombre.addItem(Menu.cantores.get(Menu.cantores.size() - 1).nombre);
        int n = JOptionPane.showConfirmDialog(
                null,
                "Seguro que quieres borrar el artista",
                "",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            String value = (String) lista_nombre.getSelectedItem();
            Menu host = new Menu();
            for (int j = 0; j < Menu.cantores.size(); j++) {                                //FUNCIONES PARA ELIMINAR DATOS
                if (value.equals(Menu.cantores.get(host.POSICION_LISTA(value)).nombre)) {
                    Menu.cantores.remove(host.POSICION_LISTA(value));
                    lista_nombre.removeItem(value);
                }
            }
            JOptionPane.showMessageDialog(null, "Artista borrado");
        } else {
            JOptionPane.showMessageDialog(null, "El Artista no fue borrado");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> lista_nombre;
    // End of variables declaration//GEN-END:variables
}
