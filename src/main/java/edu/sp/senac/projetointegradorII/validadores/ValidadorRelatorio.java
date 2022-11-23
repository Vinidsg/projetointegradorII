/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.validadores;

        

/**
 *
 * @author vinic
 */
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
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
    
    public void ValidarVazioJDC(JDateChooser date){
        
    try {
        if (date.getDate() == null) {
            throw new IllegalArgumentException();
        }
    } catch (IllegalArgumentException e) {
        cont++;
        date.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
    }
}
    
    public void mensagem() {
        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Preencha os dois campos!");
            
        } 
    }
    
    public void findDifference(Date jdcDe, Date jdcAte)
    {

        Date d1 = jdcDe;
        Date d2 = jdcAte;

        long difference_In_Time = d2.getTime() - d1.getTime();
        
        long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
        
        if ((difference_In_Days + 1) <= 30) {
            JOptionPane.showMessageDialog(null, "Relatório gerado!");
        } else {
            JOptionPane.showMessageDialog(null, "Digite um período inferior a 30 dias!\n" + "Quantidade de dias solicitado: " + (difference_In_Days + 1));
        }
    }
    
    public static int objectToInt(Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }
    
    public static double objectToDouble(Object Obj) {
        String Str = Obj.toString();
        double NumDouble = Double.parseDouble(Str);
        return NumDouble;
    }
    
    public static boolean objectToBoolean(Object Obj) {
        String CadBool = objectToString(Obj);
        Boolean bool = Boolean.valueOf(CadBool);
        return bool;
    }
    
    public static String objectToString(Object Obj) {
        String Str = "";
        if (Obj != null) {
            Str = Obj.toString();
        }
        return Str;
    }
    
    
    
    
}
