public class IsSubsequence {
    public boolean  checkIfSubSequence(String s, String t){
        if(s == null || s.equals("")){
            return true;
        }
        int index = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(index) == t.charAt(i)){
                index++;
            }
            if(index == s.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();
        is.checkIfSubSequence("abc", "abcde");
        is.checkIfSubSequence("abc", "ayush");
    }
}
