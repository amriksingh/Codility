class Solution {
    public int solution(int[] A) {
        int len = A.length;					// Length of array
        int[] count = new int[len+1];		//new array for counting
        for(int i = 0; i < len; i++){
            if(A[i] > len+1 || A[i] == 0){	//out of bounds
                return 0;
			}
            count[A[i]-1] += 1;				// lets keep track  
        } 
        for(int i = 0; i < len; i++){
            if(count[i] == 0){				// if any place missing
                return 0;					// not a permutation
			}
        }
        return 1;
    }
}
