// public class MiddleOfTheLinkedList {
//     public ListNode findMiddle(ListNode head){
//         ListNode fast = head;
//         ListNode slow = head;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public static void main(String[] args) {
//         MiddleOfTheLinkedList motll = new MiddleOfTheLinkedList();
//         motll.findMiddle(null);
//     }
// }
