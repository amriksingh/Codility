class Solution {
    public int solution(int X, int[] A) {
        int jmp = 0;
        int[] count = new int[A.length+1];
        for(int i = 0; i < A.length; i++){
            if(count[A[i]] == 0){
                count[A[i]] = A[i];
            jmp++;
            if(jmp == X)
                return i;
            }
        }
        return -1;
    }
}

