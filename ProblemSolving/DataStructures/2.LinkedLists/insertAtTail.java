import java.io.*;

class Result {

  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }
  };

  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head,
                                               int data) {
    SinglyLinkedListNode temp = head;
    if (temp == null) {
      return new SinglyLinkedListNode(data);
    }

    while (temp.next != null)
      temp = temp.next;

    SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    temp.next = node;
    return head;
  };
}
