class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int dk = 0;
        for(int i = A; i <= B; i++){
            if(i % K == 0){
                dk += 1;
            }
        }
        return dk;
    }
}