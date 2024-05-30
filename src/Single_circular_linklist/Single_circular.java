package Single_circular_linklist;

public class Single_circular {
    public static void main(String[] args) {
        SingleCircular sc = new SingleCircular();
        sc.insert(10);
        sc.insert(20);
        sc.insert(30);
        sc.insert(40);
        sc.insert(50);
        sc.insert(60);

        sc.delete(40);
        sc.delete(10);
        sc.delete(20);
        sc.print();

        System.out.println();
    }
}

class SingleCircular {
    Node head;
    int size;

    public void insert(int value) {
        Node nextNode = new Node(value);
        if (head == null) {
            head = nextNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = nextNode;
            nextNode.next = head;
        }
        size++;
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        if (head.value == value && head.next == head) {
            head = null;
        } else if (head.value == value) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;

        } else {
            Node temp = head;
            while (temp.next != head && temp.next.value != value) {
                temp = temp.next;
            }
            if (temp.next == head) {
                System.out.println("value is not present");
                return;
            } else {
                temp.next = temp.next.next;
            }
        }

        size--;
    }

    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " ");
            temp = temp.next;
        } while (temp != head);
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}