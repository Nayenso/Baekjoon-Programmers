import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Total = 0;
        int max = Total;

        for (int i = 0; i < 4; i++){
            int out = input.nextInt();
            int in = input.nextInt();
            Total -= out;
            Total += in;
            if (Total > max){
                max = Total;
            }
        }
        System.out.println(max);

    }

}