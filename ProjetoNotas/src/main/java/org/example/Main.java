package org.example;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Maria", 85);
        System.out.println("Estudante: " + estudante1.getNome());
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante1));
        System.out.println();

        Estudante estudante2 = new Estudante("João", 95);
        System.out.println("Estudante: " + estudante2.getNome());
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante2));
        System.out.println();

        Estudante estudante3 = new Estudante("Pedro", 40);
        System.out.println("Estudante: " + estudante3.getNome());
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante3));
        System.out.println();

        Estudante estudante4 = new Estudante("Ana", 20);
        System.out.println("Estudante: " + estudante4.getNome());
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante4));
        System.out.println();

        // Exemplo com nota inválida
        Estudante estudante5 = new Estudante("Carlos", 150);
        System.out.println("Estudante: " + estudante5.getNome());
        System.out.println(AvaliadorDeNotas.avaliarEstudante(estudante5));
    }
}
