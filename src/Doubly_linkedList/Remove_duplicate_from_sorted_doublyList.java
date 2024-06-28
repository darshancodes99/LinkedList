package Doubly_linkedList;

public class Remove_duplicate_from_sorted_doublyList {
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.insertD(1);
        dl.insertD(2);
        dl.insertD(3);
        dl.insertD(3);
        dl.insertD(4);
        dl.insertD(5);
        dl.insertD(6);
        dl.insertD(6);
        removeDuplicate(dl);

        dl.printD();
        System.out.println();
        dl.printRevD();
    }

    public static void removeDuplicate(DoublyList dl) {
        Node current = dl.head;
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                Node duplicate = current.next;
                current.next = duplicate.next;
                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                } else {
                    dl.tail = current;
                }
            } else {
                current = current.next;
            }
        }
    }
}
