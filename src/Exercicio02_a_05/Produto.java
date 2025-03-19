package Exercicio02_a_05;

public class Produto {

    private String Nome;
    private double Preco;
    private int QuantidadeEstoque;


    public void setProduto(String nome, double preco, int quantidade) {
        this.Nome = nome;
        this.Preco = preco;
        this.QuantidadeEstoque = quantidade;

        System.out.printf("Produto\nNome: %s\nPreco: %f\nEstoque: %d", Nome, Preco, QuantidadeEstoque);

    }

    public void alterarPreco(double preco) {
        this.Preco = preco;
    }

    public void alterarQuantidade(int quantidade) {
        this.QuantidadeEstoque = quantidade;
    }

    public String exibirInformacoes(){
        return "\n\nProduto\nNome: " + Nome + "\nPreco: " + Preco + "\nEstoque: " + QuantidadeEstoque;
    }

    // Adicionando os getters
    public String getNome() {
        return this.Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    // Adicionando os setters
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        QuantidadeEstoque = quantidadeEstoque;
    }

}
