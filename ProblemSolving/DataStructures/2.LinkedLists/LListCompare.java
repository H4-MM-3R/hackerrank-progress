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

  static boolean compareLists(SinglyLinkedListNode head1,
                              SinglyLinkedListNode head2) {
    if (head1 == null && head2 == null)
      return true;

    if (head1 == null || head2 == null)
      return false;

    if (head1.data != head2.data)
      return false;

    return compareLists(head1.next, head2.next);
  }
}
