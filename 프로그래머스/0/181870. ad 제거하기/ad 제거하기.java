class Solution {
    public String[] solution(String[] strArr) {
        int size = 0, index = 0;
        for(int i= 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                size++;
            }
        }
        String[] answer = new String[size];
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].contains("ad")){
                continue;
            }else{
                answer[index++] = strArr[i];
            }
        }
        return answer;
    }
}