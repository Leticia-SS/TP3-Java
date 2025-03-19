package Exercicio07_a_09;

public class Conta {
    private String titular;
    private int conta;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int conta, String agencia, double saldo, String data) {
        this.agencia = agencia;
        this.dataAbertura = data;
        this.saldo = saldo;
        this.conta = conta;
        this.titular = titular;
    }

    public double sacar(double valor) {
        this.saldo -= valor;
        return saldo;
    }

    public double depositar(double valor) {
        this.saldo += valor;
        return saldo;
    }

    public double calculaRendimento() {
        this.saldo *= 0.1;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
