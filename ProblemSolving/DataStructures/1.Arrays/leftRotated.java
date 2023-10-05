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
   * Complete the 'rotateLeft' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   * 1. INTEGER d
   * 2. INTEGER_ARRAY arr
   */

  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    int len = arr.size();
    d = d % len;

    List<Integer> rotatedArr = new ArrayList<>();
    for (int i = d; i < len; i++) {
      rotatedArr.add(arr.get(i));
    }

    for (int i = 0; i < d; i++) {
      rotatedArr.add(arr.get(i));
    }
    return rotatedArr;
  }
}
