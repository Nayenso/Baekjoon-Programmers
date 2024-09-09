import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char w = word.charAt(0);
        System.out.println((int)w);
    }
}