import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;
        int R1, R2, R3, R4;
        A = input.nextInt();
        B = input.nextInt();
        R1 = A*(B%10);
        R2 = A*((B%100)/10);
        R3 = A*(B/100);
        R4 = R3*100+R2*10+R1;
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);
        System.out.println(R4);
    }
}