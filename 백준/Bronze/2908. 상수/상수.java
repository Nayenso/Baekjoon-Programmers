import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int reA, reB;
        int[] tempA = new int[3];
        int[] tempB = new int[3];
        tempA[0] = A/100;
        tempA[1] = (A/10)%10;
        tempA[2] = A%10;

        tempB[0] = B/100;
        tempB[1] = (B/10)%10;
        tempB[2] = B%10;

        reA = tempA[2]*100 + tempA[1]*10 + tempA[0];
        reB = tempB[2]*100 + tempB[1]*10 + tempB[0];
        int max = (reA > reB) ? reA : reB;
        System.out.println(max);
    }
}
