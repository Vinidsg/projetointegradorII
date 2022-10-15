/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sp.senac.projetointegradorII;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

/**
 *
 * @author vinicius
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
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

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jcbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jcbUF = new javax.swing.JComboBox<>();
        txtTel = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtN = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Busca:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaKeyTyped(evt);
            }
        });
        jPanel1.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 457, -1));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 52, -1));

        jLabel2.setText("Nome:*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setText("CPF:*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel6.setText("E-mail:*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtNome.setToolTipText("Digite o Nome do Cliente");
        txtNome.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                txtNomeComponentResized(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 136, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 136, -1));

        jLabel8.setText("Endereço:*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel9.setText("Bairro:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 136, -1));

        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBairroKeyTyped(evt);
            }
        });
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 136, -1));

        jLabel10.setText("Cidade:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCidadeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 137, -1));

        jLabel12.setText("CEP:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        btnExcluir.setText("Excluir");
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 34));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, 34));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 127, -1));

        jLabel14.setText("Estado Civil:*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro (a)", "Casado (a)", "Divorciado (a)" }));
        jcbEstadoCivil.setSelectedIndex(1);
        jcbEstadoCivil.setToolTipText("");
        jcbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoCivilActionPerformed(evt);
            }
        });
        jPanel1.add(jcbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel15.setText("Data de Nascimento:*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 137, -1));

        jLabel16.setText("Telefone:*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel17.setText("Número:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel18.setText("UF:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jcbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " AC", " AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RJ", " RN", " RS", " RO", " RR", " SC", " SP", " SE", " TO" }));
        jcbUF.setSelectedIndex(1);
        jcbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUFActionPerformed(evt);
            }
        });
        jPanel1.add(jcbUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 137, -1));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 81, -1));

        try {
            txtN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });
        jPanel1.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 80, -1));

        jLabel3.setText("Sexo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        bgSexo.add(jRadioButton3);
        jRadioButton3.setText("Masculino");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        bgSexo.add(jRadioButton4);
        jRadioButton4.setText("Feminino");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    	Validador validar = new Validador();
    	
    	//Validação dos campos obrigatorios
    	validar.ValidarVazio(txtNome);
        validar.ValidarVazio(txtEmail);
        validar.ValidarVazio(txtEndereco);
        validar.ValidarVazio(txtBairro);
        validar.ValidarVazio(txtCidade);
        validar.ValidarVazioJ(txtCPF);
        validar.ValidarVazioJ(txtDataNascimento);
        validar.ValidarVazioJ(txtTel);
        validar.ValidarVazioJ(txtCEP);
        validar.ValidarVazioJ(txtN);
        validar.mensagem();
        
    	
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void jcbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoCivilActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void jcbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbUFActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

    private void txtNomeComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtNomeComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeComponentResized

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        if(txtNome.getText().length()>=30){
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (!((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        if(txtEmail.getText().length()>=30){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyTyped
        // TODO add your handling code here:
        if(txtEndereco.getText().length()>=40){
            evt.consume();
        }
    }//GEN-LAST:event_txtEnderecoKeyTyped

    private void txtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyTyped
        // TODO add your handling code here:
        if(txtBairro.getText().length()>=30){
            evt.consume();
        }
        
        char c = evt.getKeyChar();
        if (!((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtBairroKeyTyped

    private void txtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyTyped
        // TODO add your handling code here:
        if(txtCidade.getText().length()>=30){
            evt.consume();
        }
        
        char c = evt.getKeyChar();
        if (!((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCidadeKeyTyped

    private void txtBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyTyped
        // TODO add your handling code here:
        if(txtBusca.getText().length()>=30){
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscaKeyTyped

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JComboBox<String> jcbEstadoCivil;
    private javax.swing.JComboBox<String> jcbUF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtN;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
