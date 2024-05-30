package Doubly_linkedList;

public class Insert_in_sorted_doublyList {
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        insertSorted(1, dl);
        insertSorted(1, dl);
        insertSorted(0, dl);
        insertSorted(0, dl);
        insertSorted(1, dl);
        insertSorted(1, dl);
        insertSorted(2, dl);
        insertSorted(1, dl);
        insertSorted(3, dl);
        insertSorted(-1, dl);
        insertSorted(4, dl);
        insertSorted(2, dl);

        dl.printD();
    }

    public static void insertSorted(int value, DoublyList dl) {
        Node nn = new Node(value);

        if (dl.head == null) {
            dl.head = nn;
            dl.tail = nn;
        } else if (dl.head.value >= value) {
            dl.head.prev = nn;
            nn.next = dl.head;
            dl.head = nn;
        } else if (dl.tail.value <= value) {
            dl.tail.next = nn;
            nn.prev = dl.tail;
            dl.tail = nn;
        } else {
            Node temp = dl.head;
            while (temp.next.value < value) {
                temp = temp.next;
            }

            Node lastTemp = dl.tail;
            while (lastTemp.prev.value >= value) {
                lastTemp = lastTemp.prev;
            }

            temp.next = nn;
            nn.prev = temp;
            nn.next = lastTemp;
            lastTemp.prev = nn;
        }
    }
}
