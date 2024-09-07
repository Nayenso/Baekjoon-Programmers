import java.io.EOFException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++){
            array[i] = input.nextInt();
        }
        int search = input.nextInt();
        for (int i = 0; i < N; i++){
            if (array[i] == search) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}