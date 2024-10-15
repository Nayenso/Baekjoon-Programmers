import java.util.*;

class Solution {
    public String solution(String s) {
        char[] S = s.toCharArray();
        
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(S[i]<S[j]){
                    char temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
            }
        }
        return (String.valueOf(S));
    }
}