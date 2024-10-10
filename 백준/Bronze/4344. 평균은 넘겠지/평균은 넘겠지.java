import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for(int i=0; i<C; i++){
            int st = sc.nextInt();
            int[] grade = new int[st];
            int sum = 0, cnt=0;

            for(int j=0; j<st; j++){
                grade[j] = sc.nextInt();
                sum+=grade[j];
            }
            double avg = (double)sum/st;
            for(int j=0; j<st; j++){
                if(avg < grade[j]){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",((double)cnt/st)*100);
        }
    }
}