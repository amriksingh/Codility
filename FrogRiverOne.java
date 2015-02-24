class Solution {
    public int solution(int X, int[] A) {
        int pos = 0;
        int[] count = new int[A.length+1];
        for(int i = 0; i < A.length; i++){
            count[A[i]] += 1;
            if(A[i] == X){
                pos = i;
            }
        } 
        if(count[X] == 1){
            return pos;
        }
        return -1;
    }
}