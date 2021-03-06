package Ventanas;

import static Ventanas.Inicio.Fecha;
import conexionBD.Conectar;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Feedback extends javax.swing.JFrame implements Runnable{
    String hora,minutos,segundos;
    Thread hilo;
    Conectar cn;

    public Feedback() {
        initComponents();
        setLocationRelativeTo(this);        
        Fechalb.setText(Fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaactual=new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run(){
        Thread current=Thread.currentThread();
        
        while(current==hilo){
            hora();
            Horalb.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    public static String Fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYY");
        return formatofecha.format(fecha);
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logofinal1.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabelVal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jTextFieldMail = new javax.swing.JTextField();
        jLabelMessage = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jComboBoxValora = new javax.swing.JComboBox<>();
        jButtonSend = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEmergenciac2 = new javax.swing.JButton();
        Horalb = new javax.swing.JLabel();
        Fechalb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logofinal1.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 83));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 83));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 83));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, 150));

        jLabelVal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVal.setText("Valoración:");
        getContentPane().add(jLabelVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMessage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 260, 120));

        jTextFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, -1));

        jLabelMessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMessage.setText("Mensaje:");
        getContentPane().add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabelMail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMail.setText("Email:");
        getContentPane().add(jLabelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));

        jLabelName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Nombre:");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jComboBoxValora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxValora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBoxValora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        jButtonSend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSend.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avion-de-papel.png"))); // NOI18N
        jButtonSend.setBorder(null);
        jButtonSend.setBorderPainted(false);
        jButtonSend.setContentAreaFilled(false);
        jButtonSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSend.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendMouseClicked(evt);
            }
        });
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, 55));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcador-de-posicion2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnEmergenciac2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono-inteligente.png"))); // NOI18N
        btnEmergenciac2.setBorder(null);
        btnEmergenciac2.setBorderPainted(false);
        btnEmergenciac2.setContentAreaFilled(false);
        btnEmergenciac2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmergenciac2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmergenciac2.setIconTextGap(-3);
        btnEmergenciac2.setPreferredSize(new java.awt.Dimension(59, 35));
        btnEmergenciac2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEmergenciac2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmergenciac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergenciac2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmergenciac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 70));

        Horalb.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Horalb.setForeground(new java.awt.Color(0, 204, 204));
        Horalb.setText("00:00:00");
        getContentPane().add(Horalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 20));

        Fechalb.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Fechalb.setForeground(new java.awt.Color(0, 204, 204));
        Fechalb.setText("DD/MM/YYYY");
        getContentPane().add(Fechalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acercadeusil.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        
        cn=new Conectar();

        Connection reg=cn.conexion();
        String sql;
        String alias= jTextFieldName.getText();
        String mail = jTextFieldMail.getText();
        String mensaje = jTextAreaMessage.getText();
        
        String valoracion = jComboBoxValora.getSelectedItem().toString();
        
        
        sql="insert into FeedBack(alias,mail,mensaje, valoracion) Values (?,?,?,?)";
        
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, alias);
            pst.setString(2, mail);
            pst.setString(3, mensaje);
            pst.setString(4, valoracion);
            
            //Los valores son añadidos a la Bd
            int n=pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(this, "Valores cargados .......");
            }
            
        } catch (SQLException e) {
            System.out.println("Error encontrado  "+e.toString());
        }
        jTextFieldName.setText("");
        jTextFieldMail.setText("");
        jTextAreaMessage.setText("");
        //Se mueve a la pagina de inicio 
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void jTextFieldMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMailActionPerformed
        String email = jTextFieldMail.getText();
    }//GEN-LAST:event_jTextFieldMailActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        String nombre = jTextFieldName.getName();
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio fb = new Inicio();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEmergenciac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergenciac2ActionPerformed
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "\n MENU"
            + "\n (1) Policia "
            + "\n (2) Ambulancia "
            + "\n (3) Bomberos "
            + "\n (4) Salir"));
        do{
            switch(opc){
                case 1:{
                    JOptionPane.showMessageDialog(rootPane, "105");
                }
                break;
                case 2:{
                    JOptionPane.showMessageDialog(rootPane, "106");
                }
                break;
                case 3:{
                    JOptionPane.showMessageDialog(rootPane, "116");
                }
                break;
            }
        }while(opc > 4);
        
    }//GEN-LAST:event_btnEmergenciac2ActionPerformed

    private void jButtonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonSendMouseClicked

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fechalb;
    private javax.swing.JLabel Horalb;
    private javax.swing.JButton btnEmergenciac2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JComboBox<String> jComboBoxValora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelVal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMessage;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
