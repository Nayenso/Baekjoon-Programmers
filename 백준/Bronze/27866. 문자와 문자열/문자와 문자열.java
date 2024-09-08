import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int num = input.nextInt();
        char result = word.charAt(num-1);
        System.out.println(result);
    }
}