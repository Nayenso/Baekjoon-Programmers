class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch(n) {
            case 1:
                int size1 = slicer[1] + 1;
                int[] arr1 = new int[size1];
                for (int i = 0; i < size1; i++) {
                    arr1[i] = num_list[i];
                }
                return arr1;
            
            case 2:
                int size2 = num_list.length - slicer[0];
                int index2 = 0;
                int[] arr2 = new int[size2];
                for (int i = slicer[0]; i < num_list.length; i++) {
                    arr2[index2++] = num_list[i];
                }
                return arr2;
            
            case 3:
                int size3 = slicer[1] - slicer[0] + 1;
                int[] arr3 = new int[size3];
                int index3 = 0;
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    arr3[index3++] = num_list[i];
                }
                return arr3;
            
            case 4:
                int size4 = (slicer[1] - slicer[0] + 1) / slicer[2];
                if ((slicer[1] - slicer[0] + 1) % slicer[2] > 0) {
                    size4 += 1;
                }
                int[] arr4 = new int[size4];
                int index4 = 0;
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    arr4[index4++] = num_list[i];
                }
                return arr4;
            
            default:
                return new int[0];
        }
    }
}
