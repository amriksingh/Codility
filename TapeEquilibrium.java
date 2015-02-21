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
            if(min_diff > Math.abs(rightsum-leftsum)){
               min_diff = Math.abs(rightsum-leftsum);
           }
        }    
        return min_diff;
    }
}