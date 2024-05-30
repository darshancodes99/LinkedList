package Tasks;

public class Remove_duplicates_unsorted {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(2);
        ll.insert(8);
        ll.insert(10);
        ll.insert(1);
        ll.insert(3);

        removeD(ll);
        ll.print();
    }

    public static void removeD(LinkedLists ll) {
        Node temp = ll.head;

        while (temp != null && temp.next != null) {
            Node current = temp;
            while (current.next != null) {
                if (current.next.value == temp.value) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            temp = temp.next;
        }
    }
}
