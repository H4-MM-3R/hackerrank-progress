import java.io.*;

class Result {
  static class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    DoublyLinkedListNode(int data) {
      this.data = data;
      next = prev = null;
    }
  }

  public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist,
                                                  int data) {
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

    // Condition 1
    if (llist == null || llist.data > data) {
      newNode.next = llist;
      llist.prev = newNode;
      return newNode;
    }

    DoublyLinkedListNode temp = llist;
    while (temp.next != null && temp.next.data <= data)
      temp = temp.next;

    // Condition 2
    if (temp.next == null && temp.data <= data) {
      temp.next = newNode;
      newNode.prev = temp;
      return llist;
    }

    // Condition 3
    newNode.next = temp.next;
    newNode.prev = temp;
    temp.next.prev = newNode;
    temp.next = newNode;
    return llist;
  }
}
