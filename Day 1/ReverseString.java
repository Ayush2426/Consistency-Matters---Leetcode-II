public class ReverseString {
    public void reverseStringBinary(char[] s){
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reverseStringBinary(new char[]{'a', 'b', 'c'});
    }
}
