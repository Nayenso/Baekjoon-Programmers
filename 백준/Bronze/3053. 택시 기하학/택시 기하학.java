import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = Math.PI;

        int r = input.nextInt();
        //원의 넓이

        double space = r*r*pi;
        System.out.printf("%.6f",space);

        System.out.println();
        
        double taxiSpace = r*r*0.5*4;
        System.out.printf("%.6f", taxiSpace);
    }

}