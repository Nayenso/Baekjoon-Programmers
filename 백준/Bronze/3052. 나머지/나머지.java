import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++){
            array[i] = input.nextInt()%42;
        }

        System.out.println(returnCountNum(array));
    }

    static int returnCountNum(int[] temp){
        int cnt = 0;
        for (int i = 0; i < temp.length; i++){
            boolean TF = false;
            for (int j = i+1; j < temp.length; j++){
                if (temp[i] == temp[j]){
                    TF = true;
                    break;
                }
            }
            if (TF == false){
                cnt++;
            }
        }
        return cnt;
    }
}