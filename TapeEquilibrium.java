class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int leftsum = 0;
        int rightsum = 0;
        int min_diff = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length; i++){
            leftsum += A[i];
        }
        for(int i = 0; i < A.length; i++){
            rightsum += A[i];
           int diff = Math.abs(leftsum-rightsum);
           int min = Math.abs(rightsum-diff);
           if(min_diff > min){
               min_diff = min;
           }
        }    
        return min_diff;
    }
}