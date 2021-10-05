package Sistema;

import Classes.CaixaPDV;
import Conexao_e_Tabela.Pintar_Cabecalho;
import Model_Bean.Produtos;
import Classes.Ultilidades;
import java.awt.Color;
import java.sql.Connection;
import Conexao.connectionFactory;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela7_Caixa_PDV extends javax.swing.JFrame {

    public int qtd;
    public int linha;
    public int troco;
    public int totalCompra;


    public Tela7_Caixa_PDV() {
        initComponents();

        Tabela_PDV.getColumnModel().getColumn(0).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12), true, Color.WHITE, Color.GRAY));
        Tabela_PDV.getColumnModel().getColumn(1).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12), true, Color.WHITE, Color.GRAY));
        Tabela_PDV.getColumnModel().getColumn(2).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12), true, Color.WHITE, Color.GRAY));
        Tabela_PDV.getColumnModel().getColumn(3).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12), true, Color.WHITE, Color.GRAY));
        Tabela_PDV.getColumnModel().getColumn(4).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12), true, Color.WHITE, Color.GRAY));
        DefaultTableModel modelo = (DefaultTableModel) Tabela_PDV.getModel();
        Tabela_PDV.setRowSorter(new TableRowSorter(modelo));
        Total_Itens.setText("0");
        Total_compra.setText("0");

    }

    public ArrayList<CaixaPDV> CaixaPDV() {
        ArrayList<CaixaPDV> CaixaPDV = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciamento", "root", "");
            String sql = "select nomeproduto,preco_uni from produto where cod_barras =" + Text_Tela7_ADDPRODUTO.getText();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            CaixaPDV pdv;
            while (rs.next()) {
                pdv = new CaixaPDV(rs.getString("nomeproduto"), rs.getDouble("preco_uni"));
                CaixaPDV.add(pdv);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return CaixaPDV;

    }

    public void Mostrar_PDV() {
        ArrayList<CaixaPDV> lista = CaixaPDV();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_PDV.getModel();
        Object[] coluna = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            coluna[0] = Tabela_PDV.getRowCount() + 1;
            coluna[1] = lista.get(i).getNomeproduto();
            coluna[2] = qtd;
            coluna[3] = lista.get(i).getPreco_uni();
            coluna[4] = qtd * lista.get(i).getPreco_uni();
            modelo.addRow(coluna);
        }
    }

    public void Totais() {
        int Item = Tabela_PDV.getRowCount();
        int somarQtd = 0;
        double somarValor = 0;

        for (int i = 0; i < Item; i++) {
            somarQtd += Ultilidades.objectToInt(Tabela_PDV.getValueAt(i, 2));
            somarValor += Ultilidades.objectToDouble(Tabela_PDV.getValueAt(i, 4));
        }
        Total_Itens.setText("" + somarQtd);
        Total_compra.setText("" + somarValor);

    }

    public void TotaisRemove() {
        int Item = Tabela_PDV.getRowCount();
        int somarQtd = 0;
        double somarValor = 0;

        for (int i = 0; i < Item; i++) {
            somarQtd -= Ultilidades.objectToInt(Tabela_PDV.getValueAt(i, 2));
            somarValor -= Ultilidades.objectToDouble(Tabela_PDV.getValueAt(i, 4));
        }
        Total_Itens.setText("" + somarQtd * (-1));
        Total_compra.setText("" + somarValor * (-1));

    }
    public void totalTroco(){
        Text_Tela7_CALCULATROCO.setText("33.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela7_CALCULATROCO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_Tela7_Voltar_Menu = new javax.swing.JLabel();
        Button_Tela7_ADD_PRODUTO = new javax.swing.JLabel();
        Button_Tela7_REMOVE_PRODUTO = new javax.swing.JLabel();
        Button_Tela7_FINALIZACOMPRA = new javax.swing.JLabel();
        Button_Tela7_CANCELACOMPRA = new javax.swing.JLabel();
        Text_Tela7_ADDPRODUTO = new javax.swing.JTextField();
        Text_Tela7_REMOVEPRODUTO = new javax.swing.JTextField();
        Text_Tela7_CALCULATROCO = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabela_PDV = new javax.swing.JTable();
        Total_Itens = new javax.swing.JLabel();
        Total_compra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela7_CALCULATROCO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/tela--7-calculadora.png"))); // NOI18N
        Button_Tela7_CALCULATROCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_CALCULATROCOMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_CALCULATROCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7--HELP.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 30, 30));

        Button_Tela7_Voltar_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7--MENU.png"))); // NOI18N
        Button_Tela7_Voltar_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_Voltar_MenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_Voltar_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 95, 20, 20));

        Button_Tela7_ADD_PRODUTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/tela-7add.png"))); // NOI18N
        Button_Tela7_ADD_PRODUTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_ADD_PRODUTOMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_ADD_PRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 20, 20));

        Button_Tela7_REMOVE_PRODUTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela---7REMOVE.png"))); // NOI18N
        Button_Tela7_REMOVE_PRODUTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_REMOVE_PRODUTOMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_REMOVE_PRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 20, 30));

        Button_Tela7_FINALIZACOMPRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7-Botão-finalizar-Compra.png"))); // NOI18N
        Button_Tela7_FINALIZACOMPRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_FINALIZACOMPRAMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_FINALIZACOMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        Button_Tela7_CANCELACOMPRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7-Botão-Cancelar-Compra.png"))); // NOI18N
        Button_Tela7_CANCELACOMPRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_CANCELACOMPRAMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_CANCELACOMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        Text_Tela7_ADDPRODUTO.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Text_Tela7_ADDPRODUTO.setForeground(new java.awt.Color(102, 102, 102));
        Text_Tela7_ADDPRODUTO.setToolTipText("");
        Text_Tela7_ADDPRODUTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Text_Tela7_ADDPRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, 20));

        Text_Tela7_REMOVEPRODUTO.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Text_Tela7_REMOVEPRODUTO.setForeground(new java.awt.Color(102, 102, 102));
        Text_Tela7_REMOVEPRODUTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Text_Tela7_REMOVEPRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, 20));

        Text_Tela7_CALCULATROCO.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Text_Tela7_CALCULATROCO.setForeground(new java.awt.Color(102, 102, 102));
        Text_Tela7_CALCULATROCO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Text_Tela7_CALCULATROCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, -1));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane4.setToolTipText("");
        jScrollPane4.setFocusable(false);
        jScrollPane4.setFont(new java.awt.Font("Open Sans Semibold", 0, 16)); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(10, 10));

        Tabela_PDV.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabela_PDV.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Tabela_PDV.setForeground(new java.awt.Color(51, 51, 51));
        Tabela_PDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "NOME DO PRODUTO", "QUANT.", "PREÇO UNITÁRIO", "VALOR TOTAL"
            }
        ));
        Tabela_PDV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_PDV.setDragEnabled(true);
        Tabela_PDV.setEditingColumn(0);
        Tabela_PDV.setEditingRow(0);
        Tabela_PDV.setGridColor(new java.awt.Color(255, 255, 255));
        Tabela_PDV.setIntercellSpacing(new java.awt.Dimension(5, 0));
        Tabela_PDV.setMinimumSize(new java.awt.Dimension(75, 315));
        Tabela_PDV.setRequestFocusEnabled(false);
        Tabela_PDV.setRowHeight(35);
        Tabela_PDV.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela_PDV.setSelectionForeground(new java.awt.Color(10, 174, 239));
        Tabela_PDV.setShowHorizontalLines(false);
        Tabela_PDV.setShowVerticalLines(false);
        Tabela_PDV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tabela_PDVFocusGained(evt);
            }
        });
        Tabela_PDV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tabela_PDVKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(Tabela_PDV);
        if (Tabela_PDV.getColumnModel().getColumnCount() > 0) {
            Tabela_PDV.getColumnModel().getColumn(0).setPreferredWidth(5);
            Tabela_PDV.getColumnModel().getColumn(1).setPreferredWidth(100);
            Tabela_PDV.getColumnModel().getColumn(2).setPreferredWidth(5);
            Tabela_PDV.getColumnModel().getColumn(3).setPreferredWidth(5);
            Tabela_PDV.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 590, 170));
        getContentPane().add(Total_Itens, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 30, 30));
        getContentPane().add(Total_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela-7--.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela7_Voltar_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_Voltar_MenuMouseClicked
        //Botão retorna Menu principal
        new Tela3_MenuPrincipalUser1().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela7_Voltar_MenuMouseClicked

    private void Button_Tela7_CANCELACOMPRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_CANCELACOMPRAMouseClicked
        // Cancela a compra e retorna a Forma de pagamento
        new Tela6_Forma_de_Pagamento().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela7_CANCELACOMPRAMouseClicked

    private void Button_Tela7_FINALIZACOMPRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_FINALIZACOMPRAMouseClicked
        new Tela9_Compra_Finalizada().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela7_FINALIZACOMPRAMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Tela7_Help().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Tabela_PDVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tabela_PDVFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_PDVFocusGained

    private void Tabela_PDVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_PDVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_PDVKeyTyped

    private void Button_Tela7_ADD_PRODUTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_ADD_PRODUTOMouseClicked
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
        Mostrar_PDV();
        Totais();
        Text_Tela7_ADDPRODUTO.setText("");
    }//GEN-LAST:event_Button_Tela7_ADD_PRODUTOMouseClicked

    private void Button_Tela7_REMOVE_PRODUTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_REMOVE_PRODUTOMouseClicked
        linha = Integer.parseInt(Text_Tela7_REMOVEPRODUTO.getText());
        ((DefaultTableModel) Tabela_PDV.getModel()).removeRow(linha);
        TotaisRemove();
        Text_Tela7_REMOVEPRODUTO.setText("");
    }//GEN-LAST:event_Button_Tela7_REMOVE_PRODUTOMouseClicked

    private void Button_Tela7_CALCULATROCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_CALCULATROCOMouseClicked
        totalTroco();
    }//GEN-LAST:event_Button_Tela7_CALCULATROCOMouseClicked

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
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela7_Caixa_PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela7_ADD_PRODUTO;
    private javax.swing.JLabel Button_Tela7_CALCULATROCO;
    private javax.swing.JLabel Button_Tela7_CANCELACOMPRA;
    private javax.swing.JLabel Button_Tela7_FINALIZACOMPRA;
    private javax.swing.JLabel Button_Tela7_REMOVE_PRODUTO;
    private javax.swing.JLabel Button_Tela7_Voltar_Menu;
    private javax.swing.JTable Tabela_PDV;
    private javax.swing.JTextField Text_Tela7_ADDPRODUTO;
    private javax.swing.JTextField Text_Tela7_CALCULATROCO;
    private javax.swing.JTextField Text_Tela7_REMOVEPRODUTO;
    private javax.swing.JLabel Total_Itens;
    private javax.swing.JLabel Total_compra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
