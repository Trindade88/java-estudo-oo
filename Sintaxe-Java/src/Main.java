// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double saldoInicial;
        double transacao1;
        double transacao2;
        double transacao3;
        double saldoFinal;

        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Insira o valor do saldo inicial: ");
        saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.print("Inisira o valor da primeira transação: ");
        transacao1 = scanner.nextDouble();

        System.out.print("Inisira o valor da segunda transação: ");
        transacao2 = scanner.nextDouble();

        System.out.print("Inisira o valor da terceira transação: ");
        transacao3 = scanner.nextDouble();
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        saldoFinal = (saldoInicial + (transacao1 + transacao2 + transacao3));

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}