import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int time = input.nextInt();

        if (time % 10 != 0){
            System.out.println(-1);
            return;
        }

        int A = 300, B = 60, C = 10;
        int aCount = 0, bCount = 0, cCount = 0;

        while (time != 0) {
            if (time >= A){
                int temp = time / A;
                time %= A;
                aCount += temp;
            } else if (time >= B) {
                int temp = time / B;
                time %= B;
                bCount += temp;
            } else if (time >= C) {
                int temp = time / C;
                time %= C;
                cCount += temp;
            }
        }
        System.out.println(aCount+" "+bCount+" "+cCount);
    }

}