import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = sc.nextInt();
    sc.nextLine();
    long resultado = 1;
    for (int i = 1; i <= numero; i++) {
      resultado = resultado * i;

    }
    System.out.println(resultado);

    sc.close();
  }

}
