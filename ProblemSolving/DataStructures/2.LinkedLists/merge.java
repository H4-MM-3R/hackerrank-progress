import java.io.*;

class Result {
  public class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }
  }

  static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1,
                                         SinglyLinkedListNode head2) {
    SinglyLinkedListNode dummy = new SinglyLinkedListNode(9);
    SinglyLinkedListNode temp = dummy;

    while (head1 != null && head2 != null) {
      if (head1.data > head2.data) {
        temp.next = head2;
        temp = temp.next;
        head2 = head2.next;
      } else {
        temp.next = head1;
        temp = temp.next;
        head1 = head1.next;
      }
    }

    if (head1 != null)
      temp.next = head1;
    else if (head2 != null)
      temp.next = head2;
    return dummy.next;
  }
}
