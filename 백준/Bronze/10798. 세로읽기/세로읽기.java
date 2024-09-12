import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        String[][] array = new String[5][15];

        for (int i = 0; i < 5; i++){
            String[] word = input.next().split("");
            for (int j = 0; j < word.length; j++) {
                array[i][j] = word[j];
            }
        }

        for (int j = 0; j < 15; j++){
            for (int i = 0; i < 5; i++){
                if (array[i][j] != null){
                    result+=array[i][j];
                }
            }
        }
        System.out.println(result);
    }

}
