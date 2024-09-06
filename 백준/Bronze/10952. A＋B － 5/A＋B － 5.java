import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;

        while (true) {
            A = input.nextInt();
            B = input.nextInt();
            if ((A == 0) && (B == 0)){
                break;
            }
            System.out.println(A+B);
        }
    }
}