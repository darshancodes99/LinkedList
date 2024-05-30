package Doubly_linkedList;

public class Find_sum extends DoublyList {
    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.insertD(10);
        dl.insertD(20);
        dl.insertD(20);
        dl.insertD(40);

        System.out.println( isPresent(40, dl.head,dl.tail));
    }

    public static boolean isPresent(int sum, Node head, Node tail){
        Node left = head;
        Node right = tail;

        while (left.value <= right.value){
            if (left.value + right.value == sum){
                return true;
            } else if (left.value + right.value < sum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return false;
    }
}
