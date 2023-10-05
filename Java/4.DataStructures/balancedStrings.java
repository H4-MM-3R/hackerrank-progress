import java.util.*;

class Solution {

  public static void main(String[] argh) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String input = sc.next();
      boolean isBalanced = isBalanced(input);
      System.out.println(isBalanced);
    }

    sc.close();
  }

  // Helper method to check if a string is balanced
  private static boolean isBalanced(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false; // Closing bracket without a corresponding opening
                        // bracket
        }

        char top = stack.pop();
        if ((c == ')' && top != '(') || (c == '}' && top != '{') ||
            (c == ']' && top != '[')) {
          return false; // Mismatched brackets
        }
      }
    }

    return stack.isEmpty(); // If the stack is empty, all brackets are balanced
  }
}
