import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[9][9];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                array[i][j] = input.nextInt();
            }
        }
        int max = array[0][0], index1 = 0, index2 = 0;

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((index1+1)+" "+(index2+1));
    }

}
