import java.io.*;

class Result {
  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
      SinglyLinkedListNode prev = null;
      SinglyLinkedListNode curr = llist;
      SinglyLinkedListNode nxt = curr.next;

      while (nxt != null) {
        curr.next = prev;
        prev = curr;
        curr = nxt;
        nxt = nxt.next;
      }
      curr.next = prev;
      return curr;
    }
  }
}
