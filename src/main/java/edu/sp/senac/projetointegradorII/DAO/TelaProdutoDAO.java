/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

<<<<<<< Updated upstream
=======
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.login;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.senha;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.url;
import edu.sp.senac.projetointegradorII.model.Cliente;
import edu.sp.senac.projetointegradorII.model.Produto;
>>>>>>> Stashed changes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
<<<<<<< Updated upstream
import edu.sp.senac.projetointegradorII.model.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
=======
>>>>>>> Stashed changes

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
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto (nome,valor,marca,"
                    + "descricao,data_compra_produto,fornecedor,categoria,prateleira,qtd_produto) VALUES(?,?,?,?,?,?,?,?,?)");
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
                    novoObjeto.setMarcaProduto(rs.getString("marca"));
                    novoObjeto.setDescricaoProduto(rs.getString("descricao"));
                    novoObjeto.setDtCompraProduto(rs.getDate("data_compra_produto"));
                    novoObjeto.setFornecedorProd(rs.getString("fornecedor"));
                    novoObjeto.setPrateleiraProd(rs.getString("prateleira"));
                    novoObjeto.setQuantProd(rs.getInt("qtd_produto"));
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

//    public static ArrayList<Produto> consultarPorNomeMarca() {
//        
//        
//        Connection conexao = null;
//        ArrayList<Produto> lista = new ArrayList<Produto>();
//        
//        try {
//            //Implementar consulta à tabela NotaFiscal
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            //Abrir a conexão
//            conexao = DriverManager.getConnection(url,login,senha);
//            
//            //Criar o comando SQL
//            PreparedStatement comandoSQL =
//            conexao.prepareStatement("SELECT * FROM Produto WHERE =?");
//            
//            //Executar o comando
//            ResultSet rs = comandoSQL.executeQuery();
//            
//            if(rs!=null){
//                while(rs.next()){
//                    Produto novoObjeto = new Produto();
//                    novoObjeto.setCodigoProduto(Integer.parseInt(rs.getString("cod_produto")));
//                    novoObjeto.setNomeProduto(rs.getString("nome"));
//                    novoObjeto.setValorProduto(rs.getDouble("valor"));
//                    novoObjeto.setMarcaProduto(rs.getString("marca"));
//                    novoObjeto.setDescricaoProduto(rs.getString("descricao"));
//                    novoObjeto.setDtCompraProduto(rs.getDate("data_compra_produto"));
//                    novoObjeto.setFornecedorProd(rs.getString("fornecedor"));
//                    novoObjeto.setPrateleiraProd(rs.getString("prateleira"));
//                    novoObjeto.setQuantProd(rs.getInt("qtd_produto"));
//                    novoObjeto.setCategoriaProd(rs.getString("categoria"));
//                    lista.add(novoObjeto);
//                    
//                }
//            }                  
//        } catch (ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        return lista;
//    }
       
    

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
    
<<<<<<< Updated upstream
    }
=======
        public static boolean salvar(Produto obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        //Insert na tela de Cliente
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto ( cod_produto, nome, valor, marca, descricao, data_compra, fornecedor, categoria, prateleira, qtd_produto) VALUES(?,?,?,?,?,?,?,?,?,?)");
           
            comandoSQL.setInt(1, obj.getCodigoProduto());
            comandoSQL.setString(1, obj.());
            comandoSQL.setString(2,obj.getCpf());
            comandoSQL.setDate(3,new java.sql.Date(obj.getDataNasc().getTime()));
            comandoSQL.setString(4,obj.getEmail());
            comandoSQL.setString(5,obj.getEstadoCivil());
            comandoSQL.setString(6,obj.getTel());
            comandoSQL.setString(7,obj.getSexo());
            comandoSQL.setString(8,obj.getEndereco());
            comandoSQL.setString(9,obj.getNumero());
            comandoSQL.setString(10,obj.getCEP());
            comandoSQL.setString(11,obj.getBairro());
            comandoSQL.setString(12,obj.getUF());
            comandoSQL.setString(13,obj.getCidade());
            
            
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
    
    
    
>>>>>>> Stashed changes
}
