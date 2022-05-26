package Arrays;

public class MinimumPicks {

  public static void main(String[] args) {
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;

    int A[] = {0, 2, 9};
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        maximum = Math.max(maximum, A[i]);
      } else {
        minimum = Math.min(minimum, A[i]);
      }
    }
    int ans = maximum - minimum;
    System.out.println(ans);
  }
}
