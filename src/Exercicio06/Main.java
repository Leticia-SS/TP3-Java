package Exercicio06;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Samsung S25", 2799.99, 5);

        // Pegar com get os valores
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidadeEstoque());

    }
}
