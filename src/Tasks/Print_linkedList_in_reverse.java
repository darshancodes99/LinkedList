package Tasks;

import java.util.Stack;

public class Print_linkedList_in_reverse extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);

        Node temp = ll.head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.value);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();

        Node tempr = ll.head;
        ll.head = reverseInerate(tempr);
        ll.print();

    }



    public static Node reverseInerate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = preNode;

            //update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        return preNode;
    }

//   recursion
//    public static void reverse(Node head) {
//        if (head == null) {
//            return;
//        }
//        reverse(head.next);
//        System.out.print(head.value + " ");
//    }

}
