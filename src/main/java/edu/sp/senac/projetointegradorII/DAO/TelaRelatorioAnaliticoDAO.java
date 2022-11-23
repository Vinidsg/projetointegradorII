/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.login;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.senha;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.url;
import edu.sp.senac.projetointegradorII.model.Cliente;
import edu.sp.senac.projetointegradorII.model.Venda;
import edu.sp.senac.projetointegradorII.model.itemVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class TelaRelatorioAnaliticoDAO {
    
    public static ArrayList<itemVenda> listar(String nome) {
        
        Connection conexao = null;
        ArrayList<itemVenda> lista = new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("select nome, data_compra, cod_produto, nome_produto, qtd, valor from itemvenda where nome = ?"); 
            comandoSQL.setString(1, nome);
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    itemVenda novoObj = new itemVenda();
                    novoObj.setCod_procudo(rs.getInt("cod_produto"));
                    novoObj.setValor(rs.getDouble("valor"));
                    novoObj.setQtd(rs.getInt("qtd"));
                    novoObj.setNome_produto(rs.getString("nome_produto"));
                    
                    
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
}
