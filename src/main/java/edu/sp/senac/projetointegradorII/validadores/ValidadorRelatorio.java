/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.validadores;

        

/**
 *
 * @author Vinicius Garcia
 */
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
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
