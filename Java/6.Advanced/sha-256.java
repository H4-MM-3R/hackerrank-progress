import java.io.*;
import java.security.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution. */

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      byte[] digest = md.digest(input.getBytes());

      StringBuilder ans = new StringBuilder();
      for (byte b : digest) {
        ans.append(String.format("%02x", b));
      }
      System.out.println(ans.toString());

    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
  }
}
