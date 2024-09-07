import java.io.EOFException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        int max = array[0], min = array[0];
        for (int i = 1; i < N; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min+ " " + max);
    }
}