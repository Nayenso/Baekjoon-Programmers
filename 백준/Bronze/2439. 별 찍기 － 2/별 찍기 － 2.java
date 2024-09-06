import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= N; i++){
            for (int j = N-1; j >=i; j--){
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}