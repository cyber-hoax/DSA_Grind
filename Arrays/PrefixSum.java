package Arrays;
import java.util.Arrays;


/*
use kadane's algorithm to bring the tc from n^2 to n
the approach is make a sum variable and itialise it with 0
then traverse through loop and add the element into sum and update the new array with sum value
 */

public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int sum = 0;
        int[] ans = new int[A.length];
        for(int i = 0 ; i<A.length ; i++){
            sum += A[i];
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
