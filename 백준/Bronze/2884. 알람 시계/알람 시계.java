import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H,M;
        H = input.nextInt();
        M  = input.nextInt();

        if (M > 45){
            M -= 45;
        }else if (M == 45){
            M = 0;
        }
        else{
            if (H == 0){
                H = 23;
            }
            else{
                H -= 1;
            }
            M = 60 - 45 + M;
        }
        System.out.print(H+" "+M);
    }

}