package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class CAMPUS1 extends javax.swing.JFrame {
    
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logofinal1.png"));
        return retValue;
    }
     
    DefaultComboBoxModel modeloPabellon, modeloPiso;
    
    public CAMPUS1() {
        initComponents();
        setLocationRelativeTo(this);
        CargarPabellones();
        setTitle("SOS USIL");
    }
    
    public void CargarPabellones(){
        String [] pabellones={"A","B","C","D","E","F","CAFETERÍA"};
        modeloPabellon = new DefaultComboBoxModel(pabellones);
        jComboBoxC1Pabellon.setModel(modeloPabellon);
    }
    
    public void cargarPisos(){
        String [] a = {"1","2","3","4"};
        String [] b = {"1","2","3","4"};
        String [] c = {"1","2","3","4"};
        String [] d = {"1","2","3","4"};
        String [] e = {"1","2","3","4","5","6"};
        String [] f = {"1","2","3","4"};
        String [] cafeteria = {"1"};
        
        String pabellon = jComboBoxC1Pabellon.getSelectedItem().toString();
        
        if(pabellon.equals("A")){
            modeloPiso = new DefaultComboBoxModel(a);
            jComboBoxPisoC1.setModel(modeloPiso);
        }else if(pabellon.equals("B")){
            modeloPiso = new DefaultComboBoxModel(b);
            jComboBoxPisoC1.setModel(modeloPiso);
        }else if(pabellon.equals("C")){
            modeloPiso = new DefaultComboBoxModel(c);
            jComboBoxPisoC1.setModel(modeloPiso);
        }else if(pabellon.equals("D")){
            modeloPiso = new DefaultComboBoxModel(d);
            jComboBoxPisoC1.setModel(modeloPiso);
        }else if(pabellon.equals("E")){
            modeloPiso = new DefaultComboBoxModel(e);
            jComboBoxPisoC1.setModel(modeloPiso);
        }else if(pabellon.equals("F")){
            modeloPiso = new DefaultComboBoxModel(f);
            jComboBoxPisoC1.setModel(modeloPiso);
        }else if(pabellon.equals("CAFETERÍA")){
            modeloPiso = new DefaultComboBoxModel(cafeteria);
            jComboBoxPisoC1.setModel(modeloPiso);
        }
      
        
    }
    
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmergenciac2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxC1Pabellon = new javax.swing.JComboBox<>();
        jComboBoxPisoC1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        EnviarC1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnEmergenciac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, 60, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sos transparente.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 83));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 83));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 83));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/C1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 360));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de piso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Pabellón:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jComboBoxC1Pabellon.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxC1Pabellon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "CAFETERÍA" }));
        jComboBoxC1Pabellon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxC1PabellonActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxC1Pabellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        jComboBoxPisoC1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxPisoC1.setSelectedItem(jComboBoxPisoC1);
        jComboBoxPisoC1.setToolTipText("");
        getContentPane().add(jComboBoxPisoC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acercadeusil.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 540));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        EnviarC1.setBackground(new java.awt.Color(204, 204, 255));
        EnviarC1.setForeground(new java.awt.Color(204, 204, 255));
        EnviarC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avion-de-papel.png"))); // NOI18N
        EnviarC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarC1MouseClicked(evt);
            }
        });
        getContentPane().add(EnviarC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxC1PabellonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxC1PabellonActionPerformed
        // TODO add your handling code here:
        
        cargarPisos();
        
    }//GEN-LAST:event_jComboBoxC1PabellonActionPerformed

    private void EnviarC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarC1MouseClicked
        // TODO add your handling code here:
        if(jComboBoxC1Pabellon.getSelectedIndex()<=8 && jComboBoxPisoC1.getSelectedIndex()<=6){
            JOptionPane.showMessageDialog(this, "Se envio correctamente la alerta");
        }else{
            JOptionPane.showMessageDialog(this, "Se completar los campos");
        }
        
        
        
    }//GEN-LAST:event_EnviarC1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "¡AlERTA ENVIADA, AYUDA EN CAMINO!");
        
        GUIAAUX guia = new GUIAAUX();
            guia.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio c2 = new Inicio();
        c2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEmergenciac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergenciac2ActionPerformed
        JOptionPane.showInputDialog("\n (1) Policia "
            + "\n (2) Ambulancia "
            + "\n (3) Bomberos "
            + "\n (4) Salir");
    }//GEN-LAST:event_btnEmergenciac2ActionPerformed

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
            java.util.logging.Logger.getLogger(CAMPUS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAMPUS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAMPUS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAMPUS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAMPUS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnviarC1;
    private javax.swing.JButton btnEmergenciac2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox<String> jComboBoxC1Pabellon;
    private javax.swing.JComboBox<String> jComboBoxPisoC1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
