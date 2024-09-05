import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int result = 0;
        if (isYoon(year)){
            result = 1;
        }else{
            result = 0;
        }
        System.out.println(result);
    }

    static boolean isYoon(int year){
        return((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}