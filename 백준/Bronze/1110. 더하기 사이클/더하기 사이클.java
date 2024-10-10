import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        if(N<10){
            N*=10;
        }

        int same = N;
        while(true){
            int a = N/10;
            int b = N%10;
            int next = (a+b)%10;
            N = b*10+next;
            cnt++;
            if(same == N){
                break;
            }
        }
        System.out.println(cnt);
    }
}