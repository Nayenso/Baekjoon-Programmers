import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] word = input.nextLine().toCharArray();

        for (int i = 0; i < 26; i++) {
            int temp = -1;
            for (int j = 0; j < word.length; j++) {
                if (word[j] - 'a' == i) {
                    temp = j;
                    break;
                }
            }
            System.out.print(temp+" ");
        }
    }
}