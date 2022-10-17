/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.model;

import java.util.Date;

/**
 *
 * @author Vinicius Garcia
 */
public class Venda {
    
    private int NVenda;
    private Date DataVenda;
    private String BuscarCliente;
    private String Vendedor;
    private int Estoque;
    private String Produto;
    private int Qtde;
    private double Valor;
    private int Carrinho;
    private double Total;
    private int Cod;
    private String Descricao;
    private int Unid;
    private double PrecoVenda;
    private double TotalUnitario;
    
    public Venda(){
        
    }
    
    public int getNVenda() {
        return NVenda;
    }

    public void setNVenda(int NVenda) {
        this.NVenda = NVenda;
    }

    public Date getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(Date DataVenda) {
        this.DataVenda = DataVenda;
    }

    public String getBuscarCliente() {
        return BuscarCliente;
    }

    public void setBuscarCliente(String BuscarCliente) {
        this.BuscarCliente = BuscarCliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public int getQtde() {
        return Qtde;
    }

    public void setQtde(int Qtde) {
        this.Qtde = Qtde;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getCarrinho() {
        return Carrinho;
    }

    public void setCarrinho(int Carrinho) {
        this.Carrinho = Carrinho;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getUnid() {
        return Unid;
    }

    public void setUnid(int Unid) {
        this.Unid = Unid;
    }

    public double getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(double PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public double getTotalUnitario() {
        return TotalUnitario;
    }

    public void setTotalUnitario(double TotalUnitario) {
        this.TotalUnitario = TotalUnitario;
    }
}
