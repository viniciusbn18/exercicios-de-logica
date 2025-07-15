import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            listOfNumbers.add(sc.nextInt());
            sc.nextLine();
        }

        listOfNumbers.stream().sorted().forEach(System.out::println);
        System.out.println();
        listOfNumbers.forEach(System.out::println);

    }
}
