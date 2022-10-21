/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.validadores;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vinic
 */
public class ValidadorProduto {
        private int cont;

    public void ValidarVazio(JTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            cont++;
            txt.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
        }
    }
    
    public void ValidarVazioJ(JFormattedTextField txt){
        String text = txt.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").replace(",", "").trim();
               try {
            if (text.equals("")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            cont++;
            txt.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
        }
        
    }
    
        public void ValidarVazioJCB(JComboBox txt) {
        try {
            if (txt.getSelectedItem().equals("Selecione...")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            cont++;
            txt.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
        }
    }

    public void mensagem() {
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Produto cadastrado!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    
}
