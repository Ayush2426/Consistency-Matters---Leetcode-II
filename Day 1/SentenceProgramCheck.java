import java.util.HashSet;
import java.util.Set;
public class SentenceProgramCheck {
    public boolean checkSentenceProgram(String sentence){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        if(set.size() == 26){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        SentenceProgramCheck spc = new SentenceProgramCheck();
        spc.checkSentenceProgram("leetcode");
        spc.checkSentenceProgram("Day Thirty Three");
        spc.checkSentenceProgram("abcdefghijklmnopqrstuvwxyz");
    }
}
