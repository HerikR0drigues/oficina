/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.jdbc;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import static oficina.dominio.Conexao.conectar;
/**
 *
 * @author 1072222792
 */
public class JDBCOrdemServico {
    private ResultSet rs;
    private Connection con;
    private Statement stm;
    
    public boolean salvarOrdemServico(DefaultTableModel model, String cpfCliente, int id_produto, int qtd, float preco) {
        int row = model.getRowCount();
        int id_cliente = 0;
        int id_ordem_servico = 0;
        
     try {
            con = conectar();
            stm = con.createStatement();
            
            String query = "select id_cliente from cliente where cpf = '"+cpfCliente+"';";	
            rs = stm.executeQuery(query);
            while(rs.next()){
                id_cliente = rs.getInt("id_cliente");
            }
            
            query = "insert into ordem_servico(id_cliente) values ('"+id_cliente+"');";
            stm.executeUpdate(query);
            
            query = "select max(id_ordem_servico) from ordem_servico";
            rs = stm.executeQuery(query);
            while ( rs.next() ) {
                id_ordem_servico = rs.getInt(1);
            }
            
            for (int i = 0; i < row; i++) {
                query = "insert into ordem_servico_detalhes(id_ordem_servico, id_produto, qtd, preco) values ('"+id_ordem_servico+"', '"+Integer.parseInt((String) model.getValueAt(i, 0))+"', '"+Integer.parseInt((String) model.getValueAt(i, 2))+"', '"+Float.parseFloat((String) model.getValueAt(i, 3))+"');";
                stm.executeUpdate(query);
            }
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        
    }
}
