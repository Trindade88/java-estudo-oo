package app;

import entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        ✅ 4. Classe Funcionario com atributo estático
        Atributos: nome, salario
        Atributo estático: empresa
        Crie 2 funcionários.
        Mostre que ambos têm a mesma empresa (sem usar o objeto para acessar empresa).
        */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        System.out.println("Informe o nome do funcionario 1: ");
        funcionario1.nome = scanner.nextLine();

        System.out.println("Informe o nome do funcionario 2: ");
        funcionario2.nome = scanner.nextLine();

        System.out.println("Os funcionarios, " + funcionario1.nome + " e, " + funcionario2.nome);
        System.out.println("Ambos trabalham na " + Funcionario.empresa);


        scanner.close();
    }
}
