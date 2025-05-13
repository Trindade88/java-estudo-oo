package aplicacao;

import entidade.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
        afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
        projetada abaixo.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Informe os dados do Funcionario: ");
        System.out.print("Nome: ");
        funcionario.nome = scanner.nextLine();
        System.out.print("Salario: ");
        funcionario.salario_bruto = scanner.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = scanner.nextDouble();

        System.out.println("Dados do funcionario: " + funcionario);

        System.out.println("Informe a porcentagem de aumento do funcionario: ");
        funcionario.Porcentagem(scanner.nextDouble());

        System.out.println();
        System.out.println("Atualização do funcionario: " + funcionario);

        scanner.close();
    }
}
