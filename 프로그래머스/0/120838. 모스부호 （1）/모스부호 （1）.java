class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
        String temp = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<26; j++){
                if(arr[i].equals(mos[j])){
                    temp+= (char)('a'+j);
                    break;
                }
            }
        }
        return temp;
    }
}