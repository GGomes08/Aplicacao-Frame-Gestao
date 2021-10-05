
package Sistema;

import Classes.Vendas;
import Conexao_e_Tabela.connectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tela_15_User2_Relatorios extends javax.swing.JFrame {
     public ArrayList<Vendas> vendasLista(){
        ArrayList<Vendas> vendasLista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/gerenciamento","root","");
            String sql ="select id_pagamento,quantidade,valor_final,id_funcionario,id_cliente,cod_barras,data_pagamento from compra inner join pagamento on compra.id_compra=pagamento.id_compra where data_pagamento between '2020-03-19' and '2030-12-31'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Vendas vendas;
            while(rs.next()){
                vendas = new Vendas(rs.getInt("id_pagamento"),rs.getInt("quantidade"),rs.getDouble("valor_final"),rs.getInt("id_funcionario"),rs.getInt("id_cliente"),rs.getString("cod_barras"),rs.getDate("data_pagamento"));
                vendasLista.add(vendas);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return vendasLista;
        
    }
    public void mostrar_vendas(){
        ArrayList<Vendas> lista = vendasLista();
        DefaultTableModel modelo =(DefaultTableModel) Tabela_Vendas.getModel();
        Object [] coluna = new Object[7];
        for(int i = 0; i<lista.size();i++){
            coluna[0]=lista.get(i).getid_pagamento();
            coluna[1]=lista.get(i).getquantidade();
            coluna[2]=lista.get(i).getpreco_final();
            coluna[3]=lista.get(i).getid_funcionario();
            coluna[4]=lista.get(i).getid_cliente();
            coluna[5]=lista.get(i).getcodBarras();
            coluna[6]=lista.get(i).getdata_pagamento();
            modelo.addRow(coluna);
        }
    }

    public Tela_15_User2_Relatorios() {
        initComponents();
        mostrar_vendas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela15_PesquisarVendas = new javax.swing.JLabel();
        Button_Tela15_VoltarMenu = new javax.swing.JLabel();
        Button_Tela15_ImprimirVendas = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Vendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela15_PesquisarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/pesquisa-vendas.png"))); // NOI18N
        Button_Tela15_PesquisarVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela15_PesquisarVendasMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela15_PesquisarVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, 40));

        Button_Tela15_VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/VOLTAR-AO-MENU--3-TRAÇOS.png"))); // NOI18N
        Button_Tela15_VoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela15_VoltarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela15_VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 38, -1, 40));

        Button_Tela15_ImprimirVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Imprimir-Vendas.png"))); // NOI18N
        Button_Tela15_ImprimirVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela15_ImprimirVendasMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela15_ImprimirVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(3, 40, 108));
        jTextField1.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 174, 239));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 40, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(3, 40, 108));
        jTextField2.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 174, 239));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.setBorder(null);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 50, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(3, 40, 108));
        jTextField3.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 174, 239));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.setBorder(null);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField3MouseReleased(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(3, 40, 108));
        jTextField4.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 174, 239));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jTextField4.setBorder(null);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Tabela_Vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Quantidade", "Preço", "ID Cliente", "ID Funcionario", "Cod Barras", "Data Pagamento"
            }
        ));
        jScrollPane1.setViewportView(Tabela_Vendas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 550, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela15_VoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela15_VoltarMenuMouseClicked
        // TODO add your handling code here:
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela15_VoltarMenuMouseClicked

    private void Button_Tela15_PesquisarVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela15_PesquisarVendasMouseClicked
        // TODO add your handling code here:
        new Tela_17_User2_ResultadoBusca().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela15_PesquisarVendasMouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        //COMANDOS
        try{
            
            //COMANDO QUE PREPARA
            stmt = con.prepareStatement("select Count(id_compra) from compra;");
            
            rs=stmt.executeQuery();

            if(rs.next()){
                
                jTextField2.setText(String.valueOf(rs.getInt(1)));
            }
           
        }catch(SQLException ex){
            Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        //COMANDOS
        try{
            //COMANDO QUE PREPARA
            stmt = con.prepareStatement("select SUM(valor_final) from compra");
            rs=stmt.executeQuery();

            if(rs.next()){
                jTextField3.setText(String.valueOf(rs.getDouble(1)));
            }
           
        }catch(SQLException ex){
            Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
       
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        //COMANDOS
        try{
            //COMANDO QUE PREPARA
            stmt = con.prepareStatement("select Count(cod_barras) from produto");
            rs=stmt.executeQuery();

            if(rs.next()){
                jTextField4.setText(String.valueOf(rs.getInt(1)));
            }
           
        }catch(SQLException ex){
            Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        //COMANDOS
        try{
            //COMANDO QUE PREPARA
            stmt = con.prepareStatement("select Count(id_cliente) from cliente");
            rs=stmt.executeQuery();

            if(rs.next()){
                jTextField1.setText(String.valueOf(rs.getInt(1)));
            }
           
        }catch(SQLException ex){
            Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt, rs);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseReleased
        
    }//GEN-LAST:event_jTextField3MouseReleased

    private void Button_Tela15_ImprimirVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela15_ImprimirVendasMouseClicked
        // TODO add your handling code here:
        MessageFormat Header = new MessageFormat("Vendas do Mês");
        MessageFormat Footer = new MessageFormat("Pagina 1");
        try {

            Tabela_Vendas.print(JTable.PrintMode.NORMAL, Header, Footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Erro de Impressão do Relatorio", e.getMessage());
        }
    }//GEN-LAST:event_Button_Tela15_ImprimirVendasMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_15_User2_Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_15_User2_Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela15_ImprimirVendas;
    private javax.swing.JLabel Button_Tela15_PesquisarVendas;
    private javax.swing.JLabel Button_Tela15_VoltarMenu;
    private javax.swing.JTable Tabela_Vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
