package busca_internet;

import java.util.Scanner;

public class BuscaNaInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoasTerceiroLink = sc.nextInt();
        sc.nextLine();

        int pessoasPrimeiroLink = 4 * pessoasTerceiroLink;

        System.out.println(pessoasPrimeiroLink);
    }
}
