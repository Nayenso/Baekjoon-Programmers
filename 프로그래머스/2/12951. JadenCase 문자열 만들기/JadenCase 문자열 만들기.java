class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ");
        String re = "";
        int size = temp.length;
        
        for(int i=0; i<size; i++){
            String t = temp[i].toLowerCase();
            
            if(t.length() == 0){
                re+=" ";
            }
            else{
                re += t.substring(0,1).toUpperCase();
                re += t.substring(1);
                re+= " ";
            }
        }
        int len = re.length();
        
        if(s.substring(s.length()-1).equals(" ")) 
            return re;
        return re = re.substring(0, len-1);
    }
}