/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sp.senac.projetointegradorII;

import edu.sp.senac.projetointegradorII.background.FundoTela;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author vinic
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    FundoTela tela;
    
    public TelaInicial() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("src/main/resources/background/Fundo1.png");
        getContentPane().add(tela);
        //Mudar ícone de tela
        ImageIcon img = new ImageIcon("src/main/resources/icons/musica.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        BarraMenu = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Produto = new javax.swing.JMenuItem();
        Venda = new javax.swing.JMenu();
        RealizarVenda = new javax.swing.JMenuItem();
        Relatorios = new javax.swing.JMenu();
        Sintetico = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        SairDoPrograma = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setMinimumSize(new java.awt.Dimension(700, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cadastro.png"))); // NOI18N
        Cadastro.setText("Cadastro");

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cliente (1).png"))); // NOI18N
        Cliente.setText("Clientes");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        Cadastro.add(Cliente);

        Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produtos.png"))); // NOI18N
        Produto.setText("Produtos");
        Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoActionPerformed(evt);
            }
        });
        Cadastro.add(Produto);

        BarraMenu.add(Cadastro);

        Venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Venda.png"))); // NOI18N
        Venda.setText("Venda");

        RealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/crescimento.png"))); // NOI18N
        RealizarVenda.setText("Realizar Venda");
        RealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaActionPerformed(evt);
            }
        });
        Venda.add(RealizarVenda);

        BarraMenu.add(Venda);

        Relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Relatórios.png"))); // NOI18N
        Relatorios.setText("Relatórios");

        Sintetico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/relatorio.png"))); // NOI18N
        Sintetico.setText("Sintético");
        Sintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinteticoActionPerformed(evt);
            }
        });
        Relatorios.add(Sintetico);

        BarraMenu.add(Relatorios);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sair.png"))); // NOI18N
        Sair.setText("Sair");

        SairDoPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/saida.png"))); // NOI18N
        SairDoPrograma.setText("Sair do Programa");
        SairDoPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoProgramaActionPerformed(evt);
            }
        });
        Sair.add(SairDoPrograma);

        BarraMenu.add(Sair);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(756, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoActionPerformed
        // TODO add your handling code here:
        TelaProduto produto = new TelaProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_ProdutoActionPerformed

    private void RealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarVendaActionPerformed
        // TODO add your handling code here:
        TelaVenda venda = new TelaVenda();
        venda.setVisible(true);
    }//GEN-LAST:event_RealizarVendaActionPerformed

    private void SinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinteticoActionPerformed
        // TODO add your handling code here:
        TelaRelatorioSintetico sintetico = new TelaRelatorioSintetico();
        sintetico.setVisible(true);
    }//GEN-LAST:event_SinteticoActionPerformed

    private void SairDoProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoProgramaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SairDoProgramaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Produto;
    private javax.swing.JMenuItem RealizarVenda;
    private javax.swing.JMenu Relatorios;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenuItem SairDoPrograma;
    private javax.swing.JMenuItem Sintetico;
    private javax.swing.JMenu Venda;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    // End of variables declaration//GEN-END:variables
}
