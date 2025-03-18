package Exercicio01;

public class Animal {
    // Atributos da classe
    public String nome;

    // Isso é um construtor usado para criar objeto e não pode ser chamado
    public Animal() {
        System.out.println("Criamos um animal");
    }

    // Esses sao um metodoa a serem chamados
    public void somDoAnimnal() {
        System.out.println("Cada animal tem seu próprio barulho na Natureza");
    }

    public void setNome(String Nome) {
        this.nome = Nome;
        System.out.println("Seu nome é " + nome);
    }
}
