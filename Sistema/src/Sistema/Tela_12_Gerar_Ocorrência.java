package Sistema;

public class Tela_12_Gerar_Ocorrência extends javax.swing.JFrame {

    public Tela_12_Gerar_Ocorrência() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela12_Retorna = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela12_Retorna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Button_Voltar-Menu.png"))); // NOI18N
        Button_Tela12_Retorna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela12_RetornaMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela12_Retorna, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--12--Enviar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 130, -1));

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setBorder(null);
        jFormattedTextField1.setForeground(new java.awt.Color(102, 102, 102));
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jFormattedTextField1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane1.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 360, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela_12.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -60, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela12_RetornaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela12_RetornaMouseClicked
        // TODO add your handling code here:
        new Tela3_MenuPrincipalUser1 ().setVisible(true);
            dispose();
    }//GEN-LAST:event_Button_Tela12_RetornaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Tela_13_Ocorrência_Registrada(). setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_12_Gerar_Ocorrência.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_12_Gerar_Ocorrência.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_12_Gerar_Ocorrência.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_12_Gerar_Ocorrência.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_12_Gerar_Ocorrência().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela12_Retorna;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
