package Tasks;

public class LinkedList_loop_or_not extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.tail.next = ll.head;

        Node temp = ll.head;
        System.out.println(hasCycle(temp));
    }

    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
               return true;
            }
        }

        return false;
    }
}
