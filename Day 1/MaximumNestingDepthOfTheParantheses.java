public class MaximumNestingDepthOfTheParantheses {
    public int checkOpenParantheses(String s){
        int max = 0;
        int OpenBrackets = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                OpenBrackets++;
            }else if(c == ')'){
                OpenBrackets--;
            }
            max = Math.max(max, OpenBrackets);
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumNestingDepthOfTheParantheses mndotp = new MaximumNestingDepthOfTheParantheses();
        mndotp.checkOpenParantheses("(()())");
    }
}
