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
   * Complete the 'dynamicArray' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   * 1. INTEGER n
   * 2. 2D_INTEGER_ARRAY queries
   */

  public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

    // ##########

    //  ----- Write your code here -----

    // ##########

    List<Integer> ans = new ArrayList<>();
    List<List<Integer>> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      arr.add(new ArrayList<>());
    }
    int lastAns = 0;

    for (List<Integer> query : queries) {
      int type = query.get(0);
      int x = query.get(1);
      int y = query.get(2);

      int index = (x ^ lastAns) % n;

      if (type == 1)
        arr.get(index).add(y);
      else if (type == 2) {
        List<Integer> seq = arr.get(index);
        lastAns = seq.get(y % seq.size());
        ans.add(lastAns);
      }
    }
    return ans;
  }
