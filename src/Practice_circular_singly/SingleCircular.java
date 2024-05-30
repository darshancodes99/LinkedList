package Practice_circular_singly;

public class SingleCircular {
    Node head;
    int size;

    public void add(int value) {
        Node nn = new Node(value);
        if (head == null) {
            head = nn;
            head.next = head;

        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
        }
        size++;
    }

    public void remove(int value){
        if (head == null){
            System.out.println("empty");
            return;
        }
        if (head.value == value && head.next == head){
            head = null;
        } else if (head.value == value) {
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        } else {
            Node temp = head;
            while (temp.next != head && temp.next.value != value){
                temp = temp.next;
            }
            if (temp.next == head){
                System.out.println("value not present");
                return;
            }else {
                temp.next = temp.next.next;
            }
        }
        size--;
    }

    public void prints() {
        if (head == null){
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
