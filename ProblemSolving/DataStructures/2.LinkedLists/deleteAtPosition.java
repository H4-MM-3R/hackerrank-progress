import java.io.*;

class Result {
  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist,
                                                  int position) {
      if (llist == null)
        return null;

      if (position == 0)
        return llist.next;

      SinglyLinkedListNode temp = llist;
      int count = 1;
      while (count < position && temp.next != null) {
        temp = temp.next;
        count++;
      }
      if (temp.next == null || temp == null) {
        return llist;
      }
      temp.next = temp.next.next;
      return llist;
    }
  }
}
