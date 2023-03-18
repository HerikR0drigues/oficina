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
    public float updateTable(DefaultTableModel model, String codigo, String nome, String preco) {
        
        model.addRow(new Object[]{codigo, nome, preco});
        
        int row = model.getRowCount();
        float precoTotal = 0;
       
        for (int i = 0; i < row; i++) {
            precoTotal = Float.parseFloat((String) model.getValueAt(i, 2)) + precoTotal;
        }
        
        return precoTotal;
        
    }
    
    public float updatedDeletedRowTable(DefaultTableModel model) {
        
        int row = model.getRowCount();
        float precoTotal = 0;
       
        for (int i = 0; i < row; i++) {
            precoTotal = Float.parseFloat((String) model.getValueAt(i, 2)) + precoTotal;
        }
        
        return precoTotal;
        
    }
    
}
