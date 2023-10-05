// https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Solution {

  // ------- FUNCTION TO BE FILLED ---------

  public static String findDay(int month, int day, int year) {
    Calendar calendar = new GregorianCalendar(year, month - 1, day);

    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    String[] daysOfWeek = {
        "SUNDAY",   "MONDAY", "TUESDAY",  "WEDNESDAY",
        "THURSDAY", "FRIDAY", "SATURDAY",
    };
    return daysOfWeek[dayOfWeek - 1];
  }

  public static void main(String[] args) {}
}
