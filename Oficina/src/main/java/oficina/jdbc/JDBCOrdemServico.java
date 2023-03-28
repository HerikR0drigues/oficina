/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.jdbc;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import static oficina.dominio.Conexao.conectar;
import oficina.dominio.OrdemServicoDominio;
import oficina.gui.OrdemServico;
/**
 *
 * @author 1072222792
 */
public class JDBCOrdemServico {
    private ResultSet rs;
    private Connection con;
    private Statement stm;
    
    public boolean salvarOrdemServico(DefaultTableModel model, String cpfCliente) {
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

    public OrdemServicoDominio buscarOrdemServico(int id_ordem_servico) {
        int id_cliente = 0;
        int qtdLinhas;     
        String cpf = null;
        String nome = null;
        
        try {
            con = conectar();
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String query = "select id_cliente from ordem_servico where id_ordem_servico = '"+id_ordem_servico+"';";	
            rs = stm.executeQuery(query);
            while(rs.next()){
                id_cliente = rs.getInt("id_cliente");
            }
            
            query = "select cpf from cliente where id_cliente = '"+id_cliente+"';";	
            rs = stm.executeQuery(query);
            while(rs.next()){
                cpf = rs.getString("cpf");
            }
            
            query = "select nome from cliente where id_cliente = '"+id_cliente+"';";	
            rs = stm.executeQuery(query);
            while(rs.next()){
                nome = rs.getString("nome");
            }
            
            query = "select id_produto, qtd, preco from ordem_servico_detalhes where id_ordem_servico = '"+id_ordem_servico+"';";	
            rs = stm.executeQuery(query);
            rs.last();
            qtdLinhas = rs.getRow();
            int[] id_produto  = new int[qtdLinhas];     
            int[] qtd  = new int[qtdLinhas]; 
            float[] preco  = new float[qtdLinhas];
            String[] nomeProduto  = new String[qtdLinhas]; 
            int i = 0;
            
            rs = stm.executeQuery(query);
            while (rs.next()) {
                id_produto[i] = rs.getInt("id_produto");
                qtd[i] = rs.getInt("qtd");
                preco[i] = rs.getFloat("preco");
                i++;
            }
            
            for (i = 0; i < qtdLinhas; i++) {
                query = "select nome from produto where id_produto = '"+id_produto[i]+"';";	
                rs = stm.executeQuery(query);
                while(rs.next()){
                   nomeProduto[i] = rs.getString("nome");
               }
            }
            
            OrdemServicoDominio ordemServicoDominio = new OrdemServicoDominio(id_ordem_servico, id_cliente, id_produto, qtd, preco, cpf, nome, nomeProduto);
            return ordemServicoDominio;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean verificarOrdemServico(int numOrdemServico) {
        
        try {
            con = conectar();
            stm = con.createStatement();

            String query = "select id_ordem_servico from ordem_servico where id_ordem_servico = '"+numOrdemServico+"';";	
            rs = stm.executeQuery(query);
            
            if(rs.isBeforeFirst()) {
                return true;
            }     
            
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

}

