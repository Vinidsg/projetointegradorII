package edu.sp.senac.projetointegradorII.validadores;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class ValidadorCliente {

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
    
    public void ValidarVazioJCB(JComboBox txt) {
        try {
            if ((txt.getSelectedItem().equals("Selecione...")) || (txt.getSelectedItem().equals("-"))) {
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
    
        public void ValidarVazioJDC(JDateChooser date){
        Date text = date.getDate();
               try {
            if (text.equals("")) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            cont++;
            date.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
        }
        
    }

    public void mensagem() {
        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");        
        }
    }
}
