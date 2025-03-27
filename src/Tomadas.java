import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] quantidadeDeTomadas = new int[4];
        int soma = 0;

        for (int i = 0; i < quantidadeDeTomadas.length; i++) {
            int quantidadeDigitada = sc.nextInt();
            quantidadeDeTomadas[i] = quantidadeDigitada - 1;
        }

        for (int item : quantidadeDeTomadas) {
            soma = soma + item;
        }

        int total = soma + 1;

        System.out.println(total);

    }
}
