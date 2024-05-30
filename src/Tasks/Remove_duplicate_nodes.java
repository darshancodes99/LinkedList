package Tasks;

public class Remove_duplicate_nodes extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(6);
        ll.insert(6);
        ll.insert(6);
        ll.insert(7);
        ll.insert(7);

        removeDuplicate(ll.head);
        ll.print();

    }

    public static void removeDuplicate(Node head) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }
}
