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
public class Tela_33_User2_ConsultarClientesCadastrados extends javax.swing.JFrame {
    public static int cod_cliente;
    
    

    /**
     * Creates new form Tela_30_User2_ConsultarProdutosCadastrados
     */
    public Tela_33_User2_ConsultarClientesCadastrados() {
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

        Button_Tela33_Menu = new javax.swing.JLabel();
        Button_Tela33_Confirma = new javax.swing.JLabel();
        Campo_TextoCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela33_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Voltar_Menu.png"))); // NOI18N
        Button_Tela33_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela33_MenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela33_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        Button_Tela33_Confirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/OK.png"))); // NOI18N
        Button_Tela33_Confirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela33_ConfirmaMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela33_Confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        Campo_TextoCliente.setBackground(new java.awt.Color(255, 255, 255));
        Campo_TextoCliente.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        Campo_TextoCliente.setForeground(new java.awt.Color(102, 102, 102));
        Campo_TextoCliente.setBorder(null);
        getContentPane().add(Campo_TextoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/20.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela33_ConfirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela33_ConfirmaMouseClicked
           Tela_33_User2_ConsultarClientesCadastrados.cod_cliente = Integer.parseInt(this.Campo_TextoCliente.getText());
           new Tela_34_User2_MenuCliente().setVisible(true);
           dispose();
    }//GEN-LAST:event_Button_Tela33_ConfirmaMouseClicked

    private void Button_Tela33_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela33_MenuMouseClicked
        
        
//        new Tela_14_User2_Menu().setVisible(true);
//        dispose();
    }//GEN-LAST:event_Button_Tela33_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_33_User2_ConsultarClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_33_User2_ConsultarClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_33_User2_ConsultarClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_33_User2_ConsultarClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_33_User2_ConsultarClientesCadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela33_Confirma;
    private javax.swing.JLabel Button_Tela33_Menu;
    private javax.swing.JTextField Campo_TextoCliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
