/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina.dominio;

/**
 *
 * @author Herik
 */
public class OrdemServicoDominio {
    private int id_ordem_servico;
    private int id_cliente;
    private int id_produto[];
    private int qtd[];
    private float preco[];
    private String cpf;
    private String nome;
    private String nomeProduto[];
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public OrdemServicoDominio(int id_ordem_servico, int id_cliente, int id_produto[], int qtd[], float preco[], String cpf, String nome, String nomeProduto[]) {
        this.id_ordem_servico = id_ordem_servico;
        this.id_cliente = id_cliente;
        this.id_produto = id_produto;
        this.qtd = qtd;
        this.preco = preco;
        this.cpf = cpf;
        this.nome = nome;
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto(int i) {
        return nomeProduto[i];
    }

    public void setNomeProduto(String[] nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_produtoLength() {
        return id_produto.length;
    }
    
    public int getId_ordem_servico() {
        return id_ordem_servico;
    }

    public void setId_ordem_servico(int id_ordem_servico) {
        this.id_ordem_servico = id_ordem_servico;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_produto(int i) {
        return id_produto[i];
    }

    public void setId_produto(int[] id_produto) {
        this.id_produto = id_produto;
    }

    public int getQtd(int i) {
        return qtd[i];
    }

    public void setQtd(int[] qtd) {
        this.qtd = qtd;
    }

    public float getPreco(int i) {
        return preco[i];
    }

    public void setPreco(float[] preco) {
        this.preco = preco;
    }
    
}

