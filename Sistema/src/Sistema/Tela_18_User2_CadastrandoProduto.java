/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Model_Bean.Produtos;
import Model_DAO.ProdutosDAO;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_18_User2_CadastrandoProduto extends javax.swing.JFrame {
    public static int codBarras;
    public static String nomeProduto;
    public static int qtdProduto;
    public static double precoVenda;
    public static int codBarrasEstoque;

    /**
     * Creates new form Tela_18_User2_CadastrandoProduto
     */
    public Tela_18_User2_CadastrandoProduto() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        Button_Tela18_VoltarMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Button_Tela18_Cadastrar = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 170, -1));

        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 230, -1));

        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 170, -1));

        jTextField5.setForeground(new java.awt.Color(102, 102, 102));
        jTextField5.setBorder(null);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 170, 20));

        jTextField6.setForeground(new java.awt.Color(102, 102, 102));
        jTextField6.setBorder(null);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 170, 20));

        jTextField7.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7.setBorder(null);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 344, 170, -1));

        jTextField8.setForeground(new java.awt.Color(102, 102, 102));
        jTextField8.setBorder(null);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 114, 170, -1));

        jTextField9.setForeground(new java.awt.Color(102, 102, 102));
        jTextField9.setBorder(null);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 170, -1));

        jTextField11.setForeground(new java.awt.Color(102, 102, 102));
        jTextField11.setBorder(null);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 116, 230, -1));

        jTextField12.setForeground(new java.awt.Color(102, 102, 102));
        jTextField12.setBorder(null);
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 230, -1));

        Button_Tela18_VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/Global.png"))); // NOI18N
        Button_Tela18_VoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela18_VoltarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela18_VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Limpar-Campos.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Imprimir-Etiqueta.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        Button_Tela18_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Cadastrar-produto_1.png"))); // NOI18N
        Button_Tela18_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela18_CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela18_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 220, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela18_VoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela18_VoltarMenuMouseClicked
        // TODO add your handling code here:
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela18_VoltarMenuMouseClicked

    private void Button_Tela18_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela18_CadastrarMouseClicked
        Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();

        //passando parametros TABELA 1 
        p.setCod_barras(jTextField8.getText());
        p.setNomeproduto(jTextField9.getText());
        p.setValidade(jTextField5.getText());
        p.setCod_barras_estoque(jTextField13.getText());
        p.setQuantidade(jTextField7.getText());
        p.setEncam_not(jTextField6.getText());
        p.setQtd_not(jTextField1.getText());
        p.setPreco_uni(Double.parseDouble(jTextField11.getText()));
        p.setPreco_venda(Double.parseDouble(jTextField3.getText()));
        p.setLucro(jTextField12.getText());
        p.setId_fornecedores(jTextField4.getText());

        //VALIDANDO
        dao.cadastra(p);

        new Tela_19_User2_ProdutoCadastrado().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela18_CadastrarMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel2.setText(jTextField13.getText());
        jLabel2.setFont(new java.awt.Font("CCodeUPCEANB_HRBS3_Trial", java.awt.Font.PLAIN, 24));
        Tela_18_User2_CadastrandoProduto.codBarras = Integer.parseInt(this.jTextField8.getText());
        Tela_18_User2_CadastrandoProduto.nomeProduto = (this.jTextField9.getText());
        Tela_18_User2_CadastrandoProduto.qtdProduto = Integer.parseInt(this.jTextField7.getText());
        Tela_18_User2_CadastrandoProduto.precoVenda = Double.parseDouble(this.jTextField3.getText());
        Tela_18_User2_CadastrandoProduto.codBarrasEstoque = Integer.parseInt(this.jTextField13.getText());

        //Botão Imprime etiqueta do Produto
        Document docPdf = new Document();
        Date data = new Date();
        try {
            PdfWriter escrito = PdfWriter.getInstance(docPdf, new FileOutputStream("Produto.pdf"));

            docPdf.open();

            docPdf.add(new Paragraph("                                                 ETIQUETA PRODUTO            "));
            docPdf.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph("COD BARRAS           NOME                      QT           (R$)VLU       COD ESTOQUE"));
            docPdf.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph(codBarras + "                 " + nomeProduto + "         " + qtdProduto + "             " + precoVenda + "             " + codBarrasEstoque));
            docPdf.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph("                                              " + data + ""));
            docPdf.add(new Paragraph(""));
            PdfContentByte cb = escrito.getDirectContent();
            Barcode128 codEtiqueta = new Barcode128();
            codEtiqueta.setBarHeight(40f);
            String etiqueta = jTextField13.getText();
            codEtiqueta.setCode(etiqueta);
            com.itextpdf.text.Image codBarras = codEtiqueta.createImageWithBarcode(cb, null, null);
            docPdf.add(new Paragraph(new Chunk(codBarras, 180, -50)));

        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro:" + ex);
        } finally {
            docPdf.close();
        }

        try {
            Desktop.getDesktop().open(new File("Produto.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro:" + ex);
        }

        detalhesImprimi("Produto.pdf");
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Tela_18_User2_CadastrandoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_18_User2_CadastrandoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_18_User2_CadastrandoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_18_User2_CadastrandoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_18_User2_CadastrandoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela18_Cadastrar;
    private javax.swing.JLabel Button_Tela18_VoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
public void detalhesImprimi(String caminhoArquivo) {
        try {
            InputStream imprimi = new ByteArrayInputStream(caminhoArquivo.getBytes());
            DocFlavor docFla = DocFlavor.INPUT_STREAM.AUTOSENSE;
            SimpleDoc docPDF = new SimpleDoc(imprimi, docFla, null);
            PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();

            PrintRequestAttributeSet impriDetalhes = new HashPrintRequestAttributeSet();
            impriDetalhes.add(new JobName("Impressão Etiqueta Produto", null));
            impriDetalhes.add(OrientationRequested.PORTRAIT);
            impriDetalhes.add(MediaSizeName.ISO_A4);

            DocPrintJob printJob = impressora.createPrintJob();

            try {
                printJob.print(docPDF, (PrintRequestAttributeSet) impriDetalhes);

            } catch (PrintException e) {
                JOptionPane.showMessageDialog(null, "A Impressão não pode ser feita", "Falha!", JOptionPane.ERROR_MESSAGE);
            }

            imprimi.close();
        } catch (Exception e) {

        }
    }
}
