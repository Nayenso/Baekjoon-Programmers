class Solution {
    public String[] solution(String[] picture, int k) {
        int size = picture.length;
        String[] reString = new String[size*k];
        
        int index = 0;
        for(int i=0; i<size; i++){
            String temp = "";
            int len = picture[i].length();
            for(int j=0; j<len; j++){
                for(int t=0; t<k; t++){
                    temp += picture[i].charAt(j);
                }
            }
            for(int m=0; m<k; m++){
                reString[index++] = temp;
            }
        }
        return reString;
    }
}