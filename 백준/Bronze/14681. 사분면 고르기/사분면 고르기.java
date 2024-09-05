import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X, Y;
        X = input.nextInt();
        Y = input.nextInt();
        System.out.println(findQuandrant(X,Y));
    }

   static int findQuandrant(int x, int y){
        if (x > 0 && y > 0){
            return 1;
        }else if (x < 0 && y > 0){
            return 2;
        }else if (x < 0 && y < 0){
            return 3;
        }else{
            return 4;
        }
   }
}