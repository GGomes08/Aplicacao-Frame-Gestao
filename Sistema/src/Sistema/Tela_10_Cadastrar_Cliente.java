package Sistema;

import Model_Bean.Cliente;
import Model_DAO.ClienteDAO;

public class Tela_10_Cadastrar_Cliente extends javax.swing.JFrame {

    public Tela_10_Cadastrar_Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela10_Voltar_Menu = new javax.swing.JLabel();
        Button_Tela10_Cadastrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_tel = new javax.swing.JTextField();
        campo_cel = new javax.swing.JTextField();
        campo_logadouro = new javax.swing.JTextField();
        campo_nome = new javax.swing.JTextField();
        campo_cpf = new javax.swing.JTextField();
        campo_bairro = new javax.swing.JTextField();
        campo_numeracao = new javax.swing.JTextField();
        campo_cep = new javax.swing.JTextField();
        campo_referencia = new javax.swing.JTextField();
        campo_orgao = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        campo_conhecido = new javax.swing.JTextField();
        campo_complemento = new javax.swing.JTextField();
        campo_rg = new javax.swing.JTextField();
        campo_nascimento = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        campo_estadocivil = new javax.swing.JTextField();
        campo_cidade = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        campo_salario = new javax.swing.JTextField();
        campo_estado = new javax.swing.JTextField();
        campo_tel2 = new javax.swing.JTextField();
        campo_sexo1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela10_Voltar_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Button_Voltar-Menu.png"))); // NOI18N
        Button_Tela10_Voltar_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela10_Voltar_MenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela10_Voltar_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        Button_Tela10_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Button-Cadastrar-cliente.png"))); // NOI18N
        Button_Tela10_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela10_CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela10_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Button_LimparCampos.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        campo_tel.setBackground(new java.awt.Color(255, 255, 255));
        campo_tel.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_tel.setForeground(new java.awt.Color(102, 102, 102));
        campo_tel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 120, -1));

        campo_cel.setBackground(new java.awt.Color(255, 255, 255));
        campo_cel.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_cel.setForeground(new java.awt.Color(102, 102, 102));
        campo_cel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 120, -1));

        campo_logadouro.setBackground(new java.awt.Color(255, 255, 255));
        campo_logadouro.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_logadouro.setForeground(new java.awt.Color(102, 102, 102));
        campo_logadouro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_logadouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 190, -1));

        campo_nome.setBackground(new java.awt.Color(255, 255, 255));
        campo_nome.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_nome.setForeground(new java.awt.Color(102, 102, 102));
        campo_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 170, -1));

        campo_cpf.setBackground(new java.awt.Color(255, 255, 255));
        campo_cpf.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_cpf.setForeground(new java.awt.Color(102, 102, 102));
        campo_cpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 170, -1));

        campo_bairro.setBackground(new java.awt.Color(255, 255, 255));
        campo_bairro.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_bairro.setForeground(new java.awt.Color(102, 102, 102));
        campo_bairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 70, -1));

        campo_numeracao.setBackground(new java.awt.Color(255, 255, 255));
        campo_numeracao.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_numeracao.setForeground(new java.awt.Color(102, 102, 102));
        campo_numeracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_numeracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 90, -1));

        campo_cep.setBackground(new java.awt.Color(255, 255, 255));
        campo_cep.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_cep.setForeground(new java.awt.Color(102, 102, 102));
        campo_cep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 80, -1));

        campo_referencia.setBackground(new java.awt.Color(255, 255, 255));
        campo_referencia.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_referencia.setForeground(new java.awt.Color(102, 102, 102));
        campo_referencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 200, -1));

        campo_orgao.setBackground(new java.awt.Color(255, 255, 255));
        campo_orgao.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_orgao.setForeground(new java.awt.Color(102, 102, 102));
        campo_orgao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_orgao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, -1));

        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 51, 51));
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 70, -1));

        campo_conhecido.setBackground(new java.awt.Color(255, 255, 255));
        campo_conhecido.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_conhecido.setForeground(new java.awt.Color(102, 102, 102));
        campo_conhecido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_conhecido, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 120, -1));

        campo_complemento.setBackground(new java.awt.Color(255, 255, 255));
        campo_complemento.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_complemento.setForeground(new java.awt.Color(102, 102, 102));
        campo_complemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 90, -1));

        campo_rg.setBackground(new java.awt.Color(255, 255, 255));
        campo_rg.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_rg.setForeground(new java.awt.Color(102, 102, 102));
        campo_rg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 70, -1));

        campo_nascimento.setBackground(new java.awt.Color(255, 255, 255));
        campo_nascimento.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_nascimento.setForeground(new java.awt.Color(102, 102, 102));
        campo_nascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 70, -1));

        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(51, 51, 51));
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 70, -1));

        campo_estadocivil.setBackground(new java.awt.Color(255, 255, 255));
        campo_estadocivil.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_estadocivil.setForeground(new java.awt.Color(102, 102, 102));
        campo_estadocivil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 70, -1));

        campo_cidade.setBackground(new java.awt.Color(255, 255, 255));
        campo_cidade.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_cidade.setForeground(new java.awt.Color(102, 102, 102));
        campo_cidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 70, -1));

        jTextField19.setBackground(new java.awt.Color(255, 255, 255));
        jTextField19.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(51, 51, 51));
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 130, -1));

        campo_salario.setBackground(new java.awt.Color(255, 255, 255));
        campo_salario.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_salario.setForeground(new java.awt.Color(102, 102, 102));
        campo_salario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 70, -1));

        campo_estado.setBackground(new java.awt.Color(255, 255, 255));
        campo_estado.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_estado.setForeground(new java.awt.Color(102, 102, 102));
        campo_estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 100, -1));

        campo_tel2.setBackground(new java.awt.Color(255, 255, 255));
        campo_tel2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_tel2.setForeground(new java.awt.Color(102, 102, 102));
        campo_tel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_tel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 130, -1));

        campo_sexo1.setBackground(new java.awt.Color(255, 255, 255));
        campo_sexo1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        campo_sexo1.setForeground(new java.awt.Color(102, 102, 102));
        campo_sexo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela_10.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela10_Voltar_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela10_Voltar_MenuMouseClicked
        // TODO add your handling code here:
         new Tela3_MenuPrincipalUser1 ().setVisible(true);
            dispose();
    }//GEN-LAST:event_Button_Tela10_Voltar_MenuMouseClicked

    private void Button_Tela10_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela10_CadastrarMouseClicked
        //INSERINDO DADOS NO BANCO
        
        // INSERINDO PARAMETROS DA INSERCAO
        //CHAMADA
        Cliente c=new Cliente();
        ClienteDAO dao=new ClienteDAO();
        
        //passando parametros TABELA 1 
        c.setNome(campo_nome.getText());
        c.setCpf(campo_cpf.getText());
        c.setRg(campo_rg.getText());
        c.setOrgao(campo_orgao.getText());
        c.setSexo(campo_nascimento.getText());
        c.setNascimento(campo_nascimento.getText());
        c.setEstado_civil(campo_estadocivil.getText());
        c.setSalario(Double.parseDouble(campo_salario.getText()));
       
        //passando parametros TABELA 2
        c.setLogradouro(campo_logadouro.getText());
        c.setCep(campo_cep.getText());
        c.setNumeracao(Integer.parseInt(campo_numeracao.getText()));
        c.setBairro(campo_bairro.getText());
        c.setComplemento(campo_complemento.getText());
        c.setCidade(campo_cidade.getText());
        c.setEstado(campo_estado.getText());
        c.setPonto_referencia(campo_referencia.getText());
        
        //passando parametros TABELA 3
        c.setTelefone(campo_tel.getText());
        c.setCelular(campo_cel.getText());
        c.setConhecido(campo_conhecido.getText());
        c.setTelefone2(campo_tel2.getText());
        
        //VALIDANDO
        dao.cadastra(c);
       

        // TODO add your handling code here:
        new Tela_11_Cliente_Cadastrado () .setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela10_CadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_10_Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_10_Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_10_Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_10_Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_10_Cadastrar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela10_Cadastrar;
    private javax.swing.JLabel Button_Tela10_Voltar_Menu;
    private javax.swing.JTextField campo_bairro;
    private javax.swing.JTextField campo_cel;
    private javax.swing.JTextField campo_cep;
    private javax.swing.JTextField campo_cidade;
    private javax.swing.JTextField campo_complemento;
    private javax.swing.JTextField campo_conhecido;
    private javax.swing.JTextField campo_cpf;
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_estadocivil;
    private javax.swing.JTextField campo_logadouro;
    private javax.swing.JTextField campo_nascimento;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_numeracao;
    private javax.swing.JTextField campo_orgao;
    private javax.swing.JTextField campo_referencia;
    private javax.swing.JTextField campo_rg;
    private javax.swing.JTextField campo_salario;
    private javax.swing.JTextField campo_sexo1;
    private javax.swing.JTextField campo_tel;
    private javax.swing.JTextField campo_tel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField19;
    // End of variables declaration//GEN-END:variables
}
