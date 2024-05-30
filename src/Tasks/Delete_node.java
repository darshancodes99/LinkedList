package Tasks;

public class Delete_node extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);


        Node temp = ll.head;
        removeP(temp);

        ll.print();

    }

    // in 0(1)
    public static void removeP(Node p) {
        p.value = p.next.value; // store next value
        p.next = p.next.next; // store next to next value's address
    }


}
