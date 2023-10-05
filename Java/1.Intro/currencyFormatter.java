// https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import javaj.io.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double payment = sc.nextDouble();
    sc.close();

    NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat indiaFormat =
        NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    NumberFormat chineFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    string us = usFormat.format(payment);
    string india = indiaFormat.format(payment);
    string chine = chineFormat.format(payment);
    string france = franceFormat.format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + chine);
    System.out.println("France: " + france);
  }
}
