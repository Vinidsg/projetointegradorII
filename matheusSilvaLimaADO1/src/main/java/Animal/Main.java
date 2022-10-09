/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Matheus Lima
 */
public class Main 
{
  public static void main(String[] args) 
    {
        Minhoca minhoca = new Minhoca();
        
        System.out.println("Características do animal minhoca:");
        System.out.println();
        System.out.println("Nome científico: " + minhoca.getNomeCientifico());
        System.out.println("Filo pertencente: " + minhoca.getFilo());
        System.out.println("Tamanho médio das minhocas: " + minhoca.getTamanho() + "cm");
        System.out.println();
        System.out.println("Algumas minhocas podem chegar a: " + minhoca.setTamanho(35.5)+ "cm");


    }  
}
