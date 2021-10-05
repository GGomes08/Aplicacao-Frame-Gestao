
package Sistema;

public class Tela_14_User2_Menu extends javax.swing.JFrame {

    
    public Tela_14_User2_Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Button_Tela14_CadastrarProduto = new javax.swing.JLabel();
        Button_Tela14_Atualizar = new javax.swing.JLabel();
        Button_Tela14_Consultar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Button_Tela_14_user2_Relatorios = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Ver-Ocorrências.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 140, 160));

        Button_Tela14_CadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Cadastrar-produto.png"))); // NOI18N
        Button_Tela14_CadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela14_CadastrarProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela14_CadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 120, 150));

        Button_Tela14_Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Atualziar.png"))); // NOI18N
        Button_Tela14_Atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela14_AtualizarMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela14_Atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 140, 170));

        Button_Tela14_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Consultar.png"))); // NOI18N
        Button_Tela14_Consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela14_ConsultarMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela14_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 130, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botao-Sair.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 80, -1));

        Button_Tela_14_user2_Relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-3--Botao-Relatorios.png"))); // NOI18N
        Button_Tela_14_user2_Relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela_14_user2_RelatoriosMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela_14_user2_Relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/fornecedores.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/funcionarios.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela_14_user2_RelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela_14_user2_RelatoriosMouseClicked
        // TODO add your handling code here:
        new Tela_15_User2_Relatorios().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela_14_user2_RelatoriosMouseClicked

    private void Button_Tela14_CadastrarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela14_CadastrarProdutoMouseClicked
        // TODO add your handling code here:
        new Tela_18_User2_CadastrandoProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela14_CadastrarProdutoMouseClicked

    private void Button_Tela14_AtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela14_AtualizarMouseClicked
        // TODO add your handling code here:
        new Tela_20_User2_OqueAtualizar().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela14_AtualizarMouseClicked

    private void Button_Tela14_ConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela14_ConsultarMouseClicked
        // TODO add your handling code here:
        new Tela_29_User2_Consulta().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela14_ConsultarMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Tela_41_User2_Funcionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Tela_45_User2_Fornecedores().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new Tela_50_User2_Ocorrencias().setVisible(true);
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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_14_User2_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_14_User2_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_14_User2_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_14_User2_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_14_User2_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela14_Atualizar;
    private javax.swing.JLabel Button_Tela14_CadastrarProduto;
    private javax.swing.JLabel Button_Tela14_Consultar;
    private javax.swing.JLabel Button_Tela_14_user2_Relatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
