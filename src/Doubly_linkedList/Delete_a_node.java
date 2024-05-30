package Doubly_linkedList;


public class Delete_a_node {
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.insertD(10);
        dl.insertD(20);
        dl.insertD(30);
        dl.insertD(40);
        dl.insertD(50);

        removeNode(dl.tail, dl);

        dl.printD();
        System.out.println();
        dl.printRevD();
    }

    public static void removeNode(Node p, DoublyList dl) {

        if (p.prev == null) {
            p = p.next;
            p.prev = null;
            return;
        }

        Node temp = p.prev;

        if (p.next == null) {
            p.prev = null;
            temp.next = null;
            dl.tail = temp;
            return;
        }

        temp.next = p.next;
        p.next.prev = temp;
    }
}
