package app;

import entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        ✅ 3. Classe Aluno com método
        Atributos: nome, nota1, nota2
        Método: calcularMedia() que retorna a média.
        Crie um aluno, atribua notas e mostre a média.
        */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno, e suas notas: ");
        aluno.nome = scanner.nextLine();
        aluno.nota1 = scanner.nextDouble();
        aluno.nota2 = scanner.nextDouble();

        System.out.println("A media do aluno e: " + aluno.media(aluno.nota1, aluno.nota2));


        scanner.close();
    }
}
