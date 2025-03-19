package Exercicio10_a_12;

public class Esfera {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularVolume(){
        return ((4.0 / 3.0) * Math.PI * (raio * raio * raio));
    }
}
