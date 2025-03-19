package Exercicio02_a_05;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setProduto("All Star", 199.90, 57);

        // Alterar preco e quantidade e exibir informacopes
        produto.alterarPreco(299.90);
        produto.alterarQuantidade(100);
        System.out.println(produto.exibirInformacoes());

    }
}
