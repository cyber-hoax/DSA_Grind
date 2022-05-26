package Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] A = {1,2,3,4,5};
        int target = 5;

        int i = 0, j = A.length-1;
        while(i < j){
            if(A[i] + A[j] == target){

                break;
            }
            else if(A[i] + A[j] < target){
                i++;
            }
            else if(A[i] + A[j] > target){
                j-- ;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
