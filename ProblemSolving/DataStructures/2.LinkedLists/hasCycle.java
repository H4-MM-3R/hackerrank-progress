import java.io.*;

class Result {
  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }
  }

  public static boolean hasCycle(SinglyLinkedListNode head) {
    if (head == null || head.next == null)
      return false;

    SinglyLinkedListNode fastPtr = head;
    SinglyLinkedListNode slowPtr = head;

    if (fastPtr == slowPtr)
      return true;

    return false;
  }
}
