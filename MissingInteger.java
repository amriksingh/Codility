class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int val = 0;
        int [] count = new int[len+1];
        for(int i = 0; i < len; i++){
            if(A[i] > 0 && A[i] <= len){
                count[A[i]] = 1;
            }
        }
        for(int i = 1; i <= len; i++){
            if(count[i] == 0)
                return i;
            else
                val = i+1;
        }
    return val;
    }
}