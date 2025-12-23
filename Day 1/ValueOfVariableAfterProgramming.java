public class ValueOfVariableAfterProgramming {
    public int findValueOfProgrammableVariable(String[] Operations){
        int x = 0;
        for(int i = 0; i < Operations.length; i++){
            if(Operations[i].equals("X++") || Operations[i].equals("++X")){
                x++;
            }else if(Operations[i].equals("X--") || Operations[i].equals("--X")){
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        ValueOfVariableAfterProgramming vovap = new ValueOfVariableAfterProgramming();
        vovap.findValueOfProgrammableVariable(new String[]{"X++", "X--", "X--", "--X", "++X"});
    }
}
