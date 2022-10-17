/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.model;

/**
 *
 * @author Vinicius Lima
 */
public class Cliente {
    private String Nome;
    private String Cpf;
    private String Endereco;
    private String Tel;
    private String Bairro;
    private String CEP;
    private String Cidade;
    private String Email;
    private int Numero;
    private String Buscar;
    
    public Cliente(){
        
    }
    
    public String getBuscar(){
        return Buscar;
    }
    
    public void setBuscar(String Buscar){
        this.Buscar = Buscar;
    }
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    
    public String getCpf(){
        return Cpf;
    }
    
    public void setCpf(String Cpf){
        this.Cpf = Cpf;
    }
    
    public String getEndereco(){
        return Endereco;
    }
    
    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
    }
    
    public String getTel(){
        return Tel;
    }
    
    public void setTel(String Tel){
        this.Tel = Tel;
    }
    
    public String getBairro(){
        return Bairro;
    }
    
    public void setBairro(String Bairro){
        this.Bairro = Bairro;
    }
    
    public String getCEP(){
        return CEP;
    }
    public void setCEP(String CEP){
        this.CEP = CEP;
    }
    
    public String getCidade(){
        return Cidade;
    }
    
    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public int getNumero(){
        return Numero;
    }
    
    public void setNumero(int Numero){
        this.Numero = Numero;
    }
}
