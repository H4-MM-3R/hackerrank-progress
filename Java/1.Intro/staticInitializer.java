
// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
import java.io.*;
import java.util.*;

class CustomException extends Exception {
  public CustomException(String message) { super(message); }
}

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int h = sc.nextInt();
    try {
      if (b <= 0 || h <= 0)
        throw new CustomException(
            "java.long.Exception: Breadth and height must be positive");
      else {
        int res = b * h;
        System.out.println(res);
      }
    } catch (CustomException e) {
      System.out.println(e.getMessage());
    }
  }
}
