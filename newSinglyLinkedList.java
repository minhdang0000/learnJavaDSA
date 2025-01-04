public class newSinglyLinkedList {
   private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
   }
   private static ListNode head;
   public static void display(){
      ListNode current = head;
      while (current!=null) {
        System.out.print(current.data + "->");
        current = current.next;
      }
      System.out.print("null");
   }
   public static int findLength(){
    int count = 0;
    ListNode current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
   }
   public static void main(String[] args) {
       newSinglyLinkedList ll = new newSinglyLinkedList();
       ll.head = new ListNode(1);
       ListNode second  = new ListNode(2);
       ListNode third = new ListNode(3);
       ListNode fourth = new ListNode(4);
       ListNode fifth = new ListNode(5);

       ll.head.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next = fifth;
       ll.display();
       System.out.println();
       System.out.println(ll.findLength());
   }
}
