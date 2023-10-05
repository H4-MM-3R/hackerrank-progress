import java.io.*;
import java.util.*;

class Prime {
  void checkPrime(int... numbers) {
    for (int num : numbers) {
      if (isPrime(num))
        System.out.print(num + " ");
    }
    System.out.println();
  }

  private boolean isPrime(int num) {
    if (num <= 1)
      return false;
    if (num == 2)
      return true;
    if (num % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if (num % i == 0)
        return false;
    }
    return true;
  }
}

public class Solution {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n4 = sc.nextInt();
    int n5 = sc.nextInt();

    Prime prime = new Prime();
    prime.checkPrime(n1);
    prime.checkPrime(n1, n2);
    prime.checkPrime(n1, n2, n3);
    prime.checkPrime(n1, n2, n3, n4, n5);
  }
}
