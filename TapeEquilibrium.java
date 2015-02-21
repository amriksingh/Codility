class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int leftsum = 0;
        int rightsum = 0;
        int sum = 0;
        int min_diff = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length; i++){
            sum += A[i];
        }
        for(int i = 0; i < A.length-1; i++){
            leftsum += A[i];
            rightsum = sum-leftsum;
            int min = Math.abs(rightsum-leftsum);
            if(min_diff > min){
               min_diff = min;
           }
        }    
        return min_diff;
    }
}