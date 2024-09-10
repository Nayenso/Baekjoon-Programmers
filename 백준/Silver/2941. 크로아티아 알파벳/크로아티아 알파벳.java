import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (temp == 'c') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    } else if (word.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (temp == 'd') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == 'z') {
                        if (i < word.length() - 2) {
                            if (word.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (word.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }else if (temp == 'l') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if (temp == 'n') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if (temp == 's') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }else if (temp == 'z') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
