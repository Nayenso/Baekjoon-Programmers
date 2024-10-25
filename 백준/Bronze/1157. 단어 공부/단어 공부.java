import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean flag = false;
        int size = word.length();
        int[] alpha = new int[26];

        String temp = word.toUpperCase();

        for(int i=0; i<size; i++){
            int index = temp.charAt(i)-'A';
            alpha[index]++;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int maxCount = 0;

        for(int i=0; i<26; i++){
            if(max<alpha[i]){
                max = alpha[i];
                maxIndex = i;
                maxCount = 1;
            }else if (alpha[i] == max) {
                maxCount++;
            }
        }
        
        if(maxCount>1){
            System.out.println("?");
        }else{
            System.out.println((char)(maxIndex+'A'));
        }
    }
}