/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import edu.sp.senac.projetointegradorII.model.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class TelaProdutoDAO {
    public static String url = "jdbc:mysql://localhost:3306/lojainstrumento";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean salvar(Produto obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto (cod_produto,nome,valor,marca,"
                    + "descricao,data_compra,fornecedor,categoria,prateleira,qtd_produto) VALUES(?,?,?,?,?,?,?,?,?,?)");
            comandoSQL.setInt(1,obj.getCodigoProduto());
            comandoSQL.setString(2,obj.getNomeProduto());
            comandoSQL.setInt(3,obj.getValorProduto());
            comandoSQL.setString(4,obj.getMarcaProduto());
            comandoSQL.setString(5,obj.getDescricaoProduto());
            comandoSQL.setInt(6,obj.getDtCompraProduto());
            comandoSQL.setString(7,obj.getFornecedorProd());
            comandoSQL.setString(8,obj.getCategoriaProd());
            comandoSQL.setString(9,obj.getPrateleiraProd());
            comandoSQL.setInt(10,obj.getQuantProd());
            
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    public static ArrayList<Produto> listar(){
        
        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            //Implementar consulta à tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando SQL
            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM Produto");
            
            //Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Produto novoObjeto = new Produto();
                    novoObjeto.setNomeProduto(rs.getString("nomeProduto"));
                    novoObjeto.setValorProduto(rs.getInt("valorProduto"));
                    novoObjeto.setMarcaProduto(rs.getString("marcaProduto"));
                    novoObjeto.setDescricaoProduto(rs.getString("descricaoProduto"));
                    novoObjeto.setDtCompraProduto(rs.getInt("dtCompraProduto"));
                    novoObjeto.setFornecedorProd(rs.getString("fornecedorProd"));
                    novoObjeto.setPrateleiraProd(rs.getString("prateleiraProd"));
                    novoObjeto.setQuantProd(rs.getInt("quantProd"));
                    novoObjeto.setCategoriaProd(rs.getString("categoriaProd"));
                    
                    
                    
                    lista.add(novoObjeto);
                    
                }
            }
            
                    
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }

    public static Produto consultarPorCodProduto(int codigoProduto){
        Produto lista = new Produto();

        //TODO: Implementar consulta à tabela NotaFiscal pelo id

        return lista;
    }

    public static boolean atualizar(Produto obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Produto SET nome=?, valor=?, ,marca=?,"
                    + "descricao=?,data_compra=?,fornecedor=?,categoria=?,prateleira=?,qtd_produto=? WHERE cod_produto = ?");
            
            comandoSQL.setInt(10,obj.getCodigoProduto());
            comandoSQL.setString(1,obj.getNomeProduto());
            comandoSQL.setInt(2,obj.getValorProduto());
            comandoSQL.setString(3,obj.getMarcaProduto());
            comandoSQL.setString(4,obj.getDescricaoProduto());
            comandoSQL.setInt(5,obj.getDtCompraProduto());
            comandoSQL.setString(6,obj.getFornecedorProd());
            comandoSQL.setString(7,obj.getCategoriaProd());
            comandoSQL.setString(8,obj.getPrateleiraProd());
            comandoSQL.setInt(9,obj.getQuantProd());
            comandoSQL.setInt(10,obj.getCodigoProduto());
                       
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }
    
    public static boolean excluir(int codigoProduto){
    
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Produto WHERE cod_produto=?");
            comandoSQL.setInt(1,codigoProduto);            
            
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    
    }
}
