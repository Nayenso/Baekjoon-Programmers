import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double[] grade = new double[N];
        double[] temp = new double[N];
        double avg = 0, sum = 0;

        for (int i = 0; i < N; i++){
            grade[i] = input.nextInt();
        }

        double max = grade[0];
        for (int i = 0; i < N; i++){
            if (max < grade[i]){
                max = grade[i];
            }
        }

        for (int i = 0; i < N; i++){
            temp[i] = grade[i]/max*100;
            sum+=temp[i];
        }

        avg = sum/N;
        System.out.println(avg);
    }
}