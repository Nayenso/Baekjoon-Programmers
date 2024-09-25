class Solution {
    public int solution(int[] num_list) {
        int hol = 0, jjak = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i%2 == 0){
                jjak += num_list[i];
            }else{
                hol += num_list[i];
            }
        }
        return (jjak > hol)?jjak:hol;
    }
}