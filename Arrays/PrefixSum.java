package Arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int sum = 0 ;

        int[] ans = new int[A.length];
        for(int i = 0 ; i<A.length ; i++){
            sum += A[i];
            ans[i] = sum ;
        }
        System.out.println(Arrays.toString(ans));
    }
}
