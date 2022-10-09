/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Matheus Lima
 */
public class Minhoca 
{
    private String nomeCientifico;
    private double tamanho;
    private String filo;
    
    //------------------- Construtor sem parâmetro --------------------//
    public Minhoca()
    {
        
    }
    //------------------- Construtor com parâmetro --------------------//
    public Minhoca(String nomeCientifico, double tamanho, String filo) 
    {
        this.nomeCientifico = nomeCientifico;
        this.tamanho = tamanho;
        this.filo = filo;
    }

    //------------------- Métodos 'GETS' --------------------//

    public String getNomeCientifico() {
        return nomeCientifico = "Lumbricina";
    }

    public double getTamanho() {
        return tamanho = 30.0;
    }

    public String getFilo() {
        return filo = "Anelídeo";
    }
    
        //------------------- Métodos 'SETS' --------------------//

    public void setNomeCientifico(String nomeCientifico) 
    {
        this.nomeCientifico = nomeCientifico;
    }

    public double setTamanho(double tamanho) 
    {
        return tamanho;
    }

    public void setFilo(String filo) 
    {
        this.filo = filo;
    }

}
