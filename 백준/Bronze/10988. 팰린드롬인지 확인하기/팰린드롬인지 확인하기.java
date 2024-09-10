import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(isSame(word));
    }

    static int isSame(String word){
        int len = word.length();
        int start = 0, end = len-1;

        while(start < end){
            char front = word.charAt(start);
            char rear = word.charAt(end);
            if (front == rear){
                start++;
                end--;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
