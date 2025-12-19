public class ConsecutiveCharacters {
    public int checkConsChar(String s){
        if(s.length() == 0 || s == null){
            return 0;
        }
        int streak = 1, mStreak = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                streak++;
            }else{
                streak = 1;
            }
            mStreak = Math.max(streak, mStreak);
        }
        return mStreak;
    }
    public static void main(String[] args) {
        ConsecutiveCharacters cc = new ConsecutiveCharacters();
        cc.checkConsChar("Leetcode");
        cc.checkConsChar("AYYUUUSSSSHHHHH");
    }
}
