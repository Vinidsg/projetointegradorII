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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class TelaClienteDAO {
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public static String url = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean salvar(Cliente obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        //Insert na tela de Cliente
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente ( nome, cpf, data_de_nascimento, email, estado_civil, telefone, sexo, endereco, numero, cep, bairro, UF, cidade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
           
            //comandoSQL.setInt(1, obj.getCod_cliente());
            comandoSQL.setString(1, obj.getNome());
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
    
    public static ArrayList<Cliente> listar() {
        
        Connection conexao = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);            
            
            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM cliente");           
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Cliente novoObj = new Cliente();
                    novoObj.setCod_cliente(rs.getInt("cod_cliente"));
                    novoObj.setNome(rs.getString("nome"));
                    novoObj.setCpf(rs.getString("Cpf"));
                    novoObj.setDataNasc(rs.getDate("data_de_nascimento"));
                    novoObj.setEmail(rs.getString("email"));
                    novoObj.setEstadoCivil(rs.getString("estado_civil"));
                    novoObj.setTel(rs.getString("telefone"));
                    novoObj.setSexo(rs.getString("sexo"));
                    novoObj.setEndereco(rs.getString("endereco"));
                    novoObj.setNumero(rs.getString("numero"));
                    novoObj.setCEP(rs.getString("cep"));
                    novoObj.setBairro(rs.getString("bairro"));
                    novoObj.setUF(rs.getString("UF"));
                    novoObj.setCidade(rs.getString("cidade"));
                    
                    
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
    
    //Atualizar cliente 
    public static boolean atualizar(Cliente obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE cliente SET nome = ?, cpf = ?, data_de_nascimento = ?, email = ?, estado_civil = ?, telefone = ?, sexo = ?, endereco = ?, numero = ?, cep = ?, bairro = ?, UF = ?, cidade  = ? WHERE cod_cliente = ?");
            comandoSQL.setString(1, obj.getNome());
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
            comandoSQL.setInt(14, obj.getCod_cliente());
            
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
    
    public static boolean excluir(int id){
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE cod_cliente = ?");
            comandoSQL.setInt(1,id);            
            
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
