// public class ReverseLinkedList {
//     public ListNode revLinkList(ListNode head){
//         ListNode prev = null;
//         while(head != null){
//             ListNode next = head.next;
//             head.next = prev;
//             prev = head;
//             head = next;
//         }
//         return prev;
//     }
//     public static void main(String[] args) {
//         ReverseLinkedList rll = new ReverseLinkedList();
//         rll.revLinkList(null);
//     }
// }
