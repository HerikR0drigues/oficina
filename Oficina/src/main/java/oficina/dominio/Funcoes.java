/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.dominio;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Herik
 */
public class Funcoes {
    public float updateTableInsert(DefaultTableModel model, String codigo, String nome, String qtd, String preco) {
        
        model.addRow(new Object[]{codigo, nome, qtd, preco});
        
        int row = model.getRowCount();
        float precoTotal = 0;
        float precoUnitario = 0;
        int quantidade = 0;

       
        for (int i = 0; i < row; i++) {
            precoUnitario = Float.parseFloat((String) model.getValueAt(i, 3));
            quantidade = Integer.parseInt((String) model.getValueAt(i, 2));     
            precoTotal += precoUnitario*quantidade;
        }
        
        return precoTotal;
        
    }
    
    public float updateTable(DefaultTableModel model) {
        
        int row = model.getRowCount();
        float precoTotal = 0;
        float precoUnitario = 0;
        int quantidade = 0;
       
        
        for (int i = 0; i < row; i++) {
            precoUnitario = (Float) model.getValueAt(i, 3);
            quantidade = (Integer) model.getValueAt(i, 2);     
            precoTotal += precoUnitario*quantidade;
        }
        
        return precoTotal;
        
    }
    
}
