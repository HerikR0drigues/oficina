/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.dominio;

/**
 *
 * @author Herik
 */
public class Cliente extends Pessoa {
    private int cd_cliente;
    
    public Cliente(String cpf, String nome, String telefone) {
		super(cpf, nome, telefone);
	}
    
    public int getCd_cliente() {
        return cd_cliente;
    }

    public void setCd_cliente(int cd_cliente) {
        this.cd_cliente = cd_cliente;
    }
}
