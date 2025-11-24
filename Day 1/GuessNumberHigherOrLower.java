// public class GuessNumberHigherOrLower {
//     // int guess(int number);
//     public int guessNumber(int n){
//         int start = 0;
//         int end = n;

//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(guess(mid) == 0){
//                     return mid;
//             }else if(guess(mid) == 1){
//                 start = mid + 1;
//             }else{
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         GuessNumberHigherOrLower gnhol = new GuessNumberHigherOrLower();
//         gnhol.guessNumber(21);
//     }
// }
