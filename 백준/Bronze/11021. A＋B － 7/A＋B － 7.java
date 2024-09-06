import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int A, B;

        for (int i = 1; i <= T; i++){
            A = input.nextInt();
            B = input.nextInt();
            print(A,B,i);
        }
    }

    static void print(int a, int b, int i){
        System.out.println("Case #" + i + ": "+(a+b));
    }
}