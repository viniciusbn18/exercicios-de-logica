import java.util.Scanner;

public class ExercicioNumeroDeDias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDias = sc.nextInt();

        int anos = numeroDias / 365;
        int meses = (numeroDias % 365) / 30;
        int dias = ((numeroDias % 365) % 30);

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", anos, meses, dias);
        System.out.println();
        sc.close();
    }
}
