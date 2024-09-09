import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();  // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            int num = input.nextInt();// 반복 횟수 입력
            String word = input.next();  // 문자열 입력
            solution(word, num);  // 처리 및 출력
        }
    }

    static void solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);  // 결과 출력
    }
}
