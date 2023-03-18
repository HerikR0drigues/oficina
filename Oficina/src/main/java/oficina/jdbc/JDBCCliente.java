/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.jdbc;

import java.sql.*;
import javax.swing.JOptionPane;
import oficina.dominio.Cliente;
import static oficina.dominio.Conexao.conectar;
/**
 *
 * @author Herik
 */
public class JDBCCliente {
    private ResultSet rs;
    private Connection con;
    private Statement stm;
    
    public boolean cadastrarCliente(Cliente cliente) {
        try {
            con = conectar();
            stm = con.createStatement();
            
            String sql = "insert into cliente(cpf, nome, telefone) values ('"+cliente.getCpf()+"', '"+cliente.getNome()+"', '"+cliente.getTelefone()+"');";
            stm.executeUpdate(sql);	
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Cliente consultarCliente(Cliente cliente) {
        String nome = null;
        String telefone = null;

        try {
            con = conectar();
            stm = con.createStatement();
            
            String query = "select nome, telefone from cliente where cpf = '"+cliente.getCpf()+"';";	
            rs = stm.executeQuery(query);
            while(rs.next()){
                nome = rs.getString("nome");
                telefone = rs.getString("telefone");
            }
            
            cliente.setNome(nome);
            cliente.setTelefone(telefone);
            return cliente;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean updateCliente (Cliente cliente) {
        try {
            con = conectar();
            stm = con.createStatement();
            
            String query = "update cliente set nome = '"+cliente.getNome()+"', telefone = '"+cliente.getTelefone()+"' where cpf = '"+cliente.getCpf()+"';";
            stm.executeUpdate(query);	
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
        public boolean deleteCliente (Cliente cliente) {
        try {
            con = conectar();
            stm = con.createStatement();
            
            String query = "delete from cliente where cpf = '"+cliente.getCpf()+"';";
            stm.executeUpdate(query);	
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
}
