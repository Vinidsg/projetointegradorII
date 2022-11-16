/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

import edu.sp.senac.projetointegradorII.model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author vinic
 */
public class TelaClienteDAO {
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public static String url = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean salvar(Cliente obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome, cpf, data_de_nascimento, email, estado_civil, telefone, sexo, endereco, numero, cep, bairro, UF, cidade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2,obj.getCpf());
            comandoSQL.setString(3,sdf.format(obj.getDataNasc()));
            comandoSQL.setString(4,obj.getEmail());
            comandoSQL.setString(5,obj.getTel());
            comandoSQL.setString(6,obj.getEstadoCivil());
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
    
}
