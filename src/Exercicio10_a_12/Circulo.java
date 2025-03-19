package Exercicio10_a_12;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
         return (Math.PI * (raio * raio));
    }
}
