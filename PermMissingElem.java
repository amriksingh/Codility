class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int max = 0;
        int counter = 0;
        int missing = 0;
        int[] count = new int[len+1];
        if(len == 0 )
            missing = 1;
        for(int i = 0; i < len; i++){
            if(max < A[i]){
                max = A[i];
            }
            count[A[i]-1] = 1;
        }
        for(int i = 0; i < len; i++){
            if(count[i] == 1){
                counter += 1;
                if( counter == max & count[i] == 1)
                    missing = max+1;
            }
            else
                missing = i+1;
        }
        return missing;
    }
}