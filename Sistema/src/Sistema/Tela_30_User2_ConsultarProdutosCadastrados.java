/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_30_User2_ConsultarProdutosCadastrados extends javax.swing.JFrame {
    
    public static int cod_produto;
    

    /**
     * Creates new form Tela_30_User2_ConsultarProdutosCadastrados
     */
    public Tela_30_User2_ConsultarProdutosCadastrados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela30_Menu = new javax.swing.JLabel();
        Button_Tela30_Confirma = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela30_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Voltar_Menu.png"))); // NOI18N
        Button_Tela30_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela30_MenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela30_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        Button_Tela30_Confirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/OK.png"))); // NOI18N
        Button_Tela30_Confirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela30_ConfirmaMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela30_Confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 234, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/17.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela30_ConfirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela30_ConfirmaMouseClicked
        this.cod_produto = Integer.parseInt(this.jTextField1.getText());
        new Tela_31_User2_SectionProduto().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Button_Tela30_ConfirmaMouseClicked

    private void Button_Tela30_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela30_MenuMouseClicked

        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela30_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_30_User2_ConsultarProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_30_User2_ConsultarProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_30_User2_ConsultarProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_30_User2_ConsultarProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_30_User2_ConsultarProdutosCadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela30_Confirma;
    private javax.swing.JLabel Button_Tela30_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
