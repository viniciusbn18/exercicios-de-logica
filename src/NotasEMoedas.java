import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int cedula : notas) {
            int quantidadeDeNotas = (int) (valor / cedula);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeDeNotas, (double) cedula);
            valor = valor % cedula;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeDeMoedas = (int) (valor / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeDeMoedas, moeda);
            valor = valor % moeda;
        }
        sc.close();
    }
}
