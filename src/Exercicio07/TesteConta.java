package Exercicio07;

public class TesteConta {
    public static void main(String[] args) {
        // Criando objketo com parametros
        Conta conta = new Conta("Leticia Saraiva", 98, "Itau", 756.27, "09/08/2018");

        // Chamando metodos e printando os valores
        System.out.println("Saldo Atual: " + conta.getSaldo());
        System.out.println("Valor Após Saque: " + conta.sacar(100));
        System.out.println("Valor após Depósito: " + conta.depositar(200.73));
        System.out.println("Rendimento Atual: " + conta.calculaRendimento());


    }
}
