import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int A, B;

        for (int i = 0; i < T; i++){
            A = input.nextInt();
            B = input.nextInt();
            System.out.println(A+B);
        }
    }
}