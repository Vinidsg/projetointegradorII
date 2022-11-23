/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

import edu.sp.senac.projetointegradorII.model.Produto;
import edu.sp.senac.projetointegradorII.model.Venda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vinic
 */
public class TelaVendaDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
    static String Login = "root";
    static String Senha = "";
    
    
    public static boolean salvar(Venda obj) {
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Venda (valor, data_venda, cpf, nome) VALUES (?, ?, ?,?)", Statement.RETURN_GENERATED_KEYS);
           
            comandoSQL.setDouble(1, obj.getTotal());
            comandoSQL.setDate(2,new java.sql.Date(obj.getDataVenda().getTime()));
            comandoSQL.setString(3,obj.getBuscarCliente());
            comandoSQL.setString(4,obj.getNomeCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs .next()) {
                    
                    for (Produto item : obj.getListaItens()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO itemVenda (cod_produto, qtd, valor, data_compra, nome, nome_produto) VALUES (?,?,?,?,?,?)");
                        
                        comandoSQLItem.setInt(1, item.getCodigoProduto());
                        comandoSQLItem.setInt(2, item.getQuantProd());
                        comandoSQLItem.setDouble(3,item.getValorProduto());
                        comandoSQLItem.setDate(4, new java.sql.Date (obj.getDataVenda().getTime()));
                        comandoSQLItem.setString(5,obj.getNomeCliente()); 
                        comandoSQLItem.setString(6,item.getNomeProduto()); 

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem>0){
                            retorno = true;
                        }
                    }
                }
            } 
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }   
}