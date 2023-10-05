import java.util.*;

public class test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();

    HashSet<Integer> s = new HashSet<>();
    int ans = 0;

    for (int i = 0; i < n; i++) {
      int num = in.nextInt();

      deque.add(num);
      s.add(num);

      if (deque.size() > m) {
        int removed = deque.remove();

        if (!deque.contains(removed)) {
          s.remove(removed);
        }
      }
      ans = Math.max(ans, s.size());
    }
    System.out.println(ans);
  }
}
