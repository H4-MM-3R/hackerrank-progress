import java.util.*;

public class Solution {

  public static boolean canWin(int leap, int[] game) {
    // Return true if you can win the game; otherwise, return false.
    return canWin(0, leap, game);
    //
  }

  private static boolean canWin(int currIdx, int leap, int[] game) {
    if (currIdx < 0 || game[currIdx] == 1)
      return false;
    if (currIdx + 1 >= game.length || currIdx + leap >= game.length)
      return true;

    game[currIdx] = 1;

    boolean canWin = false;
    canWin =
        canWin(currIdx + leap, leap, game) || canWin(currIdx + 1, leap, game);
    return canWin;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }

      System.out.println((canWin(leap, game)) ? "YES" : "NO");
    }
    scan.close();
  }
}
