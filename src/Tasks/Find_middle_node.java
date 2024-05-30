package Tasks;

public class Find_middle_node extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.insert(70);

        Node temp = ll.head;
        findMid(temp);
    }

    public static void findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.value);
    }
}
