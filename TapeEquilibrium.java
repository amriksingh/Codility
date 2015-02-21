class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int p = 0;
        int min_diff = A[0];
        for(int i = 0 ; i < A.length; i++){
            sum += A[i];
        }
        for(int i = 0; i < A.length-1; i++){
            p += A[i];
           int diff = Math.abs(sum-p);
           int min = Math.abs(p-diff);
           if(min_diff > min){
               min_diff = min;
           }
        }    
        return min_diff;
    }
}