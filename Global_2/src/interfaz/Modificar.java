package interfaz;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import mvc.Artista;
import mvc.Momento;

public class Modificar extends javax.swing.JFrame {

    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lista_nombre = new javax.swing.JComboBox();
        out_in_nom_instrum = new javax.swing.JTextField();
        out_in_tipo_instrum = new javax.swing.JTextField();
        out_in_si_no = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        minutos = new javax.swing.JComboBox<>();
        btn_modificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbtn_artista = new javax.swing.JRadioButton();
        rbtn_canario = new javax.swing.JRadioButton();
        rbtn_gallo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rbtn_si = new javax.swing.JRadioButton();
        rbtn_no = new javax.swing.JRadioButton();
        Cargar_info = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR ARTISTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 29, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("NOMBRE:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 85, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TOCA ALGUN INSTRUMENTO");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("NOMBRE:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lista_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(lista_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 82, 154, -1));
        getContentPane().add(out_in_nom_instrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 154, -1));
        getContentPane().add(out_in_tipo_instrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 154, -1));

        out_in_si_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        out_in_si_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_in_si_noActionPerformed(evt);
            }
        });
        getContentPane().add(out_in_si_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("TIPO:        ");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 230, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MOMENTO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("HORA");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 56, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("MIN");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 60, -1));

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        btn_salir.setText("VOLVER");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO * :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        rbtn_artista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_artista.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_artista.setText("ARTISTA");
        rbtn_artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_artistaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        rbtn_canario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_canario.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_canario.setText("CANARIO");
        getContentPane().add(rbtn_canario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        rbtn_gallo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_gallo.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_gallo.setText("GALLO");
        rbtn_gallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_galloActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_gallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿ES ALEGRE?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        rbtn_si.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_si.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_si.setText("SI");
        rbtn_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_siActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        rbtn_no.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtn_no.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_no.setText("NO");
        rbtn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_noActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        Cargar_info.setText("Buscar");
        Cargar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_infoActionPerformed(evt);
            }
        });
        getContentPane().add(Cargar_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu-75.png"))); // NOI18N
        fondo.setText("jLabel2");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 480, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void rbtn_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_artistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_artistaActionPerformed

    private void rbtn_galloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_galloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_galloActionPerformed

    private void out_in_si_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_in_si_noActionPerformed
        // TODO add your handling code here:
        String tipo="";
        if (rbtn_artista.isSelected()) {
            tipo="ARTISTA";
        }else if(rbtn_gallo.isSelected()){
            tipo="GALLO";
        }else if(rbtn_canario.isSelected()){
            tipo="CANARIO";
        }
        if (tipo.equals("ARTISTA")) {
            out_in_nom_instrum.setEnabled(false);
            out_in_tipo_instrum.setEnabled(false);
        } else{
            out_in_nom_instrum.setEnabled(true);
            out_in_tipo_instrum.setEnabled(true);
        }
        if (out_in_si_no.getSelectedItem().equals("NO")) {
            out_in_nom_instrum.setEnabled(false);
            out_in_tipo_instrum.setEnabled(false);
        } else if (out_in_si_no.getSelectedItem().equals("SI")) {
            out_in_nom_instrum.setEnabled(true);
            out_in_tipo_instrum.setEnabled(true);
        }
    }//GEN-LAST:event_out_in_si_noActionPerformed

    private void lista_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_nombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_lista_nombreActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        Menu host = new Menu();
        String tipo="";
        if (rbtn_artista.isSelected()) {
            tipo="ARTISTA";
        }else if(rbtn_gallo.isSelected()){
            tipo="GALLO";
        }else if(rbtn_canario.isSelected()){
            tipo="CANARIO";
        }
        Artista ar1 = (Artista)lista_nombre.getSelectedItem();
        ar1.tipo= tipo;
        ar1.usa.get(0).nombre=out_in_nom_instrum.getText();
        ar1.usa.get(0).tipo=out_in_tipo_instrum.getText();
        boolean alegre = false;
//        String h = (String) hora.getSelectedItem();<------------------- FIJATE QUE HACER PARA MOSTRAR EL MOMENTO INTENTA CON DESCOMENTAR ESTO O DIRECTAMENTE USAMOS LO DE LA PAZ
        Momento m = new Momento(alegre);
//        m.setTipo(h);
        if (rbtn_si.isSelected()) {
            Menu.cantores.get(lista_nombre.getSelectedIndex()).cuando.setAlegria(true);
        }else{
            Menu.cantores.get(lista_nombre.getSelectedIndex()).cuando.setAlegria(false);
        }
        out_in_nom_instrum.setText("");
        out_in_tipo_instrum.setText("");
        try {
            //Persistir el nuevo array
            ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream("src/persistencia/cantoresGuardados.txt"));
            escribirFichero.writeObject(Menu.cantores);
            escribirFichero.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void rbtn_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_siActionPerformed

    private void rbtn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_noActionPerformed

    private void Cargar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_infoActionPerformed

        for (int i = 0; i < Menu.cantores.size(); i++) {
            lista_nombre.addItem(Menu.cantores.get(i));
        }
    }//GEN-LAST:event_Cargar_infoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar_info;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JComboBox lista_nombre;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JTextField out_in_nom_instrum;
    private javax.swing.JComboBox<String> out_in_si_no;
    private javax.swing.JTextField out_in_tipo_instrum;
    public javax.swing.JRadioButton rbtn_artista;
    public javax.swing.JRadioButton rbtn_canario;
    public javax.swing.JRadioButton rbtn_gallo;
    public javax.swing.JRadioButton rbtn_no;
    public javax.swing.JRadioButton rbtn_si;
    // End of variables declaration//GEN-END:variables
}
