// public class IsBadVersion {
//     boolean isBadVersion(int mid);
//     public int checkBadVersion(int n){
//         int left = 0;
//         int right = n;
        
//         while(left < right){
//             int mid = left + (right - left) / 2;
//             if(isBadVersion(mid)){
//                 right = mid;
//             }else{
//                 left = mid + 1;
//             }
//         }
//         return left;
//     }
//     public static void main(String [] args){
//         IsBadVersion ibv = new IsBadVersion();
//         ibv.checkBadVersion(4);
//     }
// }
