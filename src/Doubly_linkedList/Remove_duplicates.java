package Doubly_linkedList;

public class Remove_duplicates {
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.insertD(1);
        dl.insertD(2);
        dl.insertD(4);
        dl.insertD(5);
        dl.insertD(6);
        dl.insertD(3);
        dl.insertD(7);
        dl.insertD(2);
        dl.insertD(9);
        dl.insertD(9);
        dl.insertD(5);

        removeDuplicate(dl);
        dl.printD();
        System.out.println();
        dl.printRevD();
    }

    public static void removeDuplicate(DoublyList dl) {
        Node temp = dl.head;

        while (temp != null && temp.next != null) {
            Node curr = temp;
            while (curr.next != null) {
                if (curr.next.value == temp.value && curr.next.next != null) {
                    curr.next = curr.next.next;
                    curr.next.prev = curr;
                } else if (curr.next.value == temp.value) {
                    curr.next = null;
                    dl.tail = curr;
                } else {
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
    }
}
