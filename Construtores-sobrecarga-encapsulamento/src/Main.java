import entities.Accunt;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Accunt accunt;

        System.out.print("Entre com o numero da conta: ");
        int numero_conta = scanner.nextInt();

        System.out.print("Entre com o titular da conta: ");
        scanner.nextLine();
        String titular = scanner.nextLine();

        System.out.print("Terá deposito inicial ( s / n )? ");
        char resposta = scanner.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Entre com valor do deposito inicial: ");
            double depositoInicial = scanner.nextDouble();
            accunt = new Accunt(numero_conta, titular, depositoInicial);
        }
        else {
            accunt = new Accunt(titular, numero_conta);
        }

        System.out.println();
        System.out.println();
        System.out.println(accunt);

        System.out.println();
        System.out.print("Entre com o valor do deposito: ");
        double depositoValor = scanner.nextDouble();
        accunt.deposito(depositoValor);
        System.out.println(accunt);

        System.out.println();
        System.out.print("Entre com o valor do saque: ");
        double saqueValor = scanner.nextDouble();
        accunt.saque(saqueValor);
        System.out.println(accunt);




        scanner.close();
    }
}