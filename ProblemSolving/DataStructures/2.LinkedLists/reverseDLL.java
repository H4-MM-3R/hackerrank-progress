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

  public static DoublyLinkedListNode revese(DoublyLinkedListNode llist) {
    DoublyLinkedListNode prevNode = null;
    DoublyLinkedListNode currNode = llist;
    DoublyLinkedListNode nextNode = null;

    /*
     * Initiallly:
     *
     * prevNode <-prev currNode next-> nextNode
     * prevNode next-> currNode <-prev nextNode
     * -------------------------
     * prevNode.next = currNode
     * currNode.next = nextNode
     * currNode.prev = prevNode
     * nextNode.prev = currNode
     *
     *
     * we want:
     * prevNode <-next currNode prev-> nextNode
     * prevNode prev-> currNode <-next nextNode
     * ------------------------
     * prevNode.prev = currNode
     * currNode.prev = nextNode
     * currNode.next = prevNode
     * nextNode.next = currNode
     */

    while (currNode != null) {
      nextNode = currNode.next;

      currNode.prev = nextNode;
      currNode.next = prevNode;

      prevNode = currNode;
      currNode = nextNode;
    }
    llist = prevNode;
    return llist;
  }
}
