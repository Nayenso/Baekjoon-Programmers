import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int totalMPrice = 0;
        int totalYPrice = 0;
        for (int i = 0; i < n; i++){
            int time = input.nextInt();
            totalMPrice += (time/60+1)*15;
            totalYPrice += (time/30+1)*10;
        }

        if (totalMPrice<totalYPrice){
            System.out.println("M "+totalMPrice);
        }else if(totalMPrice > totalYPrice) {
            System.out.println("Y "+totalYPrice);
        }else{
            System.out.println("Y M "+totalMPrice);
        }
    }
}