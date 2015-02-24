class Solution {
    public int solution(int[] A) {
        int len = A.length;
        //System.out.print(len);
        int[] count = new int[len+1];
        for(int i = 0; i < len; i++){
           // System.out.println(A[i]);
            count[A[i]-1] += 1;  
           // System.out.println(i + " " + count[i]);
        } 
        for(int i = 0; i < len; i++){
            //System.out.println(i);
            if(count[i] == 0)
                return 0;
        }
        return 1;
    }
}