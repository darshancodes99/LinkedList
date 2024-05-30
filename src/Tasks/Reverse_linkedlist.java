package Tasks;

public class Reverse_linkedlist extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);

        ll.head = reverseList(ll.head);
        ll.print();

    }

    public static Node reverseList(Node head) {
        if (head == null) {
            return head;
        }

        Node pre = null;
        Node current = head;
        Node nextNode = head.next;

        while (nextNode != null) {
            current.next = pre;
            pre = current;
            current = nextNode;
            nextNode = nextNode.next;
        }
        current.next = pre;

        return current;
    }
}
