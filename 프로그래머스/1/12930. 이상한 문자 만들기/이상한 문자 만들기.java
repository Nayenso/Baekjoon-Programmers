class Solution {
    public String solution(String s) {
        int index = 0;
        String str = s.toUpperCase();
        char[] c = str.toCharArray();
        
        for(int i=0; i<c.length; i++){
            if(s.charAt(i)==' '){
                index = 0;
            }else{
                char t = str.charAt(i);
                if(index%2!=0){
                    if(Character.isUpperCase(t)){
                        c[i] = Character.toLowerCase(t);
                    }
                }
                index++;
            }
        }
        return String.valueOf(c);
    }
}