import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maxTotal = 0;
        int total = 0;

        for (int i = 0; i < 10; i++){
            int out = input.nextInt();
            int in = input.nextInt();

            total -= out;
            total += in;

            if (maxTotal < total){
                maxTotal = total;
            }
        }
        System.out.println(maxTotal);
    }

}