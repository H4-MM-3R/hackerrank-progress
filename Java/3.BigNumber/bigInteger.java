import java.math.*;
import java.util.*;

public class bigInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();
    sc.close();

    BigInteger biggieA = new BigInteger(a);
    BigInteger biggieB = new BigInteger(b);

    System.out.println(biggieA.add(biggieB));

    System.out.println(biggieA.multiply(biggieB));
  }
}
