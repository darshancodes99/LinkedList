package Tasks;

public class Get_nth_node_last extends LinkedLists {
    public static void main(String[] args) {
        int n = 4;
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);

        int find = ll.length() - n;
        int count = 0;
        Node temp = ll.head;

        while (temp != null) {
            if (count == find) {
                System.out.println(temp.value);
                break;
            }
            count++;
            temp = temp.next;
        }

    }
}
