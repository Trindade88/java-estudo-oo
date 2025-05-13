package aplicacao;

import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Informe os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();

        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantidade = scanner.nextInt();

        System.out.println("Dados do produto : " + produto);

        System.out.println();
        System.out.println("Insira quantidades do produto para adicionar ao estoque: ");
        int quantidade = scanner.nextInt();
        produto.AdicaoProduto(quantidade);

        System.out.println();
        System.out.println("Dados do produto : " + produto);

        System.out.println();
        System.out.println("Insira quantidades do produto para serem removidas do estoque: ");
        quantidade = scanner.nextInt();
        produto.RemoveProduto(quantidade);

        System.out.println();
        System.out.println("Dados do produto : " + produto);

        scanner.close();
    }
}