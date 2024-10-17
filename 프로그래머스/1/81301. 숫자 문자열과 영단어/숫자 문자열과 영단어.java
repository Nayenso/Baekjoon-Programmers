class Solution {
    public int solution(String s) {
        String re = "";
        
        for(int i=0; i<s.length();){
            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                re += s.charAt(i);
                i++;
            }else{
                String temp = "";
                for(int j=i; j<s.length(); j++){
                    if('0' <= s.charAt(j) && s.charAt(j) <= '9'||
                      temp.equals("zero")||temp.equals("one")||temp.equals("two")||temp.equals("three")||temp.equals("four")||temp.equals("five")||temp.equals("six")||temp.equals("seven")||temp.equals("eight")||temp.equals("nine")){
                        break;
                    }
                    temp += s.charAt(j);
                }
                if(temp.equals("zero")){
                    re += 0;
                    i+=4;
                }else if(temp.equals("one")){
                    re += 1;
                    i+=3;
                }else if(temp.equals("two")){
                    re += 2;
                    i+=3;
                }else if(temp.equals("three")){
                    re += 3;
                    i+=5;
                }else if(temp.equals("four")){
                    re += 4;
                    i+=4;
                }else if(temp.equals("five")){
                    re += 5;
                    i+=4;
                }else if(temp.equals("six")){
                    re += 6;
                    i+=3;
                }else if(temp.equals("seven")){
                    re += 7;
                    i+=5;
                }else if(temp.equals("eight")){
                    re += 8;
                    i+=5;
                }else if(temp.equals("nine")){
                    re += 9;
                    i+=4;
                }
            }
        }
        return Integer.parseInt(re);
    }
}