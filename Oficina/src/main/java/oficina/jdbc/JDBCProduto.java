/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import oficina.dominio.Cliente;
import static oficina.dominio.Conexao.conectar;
import oficina.dominio.Produto;

/**
 *
 * @author 1072222792
 */
public class JDBCProduto {
    
    private ResultSet rs;
    private Connection con;
    private Statement stm;    
    
    public boolean cadastrarProduto(Produto produto) {
        try {
            con = conectar();
            stm = con.createStatement();
            String sql = "insert into produto(nome, preco) values ('"+produto.getNome()+"', '"+produto.getPreco()+"');";
            stm.executeUpdate(sql);	
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Produto consultarProduto(Produto produto) {
        String nome = null;
        float preco = 0;
        
        try {
            con = conectar();
            stm = con.createStatement();
            
            String query = "select nome, preco from produto where id_produto = '"+produto.getId_produto()+"';";	
            rs = stm.executeQuery(query);
            while(rs.next()){
                nome = rs.getString("nome");
                preco = Float.parseFloat(rs.getString("preco"));
            }
            
            produto.setNome(nome);
            produto.setPreco(preco);
            return produto;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
