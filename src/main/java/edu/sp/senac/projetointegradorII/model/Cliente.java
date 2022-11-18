/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.model;

import java.util.Date;

/**
 *
 * @author Vinicius Lima
 */
public class Cliente {
    private int codCliente;
    private String Nome;
    private String Cpf;
    private Date dataNasc;
    private String Email;
    private String EstadoCivil;
    private String Tel;    
    private String Sexo;
    private String Endereco;
    private String Numero;    
    private String CEP;
    private String Bairro;
    private String UF;
    private String Cidade;
    private String Buscar;

    public Cliente(){     
    }

    public Cliente(String Nome, String Cpf, Date dataNasc, String Email, String EstadoCivil, String Tel, String Sexo, String Endereco, String Numero, String CEP, String Bairro, String UF, String Cidade) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.dataNasc = dataNasc;
        this.Email = Email;
        this.EstadoCivil = EstadoCivil;
        this.Tel = Tel;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.CEP = CEP;
        this.Bairro = Bairro;
        this.UF = UF;
        this.Cidade = Cidade;       
    }
    
        public Cliente(int cod_cliente, String Nome, String Cpf, Date dataNasc, String Email, String EstadoCivil, String Tel, String Sexo, String Endereco, String Numero, String CEP, String Bairro, String UF, String Cidade) {
        
        this.codCliente = cod_cliente;    
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.dataNasc = dataNasc;
        this.Email = Email;
        this.EstadoCivil = EstadoCivil;
        this.Tel = Tel;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.CEP = CEP;
        this.Bairro = Bairro;
        this.UF = UF;
        this.Cidade = Cidade;   
    }

    public int getCod_cliente() {
        return codCliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.codCliente = cod_cliente;
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
    
    public String getNumero(){
        return Numero;
    }
    
    public void setNumero(String Numero){
        this.Numero = Numero;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }    
}