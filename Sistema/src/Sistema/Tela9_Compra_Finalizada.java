package Sistema;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import static java.awt.Frame.MAXIMIZED_BOTH;
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

public class Tela9_Compra_Finalizada extends javax.swing.JFrame {
    int item1=1;
    String nome1="Coca-Cola Água gaseificada";
    int qtd1=2;
    double valorUni1=3.00;
    double valorTotal1=qtd1*valorUni1;
    int item2=2;
    String nome2="QUERO Molho de Tomate";
    int qtd2=2;
    double valorUni2=2.50;
    double valorTotal2=qtd2*valorUni2;
    int item3=3;
    String nome3="Colgate Pasta de Dente";
    int qtd3=2;
    double valorUni3=1.50;
    double valorTotal3=qtd3*valorUni3;
    int item4=4;
    String nome4="Nescau Leite com Chocolate";
    int qtd4=1;
    double valorUni4=3.00;
    double valorTotal4=qtd4*valorUni4;
    double totalCompra=valorTotal1+valorTotal2+valorTotal3+valorTotal4;

    public Tela9_Compra_Finalizada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_ImprimiCupom = new javax.swing.JLabel();
        Button_Tela9_VoltaCaixa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_ImprimiCupom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7.1.png"))); // NOI18N
        Button_ImprimiCupom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ImprimiCupomMouseClicked(evt);
            }
        });
        getContentPane().add(Button_ImprimiCupom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        Button_Tela9_VoltaCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7.2.png"))); // NOI18N
        Button_Tela9_VoltaCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela9_VoltaCaixaMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela9_VoltaCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela-7.1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela9_VoltaCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela9_VoltaCaixaMouseClicked
        // Botão da tela de finalizar compras
        new Tela6_Forma_de_Pagamento(). setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela9_VoltaCaixaMouseClicked

    private void Button_ImprimiCupomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ImprimiCupomMouseClicked
        //Botão Imprime cupom
      Document docPdf = new Document();
      Date data = new Date();
      int extrato = (int)(Math.random()*999999+1);
      
        try {
        PdfWriter escrito =  PdfWriter.getInstance(docPdf,new FileOutputStream("NotaFiscal.pdf"));
        
            docPdf.open();
            docPdf.add(new Paragraph("                                          MERCADO DO SEU JORGE         "));
            docPdf.add(new Paragraph("                       Rua Augusto Avelino de Morais, 431 - Pq das Cerejeiras"));
            docPdf.add(new Paragraph("                                          04966-140 - São Paulo - SP      "));
            docPdf.add(new Paragraph("                         CNPJ:76.473.091/4506-12     IE:873542678913"));
            docPdf.add(new Paragraph("---------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph("                                               Extrato No.:"+extrato+"              "));
            docPdf.add(new Paragraph("                                                   NOTA FISCAL             "));
            docPdf.add(new Paragraph("---------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph("ITEM  NOME                                            QT                    (R$)VLU       (R$)VLT"));
            docPdf.add(new Paragraph("---------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph(item1  +"        "+ nome1 +"            "+qtd1+"                          "+valorUni1+"                  "+valorTotal1));
            docPdf.add(new Paragraph(item2  +"        "+ nome2 +"               "+qtd2+"                          "+valorUni2+"                  "+valorTotal2));
            docPdf.add(new Paragraph(item3  +"        "+ nome3 +"                   "+qtd3+"                          "+valorUni3+"                  "+valorTotal3));
            docPdf.add(new Paragraph(item4  +"        "+ nome4 +"           "+qtd4+"                          "+valorUni4+"                  "+valorTotal4));
            docPdf.add(new Paragraph("---------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph("TOTAL"+"                                                                                                         "+totalCompra));
            docPdf.add(new Paragraph("DESCONTO"+"                                                                                                 "+"0,00"));
            docPdf.add(new Paragraph("TOTAL"+"                                                                                                         "+totalCompra));
            docPdf.add(new Paragraph("---------------------------------------------------------------------------------------------------------"));
            docPdf.add(new Paragraph("                                          OBRIGADO E VOLTE SEMPRE        "));
            docPdf.add(new Paragraph("                                           "+data+""));
            docPdf.add(new Paragraph(""));
            PdfContentByte cb = escrito.getDirectContent();
            Barcode128 codEtiqueta = new Barcode128();
            codEtiqueta.setBarHeight(35f);
            codEtiqueta.setCode("62408531456792804392010000495762133450965839411");
            com.itextpdf.text.Image codBarras = codEtiqueta.createImageWithBarcode(cb, null, null);
            docPdf.add(new Paragraph(new Chunk(codBarras, 105, -50)));

            
            
       } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro:"+ex);
        }finally{
            docPdf.close();
        }
      
        try {
            Desktop.getDesktop().open(new File("NotaFiscal.pdf"));
        } catch (IOException ex) {
           System.out.println("Erro:"+ex);
        }
        
        detalhesImprimi("NotaFiscal.pdf");
        new Tela3_MenuPrincipalUser1().setVisible(true);
        dispose();
      
    }//GEN-LAST:event_Button_ImprimiCupomMouseClicked

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
            java.util.logging.Logger.getLogger(Tela9_Compra_Finalizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela9_Compra_Finalizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela9_Compra_Finalizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela9_Compra_Finalizada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela9_Compra_Finalizada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_ImprimiCupom;
    private javax.swing.JLabel Button_Tela9_VoltaCaixa;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
public void detalhesImprimi(String caminhoArquivo){
    try{
        InputStream imprimi = new ByteArrayInputStream(caminhoArquivo.getBytes());
        DocFlavor docFla = DocFlavor.INPUT_STREAM.AUTOSENSE;
        SimpleDoc docPDF = new SimpleDoc(imprimi,docFla,null);
        PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();
        
        PrintRequestAttributeSet impriDetalhes = new HashPrintRequestAttributeSet();
        impriDetalhes.add(new JobName("Impressão da Nota Fiscal",null));
        impriDetalhes.add(OrientationRequested.PORTRAIT);
        impriDetalhes.add(MediaSizeName.ISO_A4);
        
        DocPrintJob printJob = impressora.createPrintJob();
        
        try{
            printJob.print(docPDF,(PrintRequestAttributeSet) impriDetalhes);
            
        }catch(PrintException e) {
            JOptionPane.showMessageDialog(null,"A Impressão não pode ser feita","Falha!",JOptionPane.ERROR_MESSAGE);
        }
        
        imprimi.close();
    }catch (Exception e){
        
    }
    

    }
}
