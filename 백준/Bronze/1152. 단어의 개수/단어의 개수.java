import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        StringTokenizer cnt = new StringTokenizer(word," ");
        System.out.println(cnt.countTokens());
    }
}
