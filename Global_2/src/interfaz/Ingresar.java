
package interfaz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import mvc.Artista;
import mvc.Canario;
import mvc.Gallo;
import mvc.Instrumento;
import mvc.Momento;
import mvc.SerCantor;



public class Ingresar extends javax.swing.JFrame {
    public int i;
    private Elegir e;
    public Ingresar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        in_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtn_artista = new javax.swing.JRadioButton();
        rbtn_canario = new javax.swing.JRadioButton();
        rbtn_gallo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        si_no = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        in_nombre_instrum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        in_tipo_instrum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        minutos = new javax.swing.JComboBox<>();
        btn_agregar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        rbtn_no = new javax.swing.JRadioButton();
        rbtn_si = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("los campos con ( * ) son obligatorios ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        getContentPane().add(in_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 165, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE * :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO * :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        buttonGroup1.add(rbtn_artista);
        rbtn_artista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_artista.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_artista.setText("ARTISTA");
        rbtn_artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_artistaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        buttonGroup1.add(rbtn_canario);
        rbtn_canario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_canario.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_canario.setText("CANARIO");
        rbtn_canario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_canarioActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_canario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        buttonGroup1.add(rbtn_gallo);
        rbtn_gallo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_gallo.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_gallo.setText("GALLO");
        rbtn_gallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_galloActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_gallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA NACIMIENTO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TOCA ALGUN INSTRUMENTO");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        si_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        si_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si_noActionPerformed(evt);
            }
        });
        getContentPane().add(si_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));
        getContentPane().add(in_nombre_instrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 166, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        getContentPane().add(in_tipo_instrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 166, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿ES ALEGRE?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));
        getContentPane().add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 119, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MOMENTO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 246, 10));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("HORA");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 56, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("MIN");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 60, -1));

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        buttonGroup3.add(rbtn_no);
        rbtn_no.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_no.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_no.setText("NO");
        rbtn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_noActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        buttonGroup3.add(rbtn_si);
        rbtn_si.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_si.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_si.setText("SI");
        rbtn_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_siActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu-75.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_artistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_artistaActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void rbtn_galloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_galloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_galloActionPerformed

    private void si_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si_noActionPerformed
        //Inhabilitar los campos si no corresponde
        String nombre = in_nombre.getText();
        String tipo="";
        if (rbtn_artista.isSelected()) {
            tipo="ARTISTA";
        }else if(rbtn_gallo.isSelected()){
            tipo="GALLO";
        }else if(rbtn_canario.isSelected()){
            tipo="CANARIO";
        }
        if (tipo.equals("ARTISTA")) {
            in_nombre_instrum.setEnabled(false);
            in_tipo_instrum.setEnabled(false);
        } else{
            in_nombre_instrum.setEnabled(true);
            in_tipo_instrum.setEnabled(true);
        }
        if (si_no.getSelectedItem().equals("NO")) {
            in_nombre_instrum.setEnabled(false);
            in_tipo_instrum.setEnabled(false);
        } else if (si_no.getSelectedItem().equals("SI")) {
            in_nombre_instrum.setEnabled(true);
            in_tipo_instrum.setEnabled(true);
        }
        
    }//GEN-LAST:event_si_noActionPerformed
    public static Calendar toCalendar(Date date){ 
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    } 
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        SerCantor cantante = null;
        String tipo="";
        if (rbtn_artista.isSelected()) {
            tipo="ARTISTA";
        }else if(rbtn_gallo.isSelected()){
            tipo="GALLO";
        }else if(rbtn_canario.isSelected()){
            tipo="CANARIO";
        }
        if (in_nombre.getText().equals("")||"".equals(tipo)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese el valor faltante.");
            in_nombre.requestFocusInWindow();
        }else{
            String nombreArtista = in_nombre.getText();
            boolean alegre = false;
            Date fechacum = calendario.getDate();
//            if (rbtn_si.isSelected()) {
//                alegre = true;
//            }else if(rbtn_no.isSelected()){
//                alegre = false;
//            }
            String h = (String) hora.getSelectedItem();
            Momento m = new Momento(alegre);
            m.setTipo(h);
            if ("ARTISTA".equals(tipo)) {
                ArrayList<Instrumento> instrum= new ArrayList();
                var instrumento = new Instrumento();
                instrumento.nombre=in_nombre_instrum.getText();
                instrumento.tipo=in_tipo_instrum.getText();
                instrum.add(instrumento);
                cantante = new Artista(instrum, nombreArtista, m, tipo, fechacum);
                //Artista a = new Artista(instrum, nombreArtista, m, tipo, fechacum);
                //Menu.cantores.add(a);
            }else if("GALLO".equals(tipo)){
                cantante = new Gallo(nombreArtista, m, tipo, fechacum);
                //Gallo g = new Gallo(nombreArtista, m, tipo, fechacum);     OTRA OPCION PARA GUARDARLOS EN CANTORES
                //Menu.cantores.add(g);
            }else if("CANARIO".equals(tipo)){
                cantante= new Canario(nombreArtista, m, tipo, fechacum);
                //Canario c = new Canario(nombreArtista, m, tipo, fechacum);
                //Menu.cantores.add(c);
            }
            Menu.cantores.add(cantante);
//            i = Menu.cantores.size()-1;
//            e.lista_nombre.addItem(Menu.cantores.get(i));   //SOLUCIONAR ESTO PARA LA CARGA DE NOMBRES EN ELEGIR
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void rbtn_canarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_canarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_canarioActionPerformed

    private void rbtn_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_siActionPerformed

    private void rbtn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_noActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JTextField in_nombre;
    private javax.swing.JTextField in_nombre_instrum;
    private javax.swing.JTextField in_tipo_instrum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> minutos;
    public javax.swing.JRadioButton rbtn_artista;
    public javax.swing.JRadioButton rbtn_canario;
    public javax.swing.JRadioButton rbtn_gallo;
    public javax.swing.JRadioButton rbtn_no;
    public javax.swing.JRadioButton rbtn_si;
    private javax.swing.JComboBox<String> si_no;
    // End of variables declaration//GEN-END:variables
}
