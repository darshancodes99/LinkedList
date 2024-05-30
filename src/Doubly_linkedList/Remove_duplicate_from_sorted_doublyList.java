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
        Node temp = dl.head;
        Node ex = dl.head;
        while (ex != null) {
            while (ex != null && ex.value == temp.value) {
                ex = ex.next;
            }
            if (ex == null) {
                temp.next = null;
                dl.tail = temp;
                return;
            }
            temp.next = ex;
            ex.prev = temp;
            temp = temp.next;
            ex = ex.next;
        }


    }
}
