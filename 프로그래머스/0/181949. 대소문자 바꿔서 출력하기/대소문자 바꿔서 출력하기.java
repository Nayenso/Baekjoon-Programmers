import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if (97 <= arr[i] && arr[i] <= 122){
                System.out.print((char)(arr[i]-32));
            }else if(65 <= arr[i] && arr[i] <= 90) {
                System.out.print((char)(arr[i]+32));
            }
        }
    }
}