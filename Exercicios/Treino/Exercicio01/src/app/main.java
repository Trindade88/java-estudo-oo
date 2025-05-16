package app;

import Entidade.Pessoa;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        Exercícios de Java – Classes e Membros
        ✅ 1. Crie uma classe Pessoa
        Com atributos: nome e idade
        Crie um objeto da classe e imprima os dados no main.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Insira o nome da pessoa: ");
        pessoa.nome = scanner.nextLine();

        System.out.println("Insira a idade da pessoa: ");
        pessoa.idade = scanner.nextInt();

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);

        scanner.close();
    }
}
