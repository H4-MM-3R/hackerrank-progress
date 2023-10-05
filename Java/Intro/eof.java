//"https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true"

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lineNumber = 0;

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      lineNumber++;
      System.out.println(lineNumber + " " + line);
    }
  }
}
