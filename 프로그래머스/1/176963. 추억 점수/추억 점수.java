class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] re = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int cnt = 0;
            for(int j=0; j<photo[i].length; j++){
                for(int t=0; t<name.length; t++){
                    if(photo[i][j].equals(name[t])){
                        cnt+=yearning[t];
                    }
                }
            }
            re[i] = cnt;
        }
        return re;
    }
}