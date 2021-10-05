
package Sistema;


public class Tela3_MenuPrincipalUser1 extends javax.swing.JFrame {

    /**
     * Creates new form Tela3_Menu_User1
     */
    public Tela3_MenuPrincipalUser1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_CaixaPDV = new javax.swing.JLabel();
        Button_CadastrarCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_RelatoriosUser1 = new javax.swing.JLabel();
        Button_HelpKonex_TelaMenuUser1 = new javax.swing.JLabel();
        Button_SairContaUser1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_CaixaPDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botão-Ir-Caixa.png"))); // NOI18N
        Button_CaixaPDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CaixaPDVMouseClicked(evt);
            }
        });
        getContentPane().add(Button_CaixaPDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        Button_CadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botão-Cadastrar-Cliente.png"))); // NOI18N
        Button_CadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CadastrarClienteMouseClicked(evt);
            }
        });
        getContentPane().add(Button_CadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botão-Fazer-Ocorrência.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, 130));

        Button_RelatoriosUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botao-Relatorios.png"))); // NOI18N
        Button_RelatoriosUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_RelatoriosUser1MouseClicked(evt);
            }
        });
        getContentPane().add(Button_RelatoriosUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        Button_HelpKonex_TelaMenuUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/HELP-KONEX.png"))); // NOI18N
        Button_HelpKonex_TelaMenuUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button_HelpKonex_TelaMenuUser1MouseReleased(evt);
            }
        });
        getContentPane().add(Button_HelpKonex_TelaMenuUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 30, 40));

        Button_SairContaUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botao-Sair.png"))); // NOI18N
        getContentPane().add(Button_SairContaUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela-03.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_RelatoriosUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_RelatoriosUser1MouseClicked
        new Tela5_RelatoriosUser1().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_RelatoriosUser1MouseClicked

    private void Button_HelpKonex_TelaMenuUser1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_HelpKonex_TelaMenuUser1MouseReleased
        // TODO add your handling code here:
        new Tela4_HelpKonex_MenuUser1().setVisible(true);
            dispose();
    }//GEN-LAST:event_Button_HelpKonex_TelaMenuUser1MouseReleased

    private void Button_CaixaPDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CaixaPDVMouseClicked
        // TODO add your handling code here:
        new Tela6_Forma_de_Pagamento().setVisible(true);
            dispose();
    }//GEN-LAST:event_Button_CaixaPDVMouseClicked

    private void Button_CadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CadastrarClienteMouseClicked
        // TODO add your handling code here:
        new Tela_10_Cadastrar_Cliente().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Button_CadastrarClienteMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Tela_12_Gerar_Ocorrência().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Tela3_MenuPrincipalUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3_MenuPrincipalUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3_MenuPrincipalUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3_MenuPrincipalUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3_MenuPrincipalUser1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_CadastrarCliente;
    private javax.swing.JLabel Button_CaixaPDV;
    private javax.swing.JLabel Button_HelpKonex_TelaMenuUser1;
    private javax.swing.JLabel Button_RelatoriosUser1;
    private javax.swing.JLabel Button_SairContaUser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
