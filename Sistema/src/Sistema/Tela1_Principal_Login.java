/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Conexao_e_Tabela.connectionFactory;
import Model_DAO.UsuarioDAO;

public class Tela1_Principal_Login extends javax.swing.JFrame {

    public Tela1_Principal_Login() {
        initComponents();
        //CONEXAO DO BANCO DE DADOS
        connectionFactory.getConnection(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ID_User1 = new javax.swing.JTextField();
        button_entrar = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 2000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID_User1.setBackground(new java.awt.Color(255, 255, 255));
        ID_User1.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N
        ID_User1.setForeground(new java.awt.Color(102, 102, 102));
        ID_User1.setText("Digite o ID");
        ID_User1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ID_User1.setMinimumSize(new java.awt.Dimension(2, 20));
        ID_User1.setPreferredSize(new java.awt.Dimension(68, 30));
        ID_User1.setSelectionColor(new java.awt.Color(0, 174, 239));
        getContentPane().add(ID_User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 170, 20));

        button_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela-1--Botao-Entrar.png"))); // NOI18N
        button_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_entrarMouseClicked(evt);
            }
        });
        getContentPane().add(button_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("Digite a senha");
        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 170, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela-01--Login.png"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_entrarMouseClicked
        // VALIDANDO LOGIN E SENHA
        UsuarioDAO ver = new UsuarioDAO();
        int x=ver.verificaLogin(ID_User1.getText(),jPasswordField1.getText());
        
        //LINK DA TELA
        switch(x){
            case 1:
                //CHAMA MENU ADM
                new Tela_14_User2_Menu().setVisible(true);
                dispose();
                break;
            case 2:
                //CHAMA MENU FUNCIONARIO
                new Tela3_MenuPrincipalUser1().setVisible(true);
                this.dispose();
                break;
            default:
                new Tela2_Mensagem_ErroLogin().setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_button_entrarMouseClicked

    
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
            java.util.logging.Logger.getLogger(Tela1_Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1_Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1_Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1_Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1_Principal_Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_User1;
    private javax.swing.JLabel button_entrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
