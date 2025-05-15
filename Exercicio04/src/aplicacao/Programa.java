package aplicacao;

import entidade.ConversorDolar;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double precoDolar = scanner.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double quantidade = scanner.nextDouble();

        double valorReal = ConversorDolar.ConversorMoeda(precoDolar, quantidade);

        System.out.printf("Valor a ser pago em reais = %.2f%n", valorReal);

        scanner.close();
    }
}
