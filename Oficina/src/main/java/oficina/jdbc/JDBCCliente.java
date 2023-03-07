/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.jdbc;

import java.sql.*;
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
        String senha = null;
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
}
