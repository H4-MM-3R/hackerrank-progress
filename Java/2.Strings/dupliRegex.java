import java.util.*;
import java.util.regex.*;

public class dupliRegex {
  public static void main(String[] args) {

    String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner sc = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
      String input = sc.nextLine();

      Matcher m = p.matcher(input);

      while (m.find()) {
        input = input.replaceAll(m.group(), m.group(1));
      }

      System.out.println(input);
    }
  }
}
