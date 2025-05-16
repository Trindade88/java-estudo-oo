package app;

import entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        ✅ 2. Classe Produto
        Atributos: nome, preco
        Crie 2 produtos diferentes.
        Mostre os valores de cada um no terminal.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produto prod1 = new Produto();
        Produto prod2 = new Produto();

        System.out.println("Informe a descricao do produto 1 e seu preco: ");
        prod1.nome = scanner.nextLine();
        prod1.preco = scanner.nextDouble();

        scanner.nextLine(); // limpa o ENTER pendente

        System.out.println("Informe a descricao do produto 2 e seu preco: ");
        prod2.nome = scanner.nextLine();
        prod2.preco = scanner.nextDouble();

        System.out.printf("Descricao produto 1: %s e seu preco: R$ %.2f%n", prod1.nome, prod1.preco);
        System.out.printf("Descricao produto 2: %s e seu preco: R$ %.2f%n", prod2.nome, prod2.preco);

        scanner.close();

    }
}
