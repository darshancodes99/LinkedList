package Practice_circular_singly;

public class Swap_first_and_last_value extends SingleCircular {
    public static void main(String[] args) {
        SingleCircular sc = new SingleCircular();
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
        sc.add(50);

        Node pre = sc.head;
        while (pre.next.next != sc.head) {
            pre = pre.next;
        }

        pre.next.next = sc.head.next;
        Node temp = pre.next;
        pre.next = sc.head;
        sc.head = temp;
        pre.next.next = sc.head;

        sc.prints();

    }
}
