/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Classes.Vendas;
import Conexao_e_Tabela.connectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import teste.Pintar_Cabecalho;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_17_User2_ResultadoBusca extends javax.swing.JFrame {

    /**
     * Creates new form Tela_17_User2_ResultadoBusca
     */
    public Tela_17_User2_ResultadoBusca() {
        initComponents();

        
        Tabela_Busca.getColumnModel().getColumn(0).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Busca.getColumnModel().getColumn(1).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Busca.getColumnModel().getColumn(2).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Busca.getColumnModel().getColumn(3).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Busca.getColumnModel().getColumn(4).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Busca.getColumnModel().getColumn(5).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Busca.getColumnModel().getColumn(6).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
   
    }
    public ArrayList<Vendas> vendasLista(){
        ArrayList<Vendas> vendasLista = new ArrayList<>();
        
        try{
            Connection con = connectionFactory.getConnection();
            Statement st = con.createStatement();
            
            String sql="select id_pagamento,quantidade,valor_final,id_funcionario,id_cliente,cod_barras,data_pagamento from compra inner join pagamento on compra.id_compra=pagamento.id_compra where data_pagamento between '"+data1.getText()+"' and '"+data2.getText()+"'"; 
            ResultSet rs = st.executeQuery(sql);
            Vendas vendas;
            while(rs.next()){
                vendas = new Vendas(rs.getInt("id_pagamento"),rs.getInt("quantidade"),rs.getDouble("valor_final"),rs.getInt("id_funcionario"),rs.getInt("id_cliente"),rs.getString("cod_barras"),rs.getDate("data_pagamento"));
                vendasLista.add(vendas);
            }
        }catch(SQLException ex){
            Logger.getLogger(Tela_17_User2_ResultadoBusca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendasLista;
    }
    public void mostrar_vendas(){
        ArrayList<Vendas> lista = vendasLista();
        DefaultTableModel modelo =(DefaultTableModel) Tabela_Busca.getModel();
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

    public void soma_qtd(){
        int somaQtd = 0;
        for(int i=0; i<Tabela_Busca.getRowCount();i++){
            somaQtd = somaQtd + Integer.parseInt(Tabela_Busca.getValueAt(i, 1).toString());
        }
        jLabel2.setText(Integer.toString(somaQtd));
    }
    
    public void valor_Total(){
        double valorTotal = 0;
        for(int i=0; i<Tabela_Busca.getRowCount();i++){
            valorTotal = valorTotal + Double.parseDouble(Tabela_Busca.getValueAt(i, 2).toString());
        }
        jLabel3.setText(Double.toString(valorTotal));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela17_VoltarMenu = new javax.swing.JLabel();
        Button_Tela17_Imprimi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela_Busca = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        data2 = new javax.swing.JTextField();
        data1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela17_VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/Global.png"))); // NOI18N
        Button_Tela17_VoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela17_VoltarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela17_VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        Button_Tela17_Imprimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Imprimir.png"))); // NOI18N
        Button_Tela17_Imprimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela17_ImprimiMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela17_Imprimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, 40));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 174, 239));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 40, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 174, 239));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 80, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setToolTipText("");
        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Open Sans Semibold", 0, 16)); // NOI18N
        jScrollPane2.setMinimumSize(new java.awt.Dimension(10, 10));

        Tabela_Busca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabela_Busca.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Tabela_Busca.setForeground(new java.awt.Color(51, 51, 51));
        Tabela_Busca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Quantidade", "Preço", "Cliente", "Funcionario", "Produto", "Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Busca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_Busca.setDragEnabled(true);
        Tabela_Busca.setEditingColumn(0);
        Tabela_Busca.setEditingRow(0);
        Tabela_Busca.setGridColor(new java.awt.Color(255, 255, 255));
        Tabela_Busca.setIntercellSpacing(new java.awt.Dimension(5, 0));
        Tabela_Busca.setMinimumSize(new java.awt.Dimension(75, 315));
        Tabela_Busca.setRequestFocusEnabled(false);
        Tabela_Busca.setRowHeight(35);
        Tabela_Busca.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela_Busca.setSelectionForeground(new java.awt.Color(10, 174, 239));
        Tabela_Busca.setShowHorizontalLines(false);
        Tabela_Busca.setShowVerticalLines(false);
        Tabela_Busca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tabela_BuscaFocusGained(evt);
            }
        });
        Tabela_Busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tabela_BuscaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela_Busca);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 530, 140));

        jLabel4.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 21, 51));
        jLabel4.setText("Digite um período (Ex: 2020/11/30 até 2020/12/15)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        data2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        data2.setForeground(new java.awt.Color(0, 174, 239));
        data2.setText("2ª Data");
        data2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        data2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                data2KeyPressed(evt);
            }
        });
        getContentPane().add(data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 100, -1));

        data1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        data1.setForeground(new java.awt.Color(0, 174, 239));
        data1.setText("1ª Data");
        data1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, -1));

        jPanel1.setBackground(new java.awt.Color(0, 174, 239));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 530, 2));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela17_VoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela17_VoltarMenuMouseClicked
        
// TODO add your handling code here:
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela17_VoltarMenuMouseClicked

    private void Button_Tela17_ImprimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela17_ImprimiMouseClicked
        // TODO add your handling code here:
        MessageFormat Header = new MessageFormat("Vendas");
        MessageFormat Footer = new MessageFormat("Pagina 1");
        try {
            
            Tabela_Busca.print(JTable.PrintMode.NORMAL, Header, Footer);
            

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Erro de Impressão da Venda", e.getMessage());
        }
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela17_ImprimiMouseClicked

    private void Tabela_BuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tabela_BuscaFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Tabela_BuscaFocusGained

    private void Tabela_BuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_BuscaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_BuscaKeyTyped

    private void data2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_data2KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            mostrar_vendas();
            soma_qtd();
            valor_Total();
        }
    }//GEN-LAST:event_data2KeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_17_User2_ResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_17_User2_ResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_17_User2_ResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_17_User2_ResultadoBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_17_User2_ResultadoBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela17_Imprimi;
    private javax.swing.JLabel Button_Tela17_VoltarMenu;
    private javax.swing.JTable Tabela_Busca;
    private javax.swing.JTextField data1;
    private javax.swing.JTextField data2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
