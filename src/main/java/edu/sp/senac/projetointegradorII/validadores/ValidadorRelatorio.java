/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.validadores;

        

/**
 *
 * @author vinic
 */
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;



public class ValidadorRelatorio {
    private int cont = 0;
    
    public void ValidarDataMes(JFormattedTextField txt){
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
        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Preencha os dois campos!");
            
        } 
    }
    
    public void findDifference(String txtDe, String txtAte)
    {
  
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
  
        // Try Block
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(txtDe);
            Date d2 = sdf.parse(txtAte);
  
            // Calucalte time difference
            // in milliseconds
            long difference_In_Time = d2.getTime() - d1.getTime();
           
            long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
            
            if ((difference_In_Days + 1) <= 30) {
                JOptionPane.showMessageDialog(null, "Relatório gerado!");
            } else {
                JOptionPane.showMessageDialog(null, "Digite um período inferior a 30 dias!\n" + "Quantidade de dias solicitado: " + (difference_In_Days + 1));
            }
            
                

        }
  
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    
}
