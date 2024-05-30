package Tasks;

public class LinkedList_loop_count extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.tail.next = ll.head.next.next;

        Node temp = ll.head;
        System.out.println(hasCycle(temp));

    }

    public static int hasCycle(Node head) {
        if (head == null){
            System.out.println("empty");
            return 0;
        }
        Node slow = head;
        Node fast = head.next;
        int count = 0;

        while (slow != fast && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow.next != fast){
            slow = slow.next;
            count++;
        }

        return count;
    }
}
