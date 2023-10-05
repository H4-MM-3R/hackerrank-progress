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
   * Complete the 'arrayManipulation' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  public static long arrayManipulation(int n, List<List<Integer>> queries) {
    long[] arr = new long[n];

    for (List<Integer> query : queries) {
      int a = query.get(0) - 1;
      int b = query.get(1) - 1;
      int k = query.get(2);

      arr[a] += k;
      if (b + 1 < n) {
        arr[b + 1] -= k;
      }
    }

    long max = 0;
    long sum = 0;

    for (int i = 0; i < n; i++) {
      sum += arr[i];
      max = Math.max(max, sum);
    }

    return max;
  }
}
