package aplicacao;

import entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os valores da largura e altura
        de um retângulo. Em seguida, mostrar na tela o valor de
        sua área, perímetro e diagonal. Usar uma classe como
        mostrado no projeto ao lado.
         */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Informe altura e a largura do retangulo: ");
        System.out.print("Altura: ");
        retangulo.altura = scanner.nextDouble();

        System.out.print("Largura: ");
        retangulo.largura = scanner.nextDouble();

        System.out.printf("Area: %.2f%n", retangulo.Area());
        System.out.printf("Perimetro: %.2f%n", retangulo.Perimetro());
        System.out.printf("Diametro: %.2f%n", retangulo.Diametro());

        scanner.close();

    }
}
