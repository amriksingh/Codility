class Solution {
    public int solution(int X, int[] A) {
        int pos = 0;
        int[] count = new int[A.length+1];
        for(int i = 0; i < A.length; i++){
            if(A[i] == X){
                pos = i;
            }
            count[A[i]] += 1;
			if(i < X && A[i] == X){
                count[A[i]] = 0;
            }
        }
        for(int i = 1; i <= X; i++){
            if(count[i] >=1){
            }else{
                return -1;
            }
        }			
        return pos;
    }
}