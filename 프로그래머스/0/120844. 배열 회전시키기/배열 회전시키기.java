class Solution {
    public int[] solution(int[] numbers, String direction) {
        int last = numbers.length-1;
        int size = numbers.length;
        int[] newArr = new int[size];
        
        if(direction.equals("right")){
            int index = 1;
            for(int i = 0; i < size-1; i++){
                newArr[index++] = numbers[i];
            }
            newArr[0] = numbers[last];
        }
        else if(direction.equals("left")){
            int index = 0;
            for(int i = 1; i < size; i++){
                newArr[index++] = numbers[i];
            }
            newArr[last] = numbers[0];
        }
        
        return newArr;
    }
}