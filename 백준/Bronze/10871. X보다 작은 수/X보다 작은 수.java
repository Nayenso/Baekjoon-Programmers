import java.io.EOFException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (array[i] < X) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
    }
}