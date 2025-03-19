package Exercicio02;

public class Produto {

    public String Nome;
    public double Preco;
    public int QuantidadeEstoque;

    public void setProduto(String nome, double preco, int quantidade) {
        this.Nome = nome;
        this.Preco = preco;
        this.QuantidadeEstoque = quantidade;

        System.out.printf("Produto\nNome: %s\nPreco: %f\nEstoque: %d");

    }
}
