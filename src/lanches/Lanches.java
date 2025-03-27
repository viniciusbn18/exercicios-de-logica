package lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lanches {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Lanche> listaDeLanches = new ArrayList<>();
        Lanche lancheEscolhido = new Lanche();

        listaDeLanches.add(new Lanche(1, 4.00));
        listaDeLanches.add(new Lanche(2, 4.50));
        listaDeLanches.add(new Lanche(3, 5.00));
        listaDeLanches.add(new Lanche(4, 2.00));
        listaDeLanches.add(new Lanche(5, 1.50));

        System.out.println("Bem vindo");
        System.out.println(" ");

        System.out.println("Digite o código do pedido: ");
        int codigoDigitado = sc.nextInt();
        lancheEscolhido.setId(codigoDigitado);
        sc.nextLine();

        System.out.println("Digite a quantidade de itens: ");
        int quantidadeDigitada = sc.nextInt();
        lancheEscolhido.setQuantity(quantidadeDigitada);
        sc.nextLine();

        if (codigoDigitado > listaDeLanches.size() || codigoDigitado < 1) {
            System.out.println("Produto não existe.");
        } else {
            for (Lanche item : listaDeLanches) {
                if (item.getId().equals(lancheEscolhido.getId())) {
                    double valor = item.getPrice() * lancheEscolhido.getQuantity();
                    System.out.printf("Total: R$ %.2f", valor);
                    break;
                }
            }
        }

        sc.close();
    }
}
