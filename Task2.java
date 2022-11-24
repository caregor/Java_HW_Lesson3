import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int[] massive1 = new int[20];
        int[] massive2 = new int[10];
        int[] massive3 = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < massive1.length; i++) {
            massive1[i] = input.nextInt();
        }
        massive1 = Arrays.stream(massive1).sorted().toArray();
        for (int i = 0; i < massive1.length; i++) {
            if (i < massive1.length / 2) {
                massive2[i] = massive1[i];
            } else {
                massive3[i - massive1.length / 2] = massive1[i];
            }
        }
        Helpers.PrintMassive(massive3);
        Helpers.PrintMassive(massive2);

    }
}
