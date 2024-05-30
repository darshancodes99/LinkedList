package Doubly_linkedList;

public class Reverse_doublyList {
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.insertD(10);
        dl.insertD(20);
        dl.insertD(30);
        dl.insertD(40);
        dl.insertD(50);

        reverse(dl);
        dl.printD();
    }

    public static void reverse(DoublyList dl){
        Node temp = null;
        Node current = dl.head;

        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null){
            dl.tail = dl.head;
            dl.head = temp.prev;
        }
    }
}
