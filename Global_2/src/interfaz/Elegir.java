package interfaz;
import java.util.ArrayList;
import mvc.Artista;
import mvc.Instrumento;
import mvc.SerCantor;
import interfaz.Ingresar;
import static interfaz.Ingresar.toCalendar;
import java.util.Calendar;
public class Elegir extends javax.swing.JFrame {
    private Ingresar e;
    public Elegir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lista_nombre = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        out_tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        out_nombre_intrum = new javax.swing.JTextField();
        out_tipo_intrum = new javax.swing.JTextField();
        out_fecha_nac = new javax.swing.JTextField();
        out_edad = new javax.swing.JTextField();
        out_alegre = new javax.swing.JTextField();
        out_momento = new javax.swing.JTextField();
        tbn_cantar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELEGIR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        lista_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(lista_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));
        getContentPane().add(out_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 151, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INSTRUMENTO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TIPO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 38, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FECHA NACIMIENTO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 121, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EDAD:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ES ALEGRE:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 91, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MOMENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 91, -1));
        getContentPane().add(out_nombre_intrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 149, -1));
        getContentPane().add(out_tipo_intrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 250, 160, -1));

        out_fecha_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_fecha_nacActionPerformed(evt);
            }
        });
        getContentPane().add(out_fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 86, -1));

        out_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_edadActionPerformed(evt);
            }
        });
        getContentPane().add(out_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 86, -1));

        out_alegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_alegreActionPerformed(evt);
            }
        });
        getContentPane().add(out_alegre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 70, -1));

        out_momento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_momentoActionPerformed(evt);
            }
        });
        getContentPane().add(out_momento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 93, -1));

        tbn_cantar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbn_cantar.setText("CANTAR");
        getContentPane().add(tbn_cantar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIPO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 610, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void out_fecha_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_fecha_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_out_fecha_nacActionPerformed

    private void out_alegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_alegreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_out_alegreActionPerformed

    private void out_momentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_momentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_out_momentoActionPerformed

    private void out_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_out_edadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lista_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_nombreActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < Menu.cantores.size(); i++) {
            lista_nombre.addItem(Menu.cantores.get(i));
        }
        Menu host = new Menu();
        Artista ar = (Artista)lista_nombre.getSelectedItem();
        out_tipo.setText(ar.tipo);
        out_nombre_intrum.setText(ar.usa.get(0).nombre);
        out_tipo_intrum.setText(ar.usa.get(0).tipo);
        Calendar fechaCumCalen = toCalendar(ar.fecha_de_nacimiento);
        String fecha=fechaCumCalen.get(Calendar.DAY_OF_MONTH)+"/"+(fechaCumCalen.get(Calendar.MONTH)+1)+"/"+fechaCumCalen.get(Calendar.YEAR);
        out_fecha_nac.setText(fecha);
        out_edad.setText(ar.calcularEdad());
        out_momento.setText(ar.cuando.tipo);
        if (ar.cuando.getAlegria()) {
            out_alegre.setText("Si");
        }else{
            out_alegre.setText("No");
        }
    }//GEN-LAST:event_lista_nombreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elegir().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JComboBox<String> lista_nombre;
    private javax.swing.JTextField out_alegre;
    private javax.swing.JTextField out_edad;
    private javax.swing.JTextField out_fecha_nac;
    private javax.swing.JTextField out_momento;
    private javax.swing.JTextField out_nombre_intrum;
    private javax.swing.JTextField out_tipo;
    private javax.swing.JTextField out_tipo_intrum;
    private javax.swing.JButton tbn_cantar;
    // End of variables declaration//GEN-END:variables
}
