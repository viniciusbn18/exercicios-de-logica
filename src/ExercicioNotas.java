import java.util.Scanner;
import java.util.Locale;

public class ExercicioNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] notas = { 100, 50, 20, 10, 5, 2, 1 };

        System.out.println(N);
        for (int cedula : notas) {
            int divisao = N / cedula;
            System.out.printf("%d notas(s) de %.2f%n", divisao, (double) cedula);
            N = N % cedula;
        }
        sc.close();
    }
}
