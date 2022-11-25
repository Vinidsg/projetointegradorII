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
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class TelaProdutoDAO {
    public static String url = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
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
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto (nome,valor,marca,descricao,data_compra_produto,fornecedor,categoria,prateleira,qtd_produto) VALUES(?,?,?,?,?,?,?,?,?)");
            //comandoSQL.setInt(1,obj.getCodigoProduto());
            comandoSQL.setString(1,obj.getNomeProduto());
            comandoSQL.setDouble(2,obj.getValorProduto());
            comandoSQL.setString(3,obj.getMarcaProduto());
            comandoSQL.setString(4,obj.getDescricaoProduto());
            comandoSQL.setDate(5,new java.sql.Date(obj.getDtCompraProduto().getTime()));
            comandoSQL.setString(6,obj.getFornecedorProd());
            comandoSQL.setString(7,obj.getCategoriaProd());
            comandoSQL.setString(8,obj.getPrateleiraProd());
            comandoSQL.setInt(9,obj.getQuantProd());
            
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
    
    public static Produto consultarPorID(int ID) {
        Produto produtoRetorno = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE cod_produto = ?");
            comandoSQL.setInt(1, ID);
            
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                if (rs .next()) {
                    produtoRetorno = new Produto();
                    produtoRetorno.setNomeProduto(rs.getString("nome"));
                    produtoRetorno.setValorProduto(rs.getDouble("valor"));
                    produtoRetorno.setQuantProd(rs.getInt("qtd_produto"));
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return produtoRetorno;
        
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
                    novoObjeto.setCodigoProduto(Integer.parseInt(rs.getString("cod_produto")));
                    novoObjeto.setNomeProduto(rs.getString("nome"));
                    novoObjeto.setValorProduto(rs.getDouble("valor"));
                    novoObjeto.setQuantProd(rs.getInt("qtd_produto"));
                    novoObjeto.setMarcaProduto(rs.getString("marca"));
                    novoObjeto.setDescricaoProduto(rs.getString("descricao"));
                    novoObjeto.setDtCompraProduto(rs.getDate("data_compra_produto"));
                    novoObjeto.setFornecedorProd(rs.getString("fornecedor"));
                    novoObjeto.setPrateleiraProd(rs.getString("prateleira"));
                    novoObjeto.setCategoriaProd(rs.getString("categoria"));
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
    
    public static ArrayList<Produto> listarPorArgumento(String tipo, String arg) {
        String argumento = tipo + " " + "like '" + arg + "%'";
        
        Connection conexao = null;
        
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT cod_produto, nome, valor, marca, descricao, data_compra_produto, fornecedor, categoria, prateleira, qtd_produto FROM produto where " + argumento + "");           
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Produto novoObj = new Produto();
                    novoObj.setCodigoProduto(Integer.parseInt(rs.getString("cod_produto")));
                    novoObj.setNomeProduto(rs.getString("nome"));
                    novoObj.setValorProduto(rs.getDouble("valor"));
                    novoObj.setQuantProd(rs.getInt("qtd_produto"));
                    novoObj.setMarcaProduto(rs.getString("marca"));
                    novoObj.setDescricaoProduto(rs.getString("descricao"));
                    novoObj.setDtCompraProduto(rs.getDate("data_compra_produto"));
                    novoObj.setFornecedorProd(rs.getString("fornecedor"));
                    novoObj.setPrateleiraProd(rs.getString("prateleira"));
                    novoObj.setCategoriaProd(rs.getString("categoria"));
                    
                    lista.add(novoObj);
                }
            }
        
            } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
     }

    public static ResultSet listarPorNome (String tipo, String arg) throws SQLException {
        String argumento = tipo + " " + "like '" + arg + "%'";
        
        Connection conexao = null;
        
        PreparedStatement comandoSQL = conexao.prepareStatement("SELECT nome, cpf FROM cliente where " + argumento + "");
//        comandoSQL.setString(1, "%" + Nome + "%");
        ResultSet rs = comandoSQL.executeQuery();
        
        return rs;       
        
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
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Produto SET nome=?, valor=?, marca=?,descricao=?,data_compra_produto=?,fornecedor=?,categoria=?,prateleira=?,qtd_produto=? WHERE cod_produto = ?");
            
            
            comandoSQL.setString(1,obj.getNomeProduto());
            comandoSQL.setDouble(2,obj.getValorProduto());
            comandoSQL.setString(3,obj.getMarcaProduto());
            comandoSQL.setString(4,obj.getDescricaoProduto());
            comandoSQL.setDate(5,new java.sql.Date(obj.getDtCompraProduto().getTime()));
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
    
    public static boolean atualizarEstoque(Produto obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Produto SET qtd_produto = qtd_produto - ? WHERE cod_produto = ?");
            comandoSQL.setInt(1,obj.getQuantProd());
            comandoSQL.setInt(2,obj.getCodigoProduto());
                       
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
