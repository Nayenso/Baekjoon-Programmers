import java.io.EOFException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;

        while (input.hasNext()) {
            A = input.nextInt();
            B = input.nextInt();
            System.out.println(A+B);
        }
    }
}