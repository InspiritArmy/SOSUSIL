package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class GUIAAUX extends javax.swing.JFrame {
    
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logofinal1.png"));
        return retValue;
    }
     
    DefaultComboBoxModel modeloPabellon, modeloPiso;
    
    public GUIAAUX() {
        initComponents();
        setLocationRelativeTo(this);
        
        setTitle("SOS USIL");
    }

    
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hemorragias1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEmergenciac2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Quemaduras1 = new javax.swing.JButton();
        Hemorragias = new javax.swing.JButton();
        Desmayos = new javax.swing.JButton();
        Quemaduras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hemorragias1.setBackground(new java.awt.Color(0, 153, 153));
        Hemorragias1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hemorragias1.setForeground(new java.awt.Color(255, 255, 255));
        Hemorragias1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_fractura.png"))); // NOI18N
        Hemorragias1.setBorder(null);
        Hemorragias1.setBorderPainted(false);
        Hemorragias1.setContentAreaFilled(false);
        Hemorragias1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hemorragias1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hemorragias1.setIconTextGap(-3);
        Hemorragias1.setVerifyInputWhenFocusTarget(false);
        Hemorragias1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Hemorragias1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Hemorragias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hemorragias1ActionPerformed(evt);
            }
        });
        getContentPane().add(Hemorragias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 70));

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
        getContentPane().add(btnEmergenciac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logofinal1.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 83));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 83));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 83));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 140));

        Quemaduras1.setBackground(new java.awt.Color(153, 0, 204));
        Quemaduras1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Quemaduras1.setForeground(new java.awt.Color(255, 255, 255));
        Quemaduras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_otros.png"))); // NOI18N
        Quemaduras1.setBorder(null);
        Quemaduras1.setBorderPainted(false);
        Quemaduras1.setContentAreaFilled(false);
        Quemaduras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Quemaduras1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Quemaduras1.setIconTextGap(-3);
        Quemaduras1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Quemaduras1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Quemaduras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quemaduras1ActionPerformed(evt);
            }
        });
        getContentPane().add(Quemaduras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 140, 70));

        Hemorragias.setBackground(new java.awt.Color(255, 51, 51));
        Hemorragias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hemorragias.setForeground(new java.awt.Color(255, 255, 255));
        Hemorragias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_hemorragias.png"))); // NOI18N
        Hemorragias.setBorder(null);
        Hemorragias.setBorderPainted(false);
        Hemorragias.setContentAreaFilled(false);
        Hemorragias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hemorragias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hemorragias.setIconTextGap(-3);
        Hemorragias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Hemorragias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Hemorragias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HemorragiasActionPerformed(evt);
            }
        });
        getContentPane().add(Hemorragias, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 140, 70));

        Desmayos.setBackground(new java.awt.Color(51, 204, 0));
        Desmayos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Desmayos.setForeground(new java.awt.Color(255, 255, 255));
        Desmayos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_desmayos.png"))); // NOI18N
        Desmayos.setToolTipText("");
        Desmayos.setBorder(null);
        Desmayos.setBorderPainted(false);
        Desmayos.setContentAreaFilled(false);
        Desmayos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desmayos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Desmayos.setIconTextGap(-3);
        Desmayos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Desmayos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Desmayos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesmayosActionPerformed(evt);
            }
        });
        getContentPane().add(Desmayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, 70));

        Quemaduras.setBackground(new java.awt.Color(255, 102, 51));
        Quemaduras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Quemaduras.setForeground(new java.awt.Color(255, 255, 255));
        Quemaduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_quemaduras.png"))); // NOI18N
        Quemaduras.setBorder(null);
        Quemaduras.setBorderPainted(false);
        Quemaduras.setContentAreaFilled(false);
        Quemaduras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Quemaduras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Quemaduras.setIconTextGap(-3);
        Quemaduras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Quemaduras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Quemaduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuemadurasActionPerformed(evt);
            }
        });
        getContentPane().add(Quemaduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 140, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 80, 70));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmergenciac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergenciac2ActionPerformed
        JOptionPane.showInputDialog("\n (1) Policia "
            + "\n (2) Ambulancia "
            + "\n (3) Bomberos "
            + "\n (4) Salir");
    }//GEN-LAST:event_btnEmergenciac2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio c2 = new Inicio();
        c2.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Hemorragias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hemorragias1ActionPerformed
        // TODO add your handling code here:
        GUIAAUXFractura  fractura = new GUIAAUXFractura();
        fractura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Hemorragias1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Quemaduras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quemaduras1ActionPerformed
        // TODO add your handling code here:
        GUIAAUXOtros  otros = new GUIAAUXOtros();
        otros.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Quemaduras1ActionPerformed

    private void HemorragiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HemorragiasActionPerformed
        // TODO add your handling code here:
        GUIAAUXHemo  hemorragia = new GUIAAUXHemo();
        hemorragia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HemorragiasActionPerformed

    private void DesmayosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesmayosActionPerformed
        // TODO add your handling code here:
        GUIAAUXDesmayos  desmayos = new GUIAAUXDesmayos();
        desmayos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DesmayosActionPerformed

    private void QuemadurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuemadurasActionPerformed
        // TODO add your handling code here:
        GUIAAUXQuemaduraas  quemadura = new GUIAAUXQuemaduraas();
        quemadura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_QuemadurasActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAAUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAAUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAAUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAAUX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAAUX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desmayos;
    private javax.swing.JButton Hemorragias;
    private javax.swing.JButton Hemorragias1;
    private javax.swing.JButton Quemaduras;
    private javax.swing.JButton Quemaduras1;
    private javax.swing.JButton btnEmergenciac2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
