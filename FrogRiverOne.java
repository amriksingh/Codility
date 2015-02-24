class Solution {
    public int solution(int X, int[] A) {
        int pos = 0;
        Boolean found = false;
        int[] count = new int[A.length+1];
        for(int i = 0; i < A.length; i++){
            if(A[i] == X){
                pos = i;
            }
            if(i < X && A[i] == X){
                return -1;
            }
            else{
                count[A[i]] += 1;
            }
        }
        for(int i = 1; i <= X; i++){
            if(count[i] >=1){
                found = true;
            }else{
                return -1;
            }
        }
        return pos;
    }
}