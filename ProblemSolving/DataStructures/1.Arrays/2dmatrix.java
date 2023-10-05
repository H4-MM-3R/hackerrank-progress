import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'hourglassSum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int hourglassSum(List<List<Integer>> arr) {

    // ##########

    // ----- Write your code here -----

    // ##########

    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int sum = 0;
        sum += arr.get(i).get(j) + arr.get(i).get(j + 1) +
               arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) +
               arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) +
               arr.get(i + 2).get(j + 2);
        ans = Math.max(ans, sum);
      }
    }
    return ans;
  }
}
