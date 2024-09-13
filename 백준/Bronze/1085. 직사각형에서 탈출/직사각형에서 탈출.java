import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();

        if (x > w/2){
            if (y > h/2){
                int min;
                int a = h-y;
                int b = w-x;
                min = (a<b)?a:b;
                System.out.println(min);
            }else{
                int min;
                int a = y;
                int b = w-x;
                min = (a<b)?a:b;
                System.out.println(min);
            }
        }else{
            if (y > h/2){
                int min;
                int a = h-y;
                int b = x;
                min = (a<b)?a:b;
                System.out.println(min);
            }else{
                int min;
                int a = y;
                int b = x;
                min = (a<b)?a:b;
                System.out.println(min);
            }
        }
    }
}