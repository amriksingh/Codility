class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        if(len == 0)
            return 0;
        int[] count = new int[A.length+1];
        int missing = 0;
        for(int i = 0; i < A.length; i++){
            count[A[i]-1] = 1;
        }
        for(int i = 0; i < A.length; i++){
            if(count[i] == 0)
                missing = i+1;
        }
        return missing;
    }
}

