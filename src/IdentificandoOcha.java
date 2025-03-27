
import java.util.Scanner;

public class IdentificandoOcha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] respostas = new int[5];
        int contador = 0;

        int chaFornecido = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < respostas.length; i++) {
            respostas[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int item : respostas) {
            if (item == chaFornecido) {
                contador = contador + 1;
            }
        }

        System.out.println(contador);

        sc.close();
    }
}
