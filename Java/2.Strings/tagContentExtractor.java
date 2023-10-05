import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class tagContentExtractor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCases = Integer.parseInt(sc.nextLine());
    while (testCases > 0) {
      String line = sc.nextLine();
      Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
      Matcher matcher = pattern.matcher(line);

      boolean found = false;
      while (matcher.find()) {
        System.out.println(matcher.group(2));
        found = true;
      }
      if (!found)
        System.out.println("None");
      testCases--;
    }
  }
}
