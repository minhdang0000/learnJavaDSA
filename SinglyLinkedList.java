
// public class SinglyLinkedList {
//     private static class ListNode{
//         private int data;
//         private ListNode next;
//         public ListNode(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     private static ListNode head;
//     public static void main(String[] args) {
//             SinglyLinkedList sll = new SinglyLinkedList();
//             sll.head = new ListNode(10);
//             ListNode second = new ListNode(6);
//             ListNode third = new ListNode(9);
//             ListNode fourth = new ListNode(69);
    
//             sll.head.next = second;
//             second.next = third;
//             third.next = fourth;
//             ListNode current = head;
//             while (current != null) {
//                 System.out.print(current.data + "-->");
//                 current = current.next;
//             }
//             System.out.print("null");
//     }
// }

public class SinglyLinkedList {
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static ListNode head;
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}


