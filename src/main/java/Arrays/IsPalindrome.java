package Arrays;

import java.util.HashMap;
import java.util.Map;

public class IsPalindrome {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    String A = "aacb";

    for (int i = 0; i < A.length(); i++) {

      if (map.containsKey(A.charAt(i))) {
        map.put(A.charAt(i), map.get(A.charAt(i)) + 1);
      } else {
        map.put(A.charAt(i), 1);
      }
    }
    int oddCount = 0;
    for (Map.Entry entry : map.entrySet()) {
      //      System.out.println(entry.getKey() + " " + entry.getValue());

      if ((int) entry.getValue() % 2 != 0) {
        oddCount++;
      }
    }
    if (oddCount <= 1) {
      System.out.println(1);

    } else {
      System.out.println(0);
    }
  }
}
