import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int i, j;
        int[] basket = new int[N];

        for (int t = 0; t < N; t++) {
            basket[t] = (t+1);
        }

        for (int t = 0; t < M; t++) {
            i = input.nextInt();
            j = input.nextInt();
            swapBasket(basket, i, j);
        }
        for (int t : basket) {
            System.out.print(t+" ");
        }
    }

    static void swapBasket(int[] array, int i, int j){
        int temp = array[i-1];
        array[i-1] = array[j-1];
        array[j-1] = temp;
    }
}