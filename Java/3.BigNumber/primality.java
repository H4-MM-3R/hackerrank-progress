import java.io.*;
import java.math.*;

public class primality {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader =
        new BufferedReader(new InputStreamReader(System.in));

    String n = bufferedReader.readLine();
    BigInteger biggie = new BigInteger(n);

    if (biggie.isProbablePrime(1))
      System.out.println("prime");
    else
      System.out.println("not prime");

    bufferedReader.close();
  }
}
