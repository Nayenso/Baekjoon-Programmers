class Solution {
    public String solution(String polynomial) {
        String[] poly = polynomial.split(" ");
        String reString = "";
        int leng = poly.length;
        int cnt = 0;
        int num = 0;
                
        for(int i=0; i<leng; i++){
            int len = poly[i].length();
            
            if(poly[i].equals("+")){
                continue;
            }
            
            if(poly[i].charAt(len-1)=='x'){
                if(len==1){
                    cnt++;
                }else{
                    String temp = "";
                    for(int j=0; j<len-1; j++){
                        temp += poly[i].charAt(j);
                    }
                    cnt += Integer.parseInt(temp);
                }
            }else{
                num += Integer.parseInt(poly[i]);
            }
        }
        if(cnt>0){
            if(cnt==1){
                reString+="x";
            }else{
                reString+=cnt+"x";
            }
        }
        if(num>0){
            if(reString.length()>0){
                reString+=" + "+num;
            }else{
                reString+= num+"";
            }
        }
        return reString;
    }
}