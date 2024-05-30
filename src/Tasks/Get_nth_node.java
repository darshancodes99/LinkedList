package Tasks;

public class Get_nth_node extends LinkedLists {
    public static void main(String[] args) {
        int n = 4;
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);

        Node temp = ll.head;
        int count = 1;
        while (temp != null) {
            if (count == n) {
                System.out.println(temp.value);
                break;
            }
            count++;
            temp = temp.next;
        }
    }
}
