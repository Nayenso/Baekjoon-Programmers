import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] student = new int[30];
        int[] checkStudet = new int[30];

        for (int i = 0; i < 28; i++) {
            student[i] = input.nextInt();
        }

        for (int i = 0; i < 30; i++) {
            checkStudet[i] = (i+1);
        }

        for (int i = 0; i < 30; i++) {
            isHereStudent(student[i],checkStudet);
        }

        for (int i = 0; i < 30; i++) {
            if (checkStudet[i] != -1){
                System.out.println(checkStudet[i]);
            }
        }
    }

    static void isHereStudent(int number, int[] checkArray){
        for (int i = 0; i < 30; i++) {
            if (number == checkArray[i]){
                checkArray[i] = -1;
            }
        }
    }
}