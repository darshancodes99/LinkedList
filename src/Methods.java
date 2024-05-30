public class Methods {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);

        System.out.println("before delete");
        ll.print();

        System.out.println("after delete");
        ll.delete(50);
        ll.print();

        System.out.println();
        System.out.println( "length : " + ll.length());

        ll.update(30, 50);
        ll.print();

        System.out.println(ll.find(20));

    }
}

class LinkedList {
    Node head, tail;

    public void insert(int value) {
        Node nextNode = new Node(value);
        if (head == null) {
            head = tail = nextNode;
        } else {
            tail.next = nextNode;
            tail = nextNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public int length(){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.value == value && head == tail) {
            head = tail = null;
        } else if (head.value == value) {
            head = head.next;
        } else {
            Node prev = head;
            while (prev.next != null && prev.next.value != value) {
                prev = prev.next;
            }
            if (prev.next == null) {
                System.out.println("value not present");
                return;
            }

            if (prev.next == tail) {
                tail = prev;
                tail.next = null;
            } else {
                prev.next = prev.next.next;
            }
        }
    }

    public void update(int oldValue, int newValue){
        Node temp = head;
        while (temp != null) {
            if(temp.value == oldValue){
                temp.value = newValue;
                break;
            }
            temp = temp.next;
        }
    }

    public boolean find(int value){
        Node temp = head;
        while (temp != null){
            if (temp.value == value){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
}


class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
