package Exercicio06;

public class Produto {
    private String Nome;
    private double Preco;
    private int QuantidadeEstoque;

    // Construtor com parametros
    public Produto(String nome, double preco, int quantidade) {
        this.Nome = nome;
        this.Preco = preco;
        this.QuantidadeEstoque = quantidade;
    }

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public double getPreco() {
        return Preco;
    }

    public String getNome() {
        return Nome;
    }
}
