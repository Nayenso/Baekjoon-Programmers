import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;
        int end = B.length-1;
        
        for(int i=0; i<A.length; i++){
            sum += A[i]*B[end--];
        }
        
        return sum;
    }
}