import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        //다이아몬드 위쪽
        for (int i = 1; i <= N; i++){
            for (int j = N-i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int t = 1; t <= i; t++){
                System.out.print("*");
            }
            for (int t = 1; t < i; t++){
                System.out.print("*");
            }
            System.out.println();
        }

        //다이아몬드 아래쪽
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int t = N-i; t >= 1; t--){
                System.out.print("*");
            }
            for (int t = N-2; t >=i; t--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
