import java.io.*;
import java.util.HashSet;

class Result {
  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }
  }

  public static SinglyLinkedListNode
  removeDuplicates(SinglyLinkedListNode llist) {
    if (llist == null || llist.next == null)
      return llist;

    HashSet<Integer> mp = new HashSet<>();

    SinglyLinkedListNode mainptr = llist;
    SinglyLinkedListNode refptr = llist;

    while (mainptr != null) {
      if (mp.contains(mainptr.data)) {
        refptr.next = mainptr.next;
      } else {
        mp.add(mainptr.data);
        refptr = mainptr;
      }
      mainptr = mainptr.next;
    }
    return llist;
  }
}
