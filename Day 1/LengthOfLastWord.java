public class LengthOfLastWord {
    public int LengthOfLastWordFromString(String s){
        String[] words = s.split(" ");
        String word = words[words.length - 1];
        int length = word.length();
        return length;
    }
    public static void main(String[] args) {
        LengthOfLastWord lolw = new LengthOfLastWord();
        lolw.LengthOfLastWordFromString("Hello This is Ayush!");
    }
}
