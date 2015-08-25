 import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max_counter = 0;
        int a[] = new int[N];
        for(int i = 0; i < A.length; i++){
            int n =0;
            if(A[i] >= 1 && A[i] <= N){
                a[A[i]-1] += 1;
                n = a[A[i]-1];
                if( n > max_counter)
                    max_counter = n;
            }
            else{
                Arrays.fill(a, max_counter);
                max_counter = a[0];
            }
            //System.out.println(Arrays.toString(a));
        } 
        return a;
    }
}