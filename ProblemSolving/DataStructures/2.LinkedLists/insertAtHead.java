import java.io.*;

class Result {
  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist,
                                                 int data) {
      SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
      temp.next = llist;
      llist = temp;
      return llist;
    }
  }
}
