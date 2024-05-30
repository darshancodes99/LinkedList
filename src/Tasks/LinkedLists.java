package Tasks;


public class LinkedLists {
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
            while (prev != null && prev.next.value != value) {
                prev = prev.next;
            }
            if (prev == null) {
                System.out.println("value not present");
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