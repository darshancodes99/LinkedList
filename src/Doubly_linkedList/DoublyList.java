package Doubly_linkedList;

//public class DoublyL {
//    public static void main(String[] args) {
//        DoublyList dl = new DoublyList();
//        dl.insertD(10);
//        dl.insertD(20);
//        dl.insertD(30);
//        dl.insertD(40);
//        dl.insertD(50);
//        dl.insertD(60);
//
//        dl.removeD(20);
//
//        dl.printD();
//        System.out.println();
//        dl.printRevD();
//    }
//}
public class DoublyList{
    Node head, tail;
    public void insertD(int value){
        Node nn = new Node(value);
        if (head == null){
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }

    public void removeD(int value){
        if (head == null){
            System.out.println("value not present");
            return;
        }
        if (head.value == value && head == tail){
            head = tail = null;
        } else if (head.value == value) {
            head = head.next;
            head.prev = null;
        } else {
            Node pre = head;
            while (pre.next != null && pre.next.value != value){
                pre = pre.next;
            }
            if (pre.next == null){
                System.out.println("value not present");
                return;
            }

            if (pre.next == tail){
                tail.prev = null;
                pre.next = null;
                tail = pre;
            }
            else {
                Node temp = pre.next;
                pre.next = pre.next.next;
                temp.next.prev = pre;
                temp.next = null;
                temp.prev = null;
            }

        }
    }

    public void printD(){
        if (head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }


    public void printRevD(){
        if (head == null){
            System.out.println("empty");
            return;
        }
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
    }
}

class Node {
    int value;
    Node next, prev;

    Node(int value){
        this.value = value;
    }
}