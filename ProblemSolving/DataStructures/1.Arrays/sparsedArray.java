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
   * Complete the 'matchingStrings' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. STRING_ARRAY stringList
   *  2. STRING_ARRAY queries
   */

  public static List<Integer> matchingStrings(List<String> stringList,
                                              List<String> queries) {
    Map<String, Integer> mp = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
    for (String string : stringList) {
      mp.put(string, mp.getOrDefault(string, 0) + 1);
    }

    for (String query : queries) {
      if (mp.containsKey(query)) {
        ans.add(mp.get(query));
      } else {
        ans.add(0);
      }
    }
    return ans;
  }
