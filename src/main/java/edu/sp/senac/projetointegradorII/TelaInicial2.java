/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sp.senac.projetointegradorII;

import javax.swing.ImageIcon;

/**
 *
 * @author vinic
 */
public class TelaInicial2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial2
     */
    public TelaInicial2() {
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

        mnuPrincipal = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        ImnuCliente = new javax.swing.JMenuItem();
        ImnuProduto = new javax.swing.JMenuItem();
        mnuVenda = new javax.swing.JMenu();
        ImnuRealizarVenda = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        ImnuSintetico = new javax.swing.JMenuItem();
        ImnuAnalitico = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        mnuCadastro.setText("Cadastro");

        ImnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente3.png"))); // NOI18N
        ImnuCliente.setText("Cliente");
        ImnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnuClienteActionPerformed(evt);
            }
        });
        mnuCadastro.add(ImnuCliente);

        ImnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto2.png"))); // NOI18N
        ImnuProduto.setText("Produto");
        ImnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnuProdutoActionPerformed(evt);
            }
        });
        mnuCadastro.add(ImnuProduto);

        mnuPrincipal.add(mnuCadastro);

        mnuVenda.setText("Venda");

        ImnuRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda2.png"))); // NOI18N
        ImnuRealizarVenda.setText("Realizar Venda");
        ImnuRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnuRealizarVendaActionPerformed(evt);
            }
        });
        mnuVenda.add(ImnuRealizarVenda);

        mnuPrincipal.add(mnuVenda);

        mnuRelatorios.setText("Relatórios");

        ImnuSintetico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sintetico.png"))); // NOI18N
        ImnuSintetico.setText("Sintético");
        ImnuSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnuSinteticoActionPerformed(evt);
            }
        });
        mnuRelatorios.add(ImnuSintetico);

        ImnuAnalitico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analitico.png"))); // NOI18N
        ImnuAnalitico.setText("Analítico");
        ImnuAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnuAnaliticoActionPerformed(evt);
            }
        });
        mnuRelatorios.add(ImnuAnalitico);

        mnuPrincipal.add(mnuRelatorios);

        jMenu1.setText("Opções");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair (2).png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuPrincipal.add(jMenu1);

        setJMenuBar(mnuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ImnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnuClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImnuClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void ImnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnuProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImnuProdutoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ImnuRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnuRealizarVendaActionPerformed
        // TODO add your handling code here:
        TelaVenda venda = new TelaVenda();
        venda.setVisible(true);
    }//GEN-LAST:event_ImnuRealizarVendaActionPerformed

    private void ImnuSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnuSinteticoActionPerformed
        // TODO add your handling code here:
        TelaRelatorio rel = new TelaRelatorio();
        rel.setVisible(true);
        
    }//GEN-LAST:event_ImnuSinteticoActionPerformed

    private void ImnuAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnuAnaliticoActionPerformed
        // TODO add your handling code here:
        TelaRelatorioAnalitico relAnalitico = new TelaRelatorioAnalitico();
        relAnalitico.setVisible(true);
    }//GEN-LAST:event_ImnuAnaliticoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ImnuAnalitico;
    private javax.swing.JMenuItem ImnuCliente;
    private javax.swing.JMenuItem ImnuProduto;
    private javax.swing.JMenuItem ImnuRealizarVenda;
    private javax.swing.JMenuItem ImnuSintetico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuVenda;
    // End of variables declaration//GEN-END:variables
}
