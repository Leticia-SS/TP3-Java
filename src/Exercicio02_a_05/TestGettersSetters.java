package Exercicio02_a_05;

public class TestGettersSetters {
    public static void main(String[] args) {
        // Criar objeto
        Produto produtoTeste = new Produto();

        // Setar e pegar os valores
        produtoTeste.setPreco(89.95);
        System.out.println("Preço: " + produtoTeste.getPreco());

        produtoTeste.setNome("Sapatilha Ballet");
        System.out.println("Nome: " + produtoTeste.getNome());

        produtoTeste.setQuantidadeEstoque(13);
        System.out.println("Estoque: " + produtoTeste.getQuantidadeEstoque());

    }
}
