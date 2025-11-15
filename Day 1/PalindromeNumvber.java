public class PalindromeNumvber {
    public boolean checkPalindrome(int x){
        int sum = 0; int target = x;
        if(x < 0){
            return false;
        }
        while(x > 0){
            int temp = x % 10;
            x = x / 10;
            sum = sum * 10 + temp;
        }
        return sum == target ? true : false;
    }
    public static void main(String[] args) {
        PalindromeNumvber pn = new PalindromeNumvber();
        pn.checkPalindrome(121);
        pn.checkPalindrome(12211);
    }
}
