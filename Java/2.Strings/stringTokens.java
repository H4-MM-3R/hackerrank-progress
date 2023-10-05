import java.io.*;
import java.util.*;

public class stringTokens {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    if (s.trim().length() == 0)
      System.out.println("0");
    else {
      String arr[] = s.trim().split("[!,?._'@\\s]+");
    }
    System.out.println(arr.length);
    for (String a : arr) {
      System.out.println(a);
    }
    sc.close();
  }
}
