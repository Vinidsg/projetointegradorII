/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

import edu.sp.senac.projetointegradorII.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author vinic
 */
public class TelaClienteDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean salvar(Cliente cli){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO vendas_cliente (nome, cpf, data_de_nascimento, email, telefone, estado_civil, sexo, endereco) VALUES(?,?,?,?,?,?,?,?)");
            comandoSQL.setString(1, cli.getNome());
            comandoSQL.setString(2,cli.getCpf());
            comandoSQL.setString(3,cli.getDataNasc());
            comandoSQL.setString(4,cli.getEmail());
            comandoSQL.setString(5,cli.getTel());
            comandoSQL.setString(6,cli.getEstadoCivil());
            comandoSQL.setString(7,cli.getSexo());
            comandoSQL.setString(8,cli.getEndereco());
            
            
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
