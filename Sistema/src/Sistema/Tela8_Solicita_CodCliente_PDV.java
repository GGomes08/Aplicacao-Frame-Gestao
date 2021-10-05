package Sistema;

import Model_Bean.Cliente;
import Model_DAO.ClienteDAO;

public class Tela8_Solicita_CodCliente_PDV extends javax.swing.JFrame {

    public Tela8_Solicita_CodCliente_PDV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela8_ConfirmaCodCliente = new javax.swing.JLabel();
        Button_Tela8_VoltarPagamento = new javax.swing.JLabel();
        Campo_CodCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela8_ConfirmaCodCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--8OK.png"))); // NOI18N
        Button_Tela8_ConfirmaCodCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela8_ConfirmaCodClienteMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela8_ConfirmaCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        Button_Tela8_VoltarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--8--Voltar-ao-caixa.png"))); // NOI18N
        Button_Tela8_VoltarPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela8_VoltarPagamentoMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela8_VoltarPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        Campo_CodCliente.setBackground(new java.awt.Color(255, 255, 255));
        Campo_CodCliente.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        Campo_CodCliente.setForeground(new java.awt.Color(102, 102, 102));
        Campo_CodCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Campo_CodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_CodClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_CodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela-8-Scaneia-Código_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela8_VoltarPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela8_VoltarPagamentoMouseClicked
        // Botão que chama tela anterior- Tela de seleção de pagamento
        new Tela6_Forma_de_Pagamento().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela8_VoltarPagamentoMouseClicked

    private void Button_Tela8_ConfirmaCodClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela8_ConfirmaCodClienteMouseClicked
        // INSERINDO PARAMETROS DA INSERCAO
        //CHAMADA
        Cliente c=new Cliente();
        ClienteDAO dao=new ClienteDAO();
        
        c.setId_cliente(Integer.parseInt(Campo_CodCliente.getText()));
        
        //VALIDANDO
        dao.cadastraID(c);

        //Botão Confirma código do cliente e chama tela do caixa
        new Tela7_Caixa_PDV().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela8_ConfirmaCodClienteMouseClicked

    private void Campo_CodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_CodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_CodClienteActionPerformed

    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Tela8_Solicita_CodCliente_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela8_Solicita_CodCliente_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela8_Solicita_CodCliente_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela8_Solicita_CodCliente_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela8_Solicita_CodCliente_PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela8_ConfirmaCodCliente;
    private javax.swing.JLabel Button_Tela8_VoltarPagamento;
    private javax.swing.JTextField Campo_CodCliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
