import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] chessPi = new int[6];

        for (int i = 0; i < 6; i++) {
            chessPi[i] = input.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            int cnt = chess[i] - chessPi[i];
            System.out.print(cnt+" ");
        }
    }
}
