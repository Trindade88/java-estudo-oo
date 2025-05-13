package aplicacao;

import entidades.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        resolver este problema.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Informe o nome do aluno: ");
        estudante.nome = scanner.nextLine();

        System.out.println("Informe as notas do aluno: ");
        System.out.print("Nota 1: ");
        estudante.nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        estudante.nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        estudante.nota3 = scanner.nextDouble();

        System.out.println("O aluno: " + estudante.nome + " teve um total de: " + estudante.notaFinal() + " pontos");
        if (estudante.notaFinal() > 60.00){
            System.out.println("O aluno está APROVADO");
        }
        else {
            System.out.println("O aluno está REPROVADO, faltou: " + estudante.media() + " pontos");
        }
    }
}
