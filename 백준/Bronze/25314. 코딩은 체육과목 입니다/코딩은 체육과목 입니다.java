import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int endNum = N/4;

        String longword = "long ";

        for (int i = 0; i <endNum; i++){
            System.out.print(longword);
        }
        System.out.println("int");
    }
}