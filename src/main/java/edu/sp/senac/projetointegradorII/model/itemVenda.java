/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.model;

import java.util.Date;

/**
 *
 * @author vinic
 */
public class itemVenda {
    
    private int idItemVenda;
    private int cod_produto;
    private double valor;
    private int qtd;
    private String nome;
    private Date data_compra;
    private String nome_produto;
    
    public itemVenda() {
        
    }

//    public itemVenda(int cod_produto, double valor, int qtd, String nome, Date data_compra, String nome_produto) {
//        this.cod_produto = cod_produto;
//        this.valor = valor;
//        this.qtd = qtd;
//        this.nome = nome;
//        this.data_compra = data_compra;
//        this.nome_produto = nome_produto;
//    }
    
    public itemVenda(int idItemVenda, int cod_produto, double valor, int qtd, String nome, Date data_compra, String nome_produto) {
        
        this.idItemVenda = idItemVenda;    
        this.cod_produto = cod_produto;
        this.valor = valor;
        this.qtd = qtd;
        this.nome = nome;
        this.data_compra = data_compra;
        this.nome_produto = nome_produto;        
    }
    
    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getCod_procudo() {
        return cod_produto;
    }

    public void setCod_procudo(int cod_procudo) {
        this.cod_produto = cod_procudo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }  
}
