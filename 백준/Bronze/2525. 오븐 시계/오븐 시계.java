import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H, M, time;
        int tempH, tempM;
        int overH = 0, overM = 0;

        H = input.nextInt();
        M = input.nextInt();
        time = input.nextInt();

        tempH = time / 60;
        tempM = time % 60;

        if (M + tempM >= 60){
            overH = (M + tempM)/60;
            overM = (M + tempM)%60;

            H = (H+(tempH+overH))%24;
            M = overM;
            System.out.println(H+" "+M);
            return;
        }
        
        H = (H+tempH)%24;
        M += tempM;
        System.out.println(H+" "+M);
    }
}