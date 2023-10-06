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

  public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    SinglyLinkedListNode mainptr = llist;
    SinglyLinkedListNode refptr = llist;

    for (int i = 0; i < positionFromTail; i++) {
      if (refptr == null)
        return -1;

      refptr = refptr.next;
    }
    while (refptr.next != null) {
      mainptr = mainptr.next;
      refptr = refptr.next;
    }
    return mainptr.data;
  }
}
