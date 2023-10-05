import java.util.*;

public class substringComparison {
  public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

    for (int i = 0; i <= s.length() - k; i++) {
      String currsubstr = s.substring(i, i + k);

      if (currsubstr.compareTo(smallest) < 0)
        smallest = currsubstr;
      else if (currsubstr.compareTo(largest) > 0)
        largest = currsubstr;

      return smallest + "\n" + largest;
    }
  }
}
