import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] yutPlay = new int[3][4];
        
        for (int i = 0; i < yutPlay.length; i++){
            int cntF = 0, cntB = 0;
            for (int j = 0; j < yutPlay[i].length; j++){
                yutPlay[i][j] = input.nextInt();
                if (yutPlay[i][j] == 1){
                    cntF++;
                }else{
                    cntB++;
                }
            }
            printResult(cntF,cntB);
        }
    }

    static void printResult(int cntF, int cntB){
        if (cntF == 4){
            System.out.println("E");
        } else if (cntB == 4){
            System.out.println("D");
        } else if (cntF == 1 && cntB == 3) {
            System.out.println("C");
        }else if (cntF == 2 && cntB == 2) {
            System.out.println("B");
        }else if (cntF == 3 && cntB == 1) {
            System.out.println("A");
        }
    }
}