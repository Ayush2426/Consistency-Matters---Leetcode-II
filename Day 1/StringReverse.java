public class StringReverse {
    public void reverseString(char[] s){
        int st = 0;
        int end = s.length - 1;

        while(st <= end){
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;

            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        sr.reverseString(new char[]{'a', 'b', 'c', 'd', 'e'});
    }
}
