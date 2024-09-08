import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++){
            array[i] = (i+1);
        }
        for (int t = 0; t < M; t++) {
            int i = input.nextInt();
            int j = input.nextInt();
            changeIndex(array, i-1, j-1);
        }
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    static void changeIndex(int[] array, int i, int j){
        int start = i;
        int end = j;
        while(start < end){
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}