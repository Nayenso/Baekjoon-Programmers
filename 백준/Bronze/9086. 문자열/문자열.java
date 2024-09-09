import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();

        String[] wordArray = new String[T];

        for (int i = 0; i < T; i++){
            wordArray[i] = input.nextLine();
        }

        for (int i = 0; i < T; i++){
            int len = wordArray[i].length();
            System.out.print(wordArray[i].charAt(0));
            System.out.print(wordArray[i].charAt(len-1));
            System.out.println();
        }
    }
}