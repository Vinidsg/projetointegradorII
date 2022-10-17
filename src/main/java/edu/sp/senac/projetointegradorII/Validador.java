package edu.sp.senac.projetointegradorII;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Validador {

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
        String text = txt.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim();
               try {
            if (text.equals("")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            cont++;
            txt.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
        }
        
    }

    public void mensagem() {
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado");
            
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }

}
