/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.DAO;

import com.toedter.calendar.JDateChooser;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.login;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.senha;
import static edu.sp.senac.projetointegradorII.DAO.TelaClienteDAO.url;
import edu.sp.senac.projetointegradorII.model.Cliente;
import edu.sp.senac.projetointegradorII.model.Venda;
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
public class TelaRelatorioSinteticoDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
    static String Login = "root";
    static String Senha = "";
    
    public static ArrayList<Venda> listar(Date jdcDe, Date jdcAte) {
        
        Connection conexao = null;
        ArrayList<Venda> lista = new ArrayList<Venda>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);            
            
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from Venda where data_venda between ? and ?");           
            comandoSQL.setDate(1,  new java.sql.Date(jdcDe.getTime()));
            comandoSQL.setDate(2,  new java.sql.Date(jdcAte.getTime()));
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Venda novoObj = new Venda();
                    novoObj.setNVenda(rs.getInt("cod_venda"));
                    novoObj.setNomeCliente(rs.getString("nome"));
                    novoObj.setDataVenda(rs.getDate("data_venda"));
                    novoObj.setValor(rs.getDouble("valor"));
                    
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
