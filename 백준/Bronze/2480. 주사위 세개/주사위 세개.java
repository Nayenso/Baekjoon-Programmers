import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int D1, D2, D3;

        D1 = input.nextInt();
        D2 = input.nextInt();
        D3 = input.nextInt();

        if ((D1 == D2) && (D2 == D3) && (D1 == D3)) {
            System.out.println((10000 + D1 * 1000));
        } else if ((D1 != D2) && (D2 != D3) && (D1 != D3)) {
            System.out.println((findBig(D1,D2,D3) * 100));
        }else  {
            System.out.println((1000 + findSame(D1,D2,D3)*100));
        }
    }

    static int findSame(int d1, int d2, int d3){
        int same = d1;
        if(d2 == d3){
            return d2;
        }else{
            return same;
        }
    }

    static int findBig(int d1, int d2, int d3){
        int max = d1;

        if (max < d2) {
            max = d2;
        }
        if(max < d3){
            max = d3;
        }
        return max;
    }
}