import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioConsumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaTotal = sc.nextInt();
        double totalCombustivelGasto = sc.nextDouble();
        double consumoMedio = (distanciaTotal / totalCombustivelGasto);
        DecimalFormat formato = new DecimalFormat("#.###");
        String resultadoFormatado = formato.format(consumoMedio);
        System.out.println(resultadoFormatado + " km/l");
        sc.close();
    }
}
