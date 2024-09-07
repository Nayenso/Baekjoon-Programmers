import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int i, j, k;
        int[] basket = new int[N];

        for (int t = 0; t < M; t++) {
            i = input.nextInt();
            j = input.nextInt();
            k = input.nextInt();
            inputBall(basket, i, j, k);
        }
        for (int t : basket) {
            System.out.print(t+" ");
        }
    }

    static void inputBall(int[] array, int i, int j, int k){
        int start = i-1;
        int end = j-1;

        for (int index = start; index <= end; index++) {
            array[index] = k;
        }
    }
}