package interfaz;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
        lista_nombre = new javax.swing.JComboBox();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Cargar_info = new javax.swing.JButton();
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

        btn_salir.setText("VOLVER");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        Cargar_info.setText("Buscar");
        Cargar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_infoActionPerformed(evt);
            }
        });
        getContentPane().add(Cargar_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu-50.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void lista_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_nombreActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if (lista_nombre.getSelectedIndex()> -1) {
            Menu.cantores.remove(lista_nombre.getSelectedIndex());
            lista_nombre.removeItemAt(lista_nombre.getSelectedIndex());
        }
        try {
            //Persistir el nuevo array
            ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream("src/persistencia/cantoresGuardados.txt"));
            escribirFichero.writeObject(Menu.cantores);
            escribirFichero.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void Cargar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_infoActionPerformed

        for (int i = 0; i < Menu.cantores.size(); i++) {
            lista_nombre.addItem(Menu.cantores.get(i));
        }
    }//GEN-LAST:event_Cargar_infoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar_info;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JComboBox lista_nombre;
    // End of variables declaration//GEN-END:variables
}
