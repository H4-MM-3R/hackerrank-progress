import java.io.*;

class Result {
  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
      this.data = data;
      next = null;
    }

    static SinglyLinkedListNode insertNodeAtPostion(SinglyLinkedListNode llist,
                                                    int data, int position) {
      int count = 1;

      SinglyLinkedListNode temp = llist;
      SinglyLinkedListNode node = new SinglylinkedListNode(data);

      while (count != position) {
        temp = temp.next;
        count++;
      }

      node.next = temp.next;
      temp.next = node;
      return llist;
    }
  }
}
