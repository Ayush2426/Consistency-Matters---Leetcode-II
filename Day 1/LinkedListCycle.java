// public class LinkedListCycle {
//     public boolean checkCycle(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast.next != null && fast != null){
//             slow = slow.next;
//             fast = fast.next.next;

//             if(fast == slow){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         LinkedListCycle llc = new LinkedListCycle();
//         llc.checkCycle(null);
//     }
// }
