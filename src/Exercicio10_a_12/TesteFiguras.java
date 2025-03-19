package Exercicio10_a_12;

public class TesteFiguras {
    public static void main (String[] args) {
        // Instanciando objeto e atribuindo valores
        Circulo circulo = new Circulo(3.0);
        Esfera esfera = new Esfera(5.0);

        // Chamando metodos
        System.out.println("Área do Circulo: " + circulo.calcularArea());
        System.out.println("Volume da Esfera: " + esfera.calcularVolume());
    }
}
