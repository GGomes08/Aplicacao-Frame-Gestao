/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.awt.Color;
import teste.Pintar_Cabecalho;

/**
 *
 * @author Refrigeração Josemaq
 */
public class TABELA_0003 extends javax.swing.JFrame {

    /**
     * Creates new form TABELA_000
     */
    public TABELA_0003() {
        initComponents();
        Tabela_DadosLocal.getColumnModel().getColumn(0).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(1).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(2).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(3).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(4).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        Tabela_DadosLocal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane4.setToolTipText("");
        jScrollPane4.setFocusable(false);
        jScrollPane4.setFont(new java.awt.Font("Open Sans Semibold", 0, 16)); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(10, 10));

        Tabela_DadosLocal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabela_DadosLocal.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Tabela_DadosLocal.setForeground(new java.awt.Color(51, 51, 51));
        Tabela_DadosLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "TELEFONE", "CELULAR", "NOME REFERÊNCIA", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_DadosLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_DadosLocal.setDragEnabled(true);
        Tabela_DadosLocal.setEditingColumn(0);
        Tabela_DadosLocal.setEditingRow(0);
        Tabela_DadosLocal.setGridColor(new java.awt.Color(255, 255, 255));
        Tabela_DadosLocal.setIntercellSpacing(new java.awt.Dimension(5, 0));
        Tabela_DadosLocal.setMinimumSize(new java.awt.Dimension(75, 315));
        Tabela_DadosLocal.setRequestFocusEnabled(false);
        Tabela_DadosLocal.setRowHeight(35);
        Tabela_DadosLocal.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela_DadosLocal.setSelectionForeground(new java.awt.Color(10, 174, 239));
        Tabela_DadosLocal.setShowHorizontalLines(false);
        Tabela_DadosLocal.setShowVerticalLines(false);
        Tabela_DadosLocal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tabela_DadosLocalFocusGained(evt);
            }
        });
        Tabela_DadosLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tabela_DadosLocalKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(Tabela_DadosLocal);
        if (Tabela_DadosLocal.getColumnModel().getColumnCount() > 0) {
            Tabela_DadosLocal.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela_DadosLocalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tabela_DadosLocalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_DadosLocalFocusGained

    private void Tabela_DadosLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_DadosLocalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_DadosLocalKeyTyped

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
            java.util.logging.Logger.getLogger(TABELA_0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABELA_0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABELA_0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABELA_0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABELA_0003().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_DadosLocal;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
