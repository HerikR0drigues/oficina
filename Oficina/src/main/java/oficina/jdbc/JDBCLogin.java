/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.jdbc;

import java.sql.*;
import static oficina.dominio.Conexao.conectar;

/**
 *
 * @author Herik
 */
public class JDBCLogin {
    private ResultSet rs;
    private Connection con;
    private Statement stm;
    
    public String buscarSenha(String usuario) {
        String senha = null;
        try {
            con = conectar();
            stm = con.createStatement();
            
            String query = "select senha from usuario_senha where usuario = '"+usuario+"';";
            rs = stm.executeQuery(query);
            while(rs.next()){
                senha = rs.getString("senha");                 
            }
            return senha;
        } catch (Exception e) {
            return null;
        }
    }
}
